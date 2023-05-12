package day06;

import java.util.Arrays;

public class StringManipulation2 {
	public static void main(String[] args) {
		String str = " 010 - 1234 - 1234   ";
		
		// trim - 공백 제거
		String res = str.trim(); // 앞뒤 공백 제거
		System.out.println(res);
		// 중간 공백 제거까지 하고 싶은 경우, replace() 사용
		str = str.replace(" ", "");
		System.out.println(str);
		
		System.out.println("============================");
		
		// 문자열 자르기 1 - 인덱스 기준으로 자르기
		str = "abcdefg";
		System.out.println(str.substring(4)); // 인덱스 n부터 끝까지 잘라오기
		System.out.println(str.substring(1, 4)); // n1부터 n2미만까지 잘라오기
		
		// 문자열 자르기 2 - 특정문자 기준으로 자르기
		str = "tomato - banana - orange";
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		String[] arr2 = str.split("a");
		System.out.println(Arrays.toString(arr2));
		String[] arr3 = str.split("");
		System.out.println(Arrays.toString(arr3));
		
		// 문자열 자르기 3 - 한 글자씩 char형으로 자르기
		char[] arr4 = str.toCharArray();
		System.out.println(Arrays.toString(arr4));

		System.out.println("============================");
		
		// 문자열 길이	
		str = "안녕하세요";
		System.out.println(str.length());
		
		// 문자열 비교
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		};
		
		// 문자열의 포함 여부	
		if(str.contains("녕")) {
			System.out.println("녕이 포함되있음");
		}
		
		
	}
}
