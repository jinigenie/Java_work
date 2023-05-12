package day02;

public class DataType {
	public static void main(String[] args) {
		
		// 정수형 타입
		byte a = 127; // -128~127
		short b = 32767; // -32768~32768
		int c = 2147483647; // -(2^15)~(2^15-1)
		long d = 2L; // int가 기본이므로 L 붙여주기 
		
		// 2진수, 8진수, 16진수
		int x = 0b10; // 2진수는 앞에 0b 붙이기
		System.out.println("2진수 10: " + x);
		x = 010; // 8진수는 앞에 0 붙이기
		System.out.println("8진수 10: " + x);
		x = 0x10; // 16진수는 앞에 0x 붙이기
		System.out.println("16진수 10: " + x);
		
		System.out.println("-------------------");
		
		// 실수형 타입
		float f1 = 3.14f; // double이 기본이므로 f 붙여주기
		double d1 = 3.14; 
		System.out.println(f1 + "\n" + d1);
		
		float f2 = 3.14159277777f;
		double d2 = 3.14159277777;
		System.out.println(f2 + "\n" + d2);
		
		System.out.println("-------------------");
		
		// 논리형 타입
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 + "\n" + bool2);
		
	}
}
