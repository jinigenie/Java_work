package day07;

public class Variable {

	//멤버변수
	int a = 10; // 선언과 동시에 초기화 가능
	String b;
	
	void printNum(int d) {
		int c = 30; // 지역변수
		
		System.out.println("멤버변수: " + a);
		System.out.println("멤버변수: " + b);
		System.out.println("지역변수: " + c);
		System.out.println("매개변수(지역변수): " + d);
		
	}
	
	
}
