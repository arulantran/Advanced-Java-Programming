package sample;

public class ThreadDemo1 extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		ThreadDemo1 threadDemo = new ThreadDemo1();
		threadDemo.start();
		//System.out.println("End of Main");
	}
}
