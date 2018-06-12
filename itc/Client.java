package itc;

public class Client implements Runnable {
	QueueClass queueClass;

	Client(QueueClass queueClass) {
		this.queueClass = queueClass;
		new Thread(this, "Client").start();
	}

	public void run() {
		while (true) {
			queueClass.get();
		}
	}
}
