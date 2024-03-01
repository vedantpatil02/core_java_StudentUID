package session_07;

public class Test1 {
	
	public static void main(String [] args) {
		try
		{
			int c = 0;
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("c = " + c);
			
		}
		catch(NumberFormatException e)
		//Exception e = new ArithmeticException();	
		{
			System.out.println("Enter only integer values");
		}
		catch(ArrayIndexOutOfBoundsException e)
		//Exception e = new ArithmeticException();	
		{
			System.out.println("Enter at least 2 values");
		}
		catch(ArithmeticException e)
		//Exception e = new ArithmeticException();	
		{
			System.out.println("Denominator Should not be zero");
		}
		catch(Exception e)
		//Exception e = new ArithmeticException();	
		{
			System.out.println("Exception occured!!!");
		}
			
	}	

}
