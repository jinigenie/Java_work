package day02;

public class Casting01 {
	public static void main(String[] args) {
		
		byte a = 10;
		short s = a; // byte -> short 자동형변환
		int i = a; // byte -> int 자동형변환
		
		// 문자와 숫자 간 형변환
		char c = '가';
		int j = c; // char -> int 자동형변환
		System.out.println(j);
		
		// 정수와 실수 간 형변환
		int k = 100;
		double d = k; // int -> double 자동형변환
		System.out.println(d);
			
	}
}
