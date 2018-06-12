package sync;

public class SyncMain {
	public static void main(String args[]) {
		Account a1 = new Account();
		Customer c1 = new Customer(a1);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
	}
}
