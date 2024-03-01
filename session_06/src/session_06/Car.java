package session_06;

public class Car extends Vehicle{

	private String modelName = "Tata Harrier";
	
	public static void main(String args[] ) {
		Car c = new Car();
		System.out.print("Brand = " + c.brand);
		c.honk();
		System.out.println("Model Name = " + c.modelName);
	}
}
