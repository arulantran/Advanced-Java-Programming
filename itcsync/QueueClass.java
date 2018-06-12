package itcsync;

public class QueueClass {
	int number;
	boolean valueset = false;

	synchronized int get() {
		if (!valueset)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println("Got: " + number);
		valueset = false;
		notify();
		return number;
	}

	synchronized void put(int number) {
		if (valueset)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.number = number;
		valueset = true;
		System.out.println("Put: " + number);
		notify();
	}
}
