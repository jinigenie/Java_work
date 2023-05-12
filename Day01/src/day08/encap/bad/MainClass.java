package day08.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		// public 변수로 하면 잘못된 값이 저장될 수 있음
		me.day = 32;
		me.month = 100;
		me.year = 2023;
		me.ssn = "???";
		
		me.info();
	}
}
