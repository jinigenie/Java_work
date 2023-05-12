package day06;

public class StringManipulation {
	public static void main(String[] args) {
		// 문자열 다루기
		// 문자열은 배열이므로, 인덱스가 존재
		
		String str = "안녕하세요~ 영어로하면 하이!";
		// 다만 str[n] 형식은 사용 불가
		
		// 문자열 함수
		// 1. 인수번째 문자 반환
		char c = str.charAt(3);
		System.out.println(c);
		
		// 2. 문자열 인덱스 확인
		int n = str.indexOf("하"); // 값 없으면 -1 반환
		System.out.println(n);
		int n2 = str.lastIndexOf("하"); // 문자 위치를 반환하지만 뒤에서부터 탐색
		System.out.println(n2);
		
		// 3. 문자열 변환
		System.out.println("abcde".toUpperCase()); // 소문자 -> 대문자
		System.out.println("aBCDe".toLowerCase()); // 대문자 -> 소문자
		
		String s = "Xyz";
		String res = s.toUpperCase();
		System.out.println(s); // 원본 문자열 유지
		System.out.println(res);
		
		// 4. 문자열 변경
		String f = "banana";
		String res2 = f.replace('n', 'b');
		System.out.println(f);
		System.out.println(res2);
		
		String res3 = f.replaceFirst("n", "b"); // 첫 번째 문자만 변경
		System.out.println(f);
		System.out.println(res3);
		
	}
}
