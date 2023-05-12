package day02;

public class Casting03 {

	public static void main(String[] args) {
		
		char c = 'c';
		int i = 2;

		// 1. 서로 다른 타입의 연산에서 큰 타입에 맞추어 자동형변환
		char cc = (char)(c + i);
		System.out.println(cc);
		int ii = c + i;
		System.out.println(ii);
		
		// 2. int형보다 작은 타입의 연산 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
//      byte b3 = b1 + b2; // error
        System.out.println(((Object)(b1+b2)).getClass().getSimpleName());
        byte b3 = (byte)(b1 + b2); // 강제로 byte 형변환 필요
        System.out.println(b3);


	}
}
