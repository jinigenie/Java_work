package day08.moid.protec.pac1;

public class A {

	/*
	 * protected는 같은 패키지에서만 접근 가능
	 * 단, 다른 패키지여도 상속관계에서 super 키워드 참조 가능
	 */
	
	// 멤버변수
	protected boolean bool;
	
	// 생성자
	protected A() {}
	
	// 메소드
	protected void method() {}
	
}
