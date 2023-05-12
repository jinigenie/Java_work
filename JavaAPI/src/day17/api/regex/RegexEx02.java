package day17.api.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx02 {
	public static void main(String[] args) {
		
		/*
		 * [0-9]{2,4} 숫자 중 2~4개 연속된 형태 -> {숫자,숫자}사이 공백 없어야 함
		 * [0-9]{3} 0~9 숫자 중 3개 연속된 형태
		 * [A-Z]+ 대문자 한 개 이상
		 * [a-zA-Z]? 알파벳 0~1개 나오는 경우
		 * [가-힣]* 한글 0회 이상
		 * 
		 * 정규 표현식에 속하지 않는 문자(-, %, # 등)는 그냥 사용할 수 있음
		 * ex. [0-9]{3}-[0-9]{4} 숫자 3개-숫자 4개 형태
		 * 정규 표현식에 포함되는 문자 쓰고 싶은 경우 \ 사용
		 * \\+  \가 한 개 이상
		 * \?+  ?가 한 개 이상
		 * 
		 * 정확히 일치하는 문자
		 * \?.  정확히 ?에 일치
		 * [0-9]{3}원  000원 형식
		 * 
		 * \\d  숫자를 찾음([0-9]와 같은 의미)
		 * \\w  ([a-zA-Z_]와 같은 의미)
		 * \\s  공백
		 */
		
		String info = "홍길동/주소/02-123-4567/aaa123@naver.com";
		String info2 = "이순신/주소/010-1234-1234/bbb123@gmail.com";
		
		// 전화번호 형식
		String ptn1 = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		// 이메일 형식
		String ptn2 = "[a-zA-Z0-9]+@[a-z]+.[a-z]+";
		
		// 패턴 컴파일
		Pattern p1 = Pattern.compile(ptn1);
		Pattern p2 = Pattern.compile(ptn2);

		Matcher m1 = p1.matcher(info);
		Matcher m2 = p2.matcher(info2);
		
		// find() - 일치하는 부분 있으면 true
		// start() - 일치하는 부분의 첫 번째 인덱스
		// end() - 일치하는 부분의 마지막 인덱스
		// group() - 일치하는 부분의 추출
		
		while(m1.find()) { //패턴이 여러 번 나오면 순서대로 찾게 됨
			
			System.out.println("첫번째 인덱스: " + m1.start());
			System.out.println("마지막 인덱스: " + m1.end());
			System.out.println(m1.group());
		}
		
		if(m2.find()) { //가장 처음 발견되는 패턴 하나를 찾음
			System.out.println("첫번째 인덱스: " + m2.start());
			System.out.println("마지막 인덱스: " + m2.end());
			System.out.println(m2.group());
		}
		
		System.out.println("----------------------------------");
		
		List<String> list = Arrays.asList(info, info2);
		System.out.println(list.toString());
		
		
		for(int i = 0; i < list.size(); i++) {
			
			String str = list.get(i);
			// 패턴 생성
//			Pattern x = Pattern.compile(ptn1);
//			Matcher y = x.matcher(str);
			
			Matcher m = Pattern.compile(ptn1).matcher(str); // 첫 번째 패턴
			Matcher n = Pattern.compile(ptn2).matcher(str); // 두 번째 패턴
			
			if(m.find() && n.find()) {
				System.out.println(m.group());
				System.out.println(n.group());
			}
			
		}
		
		
	}
}
