package session_05;

public class Date {

	private int dd,mm,yyy;
	
	public Date() {
		
	}

	public Date(int dd, int mm, int yyy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yyy = yyy;
	}

	
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyy=" + yyy + "]";
	}
	
	/*public static void swapDates(Date d1,Date d2)
	{
		System.out.println("Swapping Dates-->");
		Date temp;
		temp = d1;
		d1 = d2;
		d2 = temp;
	}*/
	
	public static void swapDates(Date d[])
	{
		System.out.println("Swapping Dates-->");
		Date temp;
		temp = d[0];
		d[0] = d[1];
		d[1] = temp;
	}
	public static void main(String[] args) {
		
		Date[] d = new Date[2];
		Date d1 = new Date(15,2,2024);
		Date d2 = new Date(16,1,2023);
		d[0] = d1;
		d[1] = d2;
		System.out.println("Before Swapping--> ");
		System.out.println("d1 = "+d[0]);
		System.out.println("d2 = "+d[1]);
		Date.swapDates(d);
		System.out.println("After Swapping--> ");
		System.out.println("d1 = "+d[0]);
		System.out.println("d2 = "+d[1]);
		
		
	}
}
