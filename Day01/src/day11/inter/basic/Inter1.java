package day11.inter.basic;

public interface Inter1 {

	// public static final로 자동 상수 취급 -> 초기값 필수
	int A = 10; 
	
	// public abstract로 자동 추상메소드 -> 일반 메소드 선언 불가
	void method01(); 
	
	// 인터페이스에는 static, default 메소드 선언 가능
	public static void method04() {
		System.out.println("static method");
	}
	
	public default void method05() {
		System.out.println("default method");
	}
	
	
}
