package multithread;

public class DemoThread implements Runnable {
	String name;
	Thread thread;

	DemoThread(String threadname) {
		name = threadname;
		thread = new Thread(this, name);
		System.out.println("New Thread: " + thread);
		thread.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + "Exiting");
	}
}
