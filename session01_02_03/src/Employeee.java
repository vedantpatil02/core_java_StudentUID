//Static
public class Employeee {

	private int empId;
	private String empName;
	private float empSalary;
	private static int count;
	
	public Employeee(){
		
	}
	
	public Employeee(int empId, String empName, float empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String toString() {
		return "Employee [empId = " + empId + ", " + "empName =" + empName + ", " + "empSalary = " + empSalary + "] "; 
	}
	
	static {
		System.out.println("static called");
		count = 60;
	}
	
	public static void main(String [] args) {
		Employeee e1 = new Employeee(111, "Rahul", 56459.5f);
		System.out.println(e1 + "Count =" + e1.getCount());
		Employeee e2 = new Employeee(222, "Virat", 98656.5f);
		System.out.println(e2 + "Count =" + e1.getCount());
		System.out.println("Employee count = " + Employeee.getCount());
		
		
	}
}
