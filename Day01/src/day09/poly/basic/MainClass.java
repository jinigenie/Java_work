package day09.poly.basic;

public class MainClass {
	public static void main(String[] args) {

		Child c = new Child();
		c.method01();
		c.method02();
		c.method03();
		
		System.out.println("\n------다형성 적용(형변환)------\n");
		
		// Parent 클래스 기능을 사용하게 됨 
		// 단, Child 클래스의 오버라이드 된 메소드 실행
		Parent p = c;
		p.method01();
		p.method02();
		
		System.out.println(p == c); // true
		
		System.out.println("\n-----클래스 강제 형변환-----\n");
		// 원본이 child로 생성됐으면, 강제 형변환 가능
		
		Parent pp = new Child();
		System.out.println(pp); // child로 만들어진 것 확인 가능
		
		Child cc = (Child)pp;
		cc.method01();
		cc.method02();
		cc.method03();
		
		//주의사항 -> 다형성 적용되었던 객체만 강제 형변환이 가능
		Object obj = new Object();
//		Child ccc = (Child)obj; //실행도중 error
		
		System.out.println("\n------형변환의 또다른 예시-----\n");
		
		String str = "홍길동";
		Object o = str;
		
		String res = (String)o;
		System.out.println(o);
		
	}
}
