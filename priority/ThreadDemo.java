package priority;

public class ThreadDemo implements Runnable {
	public void run() {
		for (int counter = 1; counter <= 100; counter++) {
			System.out.println(Thread.currentThread().getName() + "thread is running..." + counter);
		}
	}

	public static void main(String args[]) {
		ThreadDemo threadDemo = new ThreadDemo();
		Thread t1 = new Thread(threadDemo, "First");
		t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(threadDemo, "Second");
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}
}