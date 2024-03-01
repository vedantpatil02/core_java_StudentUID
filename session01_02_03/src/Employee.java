
public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee() {
		System.out.println("Defalut COnstructor called");
		empId = 11;
		empName = "Rahul";
		empSalary = 21000.67d;
	}
	
	public Employee(int i, String n, double d) {
		System.out.println("Parameterized Constrictor called");
		empId = i;
		empName = n;
		empSalary = d;
		
	}
	
	public String toString() {
		return "Employee = " + empId + " " + empName + " " + empSalary;
	}
	
	public static void main(String [] args) {
		Employee  e = new Employee();
		
		System.out.println(e);
		Employee e1 = new Employee(222, "Vishal", 56213.89d);
		System.out.println(e1);
	}
}
