package session_08_02;

public class Test {
	
	public static void main(String[] args) throws InterruptedException{
		
		Account a = new Account();
		MyThread1 t1 = new MyThread1(a);
		MyThread1 t2 = new MyThread1(a);
		t1.start();
		t2.start();
		Thread.currentThread().sleep(1000);
		a.getBalance();
		
		
		
		
	}

}
