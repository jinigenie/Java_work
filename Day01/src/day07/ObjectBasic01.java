package day07;

public class ObjectBasic01 {

	public static void main(String[] args) {
		System.out.println("=====1번 계산기=====");
		Calculator cal1 = new Calculator();
		cal1.add(10);
		cal1.add(20);
		cal1.add(30);
		System.out.println(cal1.res);
		
		System.out.println("=====2번 계산기=====");
		Calculator cal2 = new Calculator();
		cal2.add(100);
		cal2.add(200);
		cal2.add(300);
		System.out.println(cal2.res);
		
	}
}
