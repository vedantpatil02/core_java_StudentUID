package p1;

public class Test {
	
	public static void main(String[] args) {
		int a = 100;
		
		//boxing
		Integer i = new Integer(a);
		System.out.println(i);
		
		//unboxing
		int b = i.intValue();
		
		
		String str = "30";
		int c = Integer.parseInt(str);
		
		int d= 100;
		Integer j = d;//auto-boxing
		int e = j;//auto unboxing
		
	}

}
