package day11.inter.basic;

public class MainClass {
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method01(); // Override
		b.method02(); // Override
		b.method03(); // 자기자신 메소드
		
		System.out.println("=====================");
		
		// 인터페이스 데이터타입
		Inter1 i1 = new Basic();
		i1.method01(); // Inter1의 메소드만 사용 가능
		
		System.out.println("=====================");
		
		Inter2 i2 = new Basic();
		i2.method02(); // Inter2의 메소드만 사용 가능
		
		System.out.println("=====================");
		
		// 인터페이스에서도 클래스 캐스팅 가능
		Basic bb = (Basic)i2;
		bb.method01();
		bb.method02();
		bb.method03();
		
		// static 메소드의 사용
		Inter1.method04();
		
		// default 메소드의 사용
		bb.method05();
		
	}
}
