
public class Addition {
	
	//Method Overloading

	public void add(int a, int b) {
		System.out.println("Sum = " + (a+b));
	}
	
	public float add(float a, float b) {
		float f = a + b;
		return f;
	}
	
	public int add(int a, int b, int c) {
		return (a+b+c);
	}
	
	public int add(int...a) {
		int sum =0;
		int len = a.length;
		System.out.println("Length = " + len);
		
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
	
	
	public static void main(String []args) {
		Addition a = new Addition();
		a.add(4, 5);
		System.out.println("Sum = " + a.add(23.4f, 5.6f));
		System.out.println("Sum = " + a.add(4,5,6));
		int addition = a.add(1,2,5,8,9);
		System.out.println("Addition = " + addition);
		
	}
}
