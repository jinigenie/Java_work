package day02;

public class Casting02 {

	public static void main(String[] args) {
		
		// 강제형변환 (type) 캐스팅 사용
		int i = 70;
		char c = (char)i;
		short s = (short)i;
		System.out.println(c);
		System.out.println(s);
		
		float f = 3.14f;
		int k = (int)f;
		System.out.println(k);
		
		// 주의사항
		// 값을 받을 수 없는 범위이면 잘려나간 값을 저장하게 됨
		int a = 1000; // 0011 1110 1000
		byte b = (byte)a; // (0011) 1110 1000 -> -23
		System.out.println(b);

		// 예외케이스
		// 문자와 숫자 간 명시적 형변환
		char cc = 'A';
		short ss = (short)cc;
		
	}
}
