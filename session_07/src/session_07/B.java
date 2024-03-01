package session_07;

public class B {

	public static void main(String [] args) {
		A a = new A();
		double div = a.div(2, 5);
		System.out.println("div = " + div);
		if(div<1) {
			try {
				throw new MyException();
			}
			catch  (MyException e) {
				System.out.println(e);
			}
		}
	}
}
