package session_08_02;

public class Account {

	private int balance;
	public Account() {
		balance = 5000;
	}
	
	public synchronized void deposite(int amount) throws InterruptedException{
		System.out.println("Thread name = " + Thread.currentThread().getName());
		int temp;
		temp = balance + amount;
		Thread.currentThread().sleep(500);
		balance = temp;
		System.out.println(Thread.currentThread().getName() + " " + balance);
	}
	
	public void getBalance() {
		 	System.out.println("Account balance = " + balance);
	}
}
