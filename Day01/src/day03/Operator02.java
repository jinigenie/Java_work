package day03;

public class Operator02 {
	public static void main(String[] args) {

		// 산술연산자
		System.out.println(7 / 3); 
		System.out.println(7 % 3); 
		System.out.println(7 * 3); 
		
		// 비교연산자
		int i = 20;
		int j = 11;
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i % 2 != 0); // i가 홀수?
		System.out.println(i % 2 == 1); // i가 홀수?
		
		// 비트연산자
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		System.out.println(a & b); // 0000 0001
		System.out.println(a | b); // 0000 0111
		System.out.println(a ^ b); // 0000 0110
		
		// 비트쉬프트
		int h = 100; // 0000 0110 0100
		System.out.println(h << 2); // 0001 1001 0000
		
		
		
	}
}
