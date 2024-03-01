package session_08;

import java.util.Iterator;

public class MyThread extends Thread{
	
	public void run(){
		
		//System.out.println("Current Thread = " + Thread.currentThread().getName());
		
		for(int i =0; i<=5; i++) {
			try {
				Thread.currentThread().sleep(500);
			}catch(InterruptedException e){
				
				e.printStackTrace();
				
			}
			System.out.println("Current Thread = " + Thread.currentThread().getName()+ "ID = " + Thread.currentThread().getId());
		}
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
