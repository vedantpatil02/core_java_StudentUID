
public class Demo {

	private int day, month, year;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int d) {
		day = d;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int d) {
		month = d;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int d) {
		year = d;
	}
	
	
	
	public static void main(String[] args) {
		Demo a = new Demo();
		a.setDay(7);
		System.out.println("Day = " + a.getDay());
		a.setMonth(2);
		System.out.println("Month = " + a.getMonth());
		a.setYear(2024);
		System.out.println("Year = " + a.getYear());
	}
}
