package day08.modi.member.pac1;

public class A {
	
	//사용
	A a = new A(); // public
	A a2 = new A(1); // default
	A a3 = new A("홍길동"); // private
	
	//생성자
	public A(){
		// 클래스 내의 멤버변수 및 메소드 사용 가능
		this.var1 = 0;
		this.var2 = 0;
		this.var3 = 0;
		
		method1();
		method2();
		method3();
	}
	A(int i){}
	private A(String s){}
	
	//멤버변수&메소드
	public int var1;
	int var2;
	private int var3;
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
