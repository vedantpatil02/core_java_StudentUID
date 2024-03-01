package session_06;

public class Test {

	public static void main(String [] args) {
		
//		BOI b = new BOI();
//		System.out.println("BOI = " + b.getROI());
		
		//polymorphic reference 
		//superclass reference = new child_class object();
//		Bank b1 = new SBI(); 
//		System.out.println("SBI = " + b1.getROI());
		
		Bank b = new BOI(); 
		System.out.println("SBI = " + b.getROI());
	}
}
