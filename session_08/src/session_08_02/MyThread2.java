package session_08_02;

public class MyThread2 {
	
	private Account a;
	public MyThread2(Account a) {
		super();
		this.a = a;
	}
	
	public void run() {
		try {
			a.deposite(7000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}