package sample;

public class ThreadDemo extends Thread {
	public void run() {
		for (int counter = 1; counter <= 100; counter++) {
			System.out.println("thread is running..." + counter);
		}
	}

	public static void main(String args[]) {
		ThreadDemo threadDemo = new ThreadDemo();
		threadDemo.start();
	}
}
