package core_java_T2406080334;

public class Employee {

	private int empNo;
	private float salary;
	private static float totalSalary;
	private static int count;
	
	public Employee(float salary) {
		count++;
		this.empNo = count;
		this.salary = salary;
		totalSalary += salary;
		
	}
	
	public static void display() {
		System.out.println("Total employees = " + count + " total salary = " + totalSalary);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(45621.2f);
		Employee e2 = new Employee(65423.1f);
		Employee e3 = new Employee(65842.1f);
		System.out.println(e2.empNo);
		Employee.display();
		
	}
	 
}
