package day10.static_.method;

public class Count {

	public int a;
	public static int b;
	
	// 일반 메소드 - 일반멤버, 정적멤버 모두 사용 가능
	public int method01() {
		a = 10;
		b++;
		
		return b;
	}
	
	// 정적 메소드 - 정적멤버 사용 가능
	public static int method02() {
		// a = 10; -> error 
		Count c = new Count();
		c.a = 10; // 객체 생성한 후, 접근하여 사용 가능
		b++;
		return b; 
	}
	
}
