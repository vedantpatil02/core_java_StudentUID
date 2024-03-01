package session_04;

//Containment

public class Employee {

	private int empId;
	private String empName;
	private Date dt_of_joining;
	
	public Employee(int empId , String empName, Date dt_of_joining) {
		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
		
	}
	
	public String toString() {
		return "Employee [empId = " + empId + "," + "empName =" + empName + ", dt_of_joining = " +dt_of_joining + "]"; 
	}
	
	public static void main(String [] args) {
		Employee e = new Employee(111, "Rahul" , new Date(13,2,2024));
		System.out.print(e);
	}
}
