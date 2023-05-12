package poly.basic;

/*
 * 하나의 자바 파일에는 여러 클래스 선언 가능
 * 단, 파일명과 동일한 클래스가 있어야 하고, 해당 클래스만 public이면 됨
 */

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}


public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	A a5 = new B(); // 한 줄로 표현 : B -> A 변환
	
	//Object타입은 모든 클래스 저장 가능
	Object o1 = a;
	Object o2 = "문자열";
	Object o3 = 1;
	Object o4 = new B();
	
	

}
