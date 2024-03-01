package session_08;

public class Thread1 extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		Thread1 t3 = new Thread1();
		t2.setPriority(10);
		t1.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
}
