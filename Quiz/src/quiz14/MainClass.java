package quiz14;

public class MainClass {
	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		
		System.out.println("=====m1 test=====");
		m1.location();
		m1.move(3, 4);
		m1.move(2, 5);
		
		System.out.println("=====m2 test=====");
		m2.location();
		m2.move(-3, -4);
		m2.move(1, -2);
	}
}
