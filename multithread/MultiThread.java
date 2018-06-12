package multithread;

public class MultiThread {
	public static void main(String args[]) {
		DemoThread t1 = new DemoThread("One");
		DemoThread t2 = new DemoThread("Two");
		DemoThread t3 = new DemoThread("Three");
		System.out.println("Thread One is alive: " + t1.thread.isAlive());
		System.out.println("Thread Two is alive: " + t2.thread.isAlive());
		System.out.println("Thread Three is alive: " + t1.thread.isAlive());
		try {
			System.out.println("Waiting for child threads to finish");
			t1.thread.join();
			t2.thread.join();
			t3.thread.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread One is alive: " + t1.thread.isAlive());
		System.out.println("Thread One is alive: " + t1.thread.isAlive());
		System.out.println("Thread One is alive: " + t1.thread.isAlive());
		System.out.println("Main thread exiting");
	}
}
