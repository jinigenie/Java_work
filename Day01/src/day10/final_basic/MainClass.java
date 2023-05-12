package day10.final_basic;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍길동");
		// p1.nation = "미국"; error
		System.out.println(p1.ssn);
		
		Person p2 = new Person("456456", "이순신");			
		System.out.println(p2.ssn);
		
		// 상수 사용
		System.out.println(Contant.O2);
		
	}
}
