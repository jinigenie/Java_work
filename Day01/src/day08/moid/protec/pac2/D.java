package day08.moid.protec.pac2;
import day08.moid.protec.pac1.A;

public class D extends A {

	public D() {
		// super를 통해 접근 가능
		super();
		super.bool = true;
		super.method();
	}
	
	// 오버라이딩 가능
	protected void method() {}
	
}
