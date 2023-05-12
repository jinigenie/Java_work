package day02;

public class Operator01 {
	public static void main(String[] args) {
		
		// 부호연산자 +, -
		int i = -3;
		int j = -i; 
		System.out.println(j);
	
		System.out.println("-----------------------");
		
		// 증감연산자 ++, --
		int k = 1;
		int h = ++k; // 전위연산
		System.out.println("k: "+ k + ", h: " + h);
		
		int x = 1;
		int y = x++; // 후위연산
		System.out.println("x: "+ x + ", y: " + y);

		System.out.println("-----------------------");
		
		// ~연산자
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b + 1); // 10의 보수
		
		System.out.println("-----------------------");
		
		// 논리연산자
		boolean bool = !true;
		System.out.println(bool);
		
	}
}
