package day02;

public class DataType2 {
	public static void main(String[] args) {
		
		// 단일문자 저장하는 char = 2byte
		char c1 = 'A';
		char c2 = 65; 
		// 아스키코드 - 미국에서 문자들에 숫자값을 붙임(1byte)
		// 유니코드 - 전세계 문자에 숫자값을 붙임(2byte)
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032; // 유니코드 10진수
		char c5 = '\uAC00'; // 유니코드
		System.out.println(c3 + "\n" + c4 + "\n" + c5);
		
		// 문자열을 저장하는 String 
		String s1 = " 가나다라마 ";
		System.out.println(s1);
		
		// 문자열 연산
		System.out.println(s1 + "바사");
		System.out.println("100" + 100); //문자열이 우선순위 높음
		System.out.println(100 + 100 + "100"); //산술연산 -> 문자열 연산
		
	}
}
