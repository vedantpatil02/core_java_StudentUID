package session_07;

public class Test {

	public static void main(String [] args) {
		try
		{
			int c = 0;
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("c = " + c);
			
		}
		catch(Exception e)
		//Exception e = new ArithmeticException();	
		{
			System.out.println(e.getMessage());
		}
			
	}	
	
}
