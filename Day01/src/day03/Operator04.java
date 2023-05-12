package day03;

public class Operator04 {
	public static void main(String[] args) {
		
		// 복합 대입 연산자
		int a = 6; 
		int b = 5;
		
		a += 3; // a = a + 3
		b =+ 3; // b = +3
		System.out.println("a: " + a + " , b: " + b);
		
		a -= 4; // 5
		a *= 10; // 50
		a /= 5; // 10
		a %= 2; // 0
		System.out.println("a: " + a);
		
	}
}
