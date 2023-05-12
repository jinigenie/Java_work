package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
//		char[] arr = {'a', 'b', 'c'};
//		String str = new String(arr);

		String str = "안녕하세요~";
		System.out.println(str);
		
		// 한글자 자르기
		char c = str.charAt(1);
		System.out.println(c);
		
		// 찾으면 인덱스번호, 없으면 -1 반환
		System.out.println(str.indexOf("안녕"));
		
		if(str.indexOf("안녕") != -1) {
			System.out.println("문자에 값이 존재함");
		}
		
		// 문자열 뒤에서부터 값을 찾음
		System.out.println(str.lastIndexOf("안녕"));
		
		// contains
		if( str.contains("안녕")) {
			System.out.println("문자에 값이 존재함");
		}
		
		// length
		System.out.println("문자열 길이: " + str.length());
		
		System.out.println("--------------------------------------");
	
		// 문자열 변경 replace
		str = "자바의 기원은, 자바 커피집에서 시작되었습니다.";

		System.out.println(str.replace("자바", "java"));
		System.out.println(str.replaceFirst("자바", "jana"));
		System.out.println(str.replace(" ", ""));
		
		System.out.println("--------------------------------------");
		
		// 문자열 자르기 substring
		System.out.println(str.substring(9));
		System.out.println(str.substring(9, 17));
		
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(" ", 3);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("--------------------------------------");
		
		str = "홍길동";
		System.out.println(str.equals("홍길동"));
		
		
		System.out.println(str.compareTo("홍길동")); // 0 - 같은 문자
		System.out.println(str.compareTo("홍길자")); // 음수 - 앞의 값이 뒤보다 사전등재순 앞에 위치함
		System.out.println(str.compareTo("홍길순")); // 양수 - 뒤의 값이 앞보다 사전등재순 앞에 위치함
		
		System.out.println("--------------------------------------");
		
		// 특정 구분자로 문자열 연결
		System.out.println(String.join("-", "hello", "world", "!!!", "---"));
		
		// 기본타입을 문자열로 변경
		System.out.println(String.valueOf(1) + String.valueOf(2));
		System.out.println("" + 1 + 2);
		
	}
}
