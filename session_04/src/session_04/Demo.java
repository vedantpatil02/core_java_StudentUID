package session_04;

public class Demo {

	public enum Seasons{SUMMER , WINTER, AUTUM};
	
	
	public static void main(String [] args) {
		
		Seasons s = Seasons.SUMMER;
		System.out.println(s);
		
		
		for(Seasons s1: Seasons.values()) {
			System.out.println(s1 + " " + s1.ordinal());
		}
	}
}
