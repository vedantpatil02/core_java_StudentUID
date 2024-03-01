package session_07;

import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {

	public static void main(String [] args) throws IOException{
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("d://mno.txt", true);
			
			String str = "JSPM Batch 02";
			byte [] b = str.getBytes();
			fos.write(b);
			System.out.println("Success");
			
		}
		catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally Block");
			fos.close();
		}
	}
}
