package day10.final_basic;

// final 클래스는 상속 불가
public class Child extends Parent {
	
	public void method01() {
		this.method02();
	}
	
	/* final 메소드는 오버라이드 불가
	public void method02() {
		
	}
	*/
}
