package day11.inter.basic;

public class Basic implements Inter1, Inter2 {

	// 인터페이스의 추상메소드는 반드시 오버라이딩 필요
	public void method01() {
		System.out.println("재정의된 1번 메소드");
	}
	
	public void method02() {
		System.out.println("재정의된 2번 메소드");
	}
	
	public void method03() {
		System.out.println("새로 생성한 3번 메소드");
	}
	
}
