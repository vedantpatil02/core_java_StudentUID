
public class MyDate {
	
	private int dd, mm, yy;
	
	public void intiDate() {
		dd = mm = yy = 1;
	}
	
	public void setDate(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	
	public void displayDate() {
		System.out.println("[" + dd + "/" + mm + "/" + yy + "]");
	}

	public static void main(String[]args) {
	    MyDate d = new MyDate();
	    System.out.println(d.dd);
	    d.intiDate();
	    d.displayDate();
	    d.setDate(6, 2, 2024);
	    d.displayDate();
	}
}
