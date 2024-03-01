package session_04;

public class Date {
	
	private int dd,mm,yy;
	private final float PI;

	public Date(int dd, int mm, int yy) {
		PI = 3.14f;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		
	}
	
	
	public String toString() {
		return "Date [dd = " + dd + ", mm = " + mm + ", yy = " + yy + "]";
	}
	
	public static void main(String args[]) {
		
		
		final Date bdate = new Date(1,1,8);
		
		
	}
	
	
}

// Final keyword is declared at the time of initialization or in the constructor