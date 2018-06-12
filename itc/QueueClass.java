package itc;

public class QueueClass {
	int number;

	synchronized int get() {
		System.out.println("Got: " + number);
		return number;
	}

	synchronized void put(int number) {
		this.number = number;
		System.out.println("Put: " + number);
	}
}
