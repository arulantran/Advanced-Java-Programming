package sync;

public class Customer implements Runnable {
	Account obj;

	public Customer(Account a){
	obj=a;
	}

	public void run() {
		obj.withdraw(500);
	}

}
