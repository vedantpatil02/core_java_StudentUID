package session_06;

public class B extends A {
	
	public B() {
		System.out.println("Default Constructor of class B");
	}
	
	public B(int a) {
		super(10);
		System.out.println("Parameterized Constructor of class B");
	}
	
	public static void main(String [] args) {
		B b = new B(10);
	}

}
