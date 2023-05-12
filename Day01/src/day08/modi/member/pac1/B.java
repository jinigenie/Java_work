package day08.modi.member.pac1;

public class B {

	//사용
	A a = new A(); // public
	A a2 = new A(1); // default
//	A a3 = new A("홍길동"); // private
	
	public B() {
		a.var1 = 1; // public
		a.var2 = 2; // default
//		a.var3 = 3; // private
		
		a.method1(); // public
		a.method2(); // default
//		a.method3(); // private
	}
	
}
