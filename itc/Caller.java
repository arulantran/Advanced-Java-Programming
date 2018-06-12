package itc;

public class Caller {
	public static void main(String args[]) {
		QueueClass queueClass = new QueueClass();
		new Developer(queueClass);
		new Client(queueClass);
		System.out.println("Press Control-C to stop");
	}
}
