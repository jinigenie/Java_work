package day10.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1-a: " + c1.a);
		System.out.println("c1-b: " + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("c2-a: " + c2.a);
		System.out.println("c2-b: " + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("c3-a: " + c3.a);
		System.out.println("c3-b: " + c3.b);

		System.out.println("c1-b: " + c1.b); // 3
		
		System.out.println("=======================");
 
		/*
		 * static은 클래스 밖에 하나로 생성되므로, 
		 * 객체 생성 없이 클래스명.변수명 으로 사용 권장
		 */
	
		Count.b = 10;
		Count.b++;
		System.out.println(Count.b);
		
		
	}
}
