package day06.str_ex;

public class MainClass {
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("======================");
		
		// 같은 파일에서 선언하면 같은 객체 참조
		System.out.println(str1 == str2);
		// 직접 생성 명령을 내리거나 다른 클래스에서 넘어오면 다른 주소
		System.out.println(str1 == str3);
		// 문자열 동등 비교 시, == 대신 equals() 메소드 사용
		System.out.println(str1.equals(str3));
		
	}
}
