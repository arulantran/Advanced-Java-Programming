package itc;

public class Developer implements Runnable {
	QueueClass queueClass;

	Developer(QueueClass queueClass) {
		this.queueClass = queueClass;
		new Thread(this, "Developer").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			queueClass.put(i++);
		}
	}
}
