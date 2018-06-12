package runnable;

import sample.ThreadDemo;

public class ThreadDemo2 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ThreadDemo threadDemo = new ThreadDemo();
		Thread t1 = new Thread(threadDemo);
		t1.start();
	}
}