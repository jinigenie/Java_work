package quiz09;

public class MainClass {
	public static void main(String[] args) {
		
		SuperSonicAp ss = new SuperSonicAp("air");
		
		ss.fly();
		System.out.println(ss.info());
		
		ss.flyMode = 1;
		
		ss.fly();
		System.out.println(ss.info());
	}
}
