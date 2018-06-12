package sync;

public class Account {
	int balance;

	public Account() {
		balance = 5000;
	}

	public synchronized  void withdraw(int bal) {
		try {
			Thread.sleep(1000);
		} catch (Exception ex) {
			System.out.println("EXCEPTION OCCURED.." + ex);
		}
		balance = balance - bal;
		System.out.println("Balance remaining:::" + balance);
	}
}
