package session_08_02;

public class MyThread1 extends Thread{
	
	private Account a;
	public MyThread1(Account a) {
		super();
		this.a = a;
	}
	
	public void run() {
		try {
			a.deposite(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
