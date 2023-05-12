package day17.api.regex;

public class RegexEx01 {
	public static void main(String[] args) {
		
		String info = "홍길동|30세|서울시 강남구|010-1234-1234";
		
		// 전화번호 형식을 찾아서 ***-****-****로 변환
		//info.replaceAll(정규표현식, 치환할 문자)
		
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
		// 특정API에서 regex가 있으면, 정규표현식 적용할 수 있다는 의미
		String res = info.replaceAll(pattern, "***-****-****");
		System.out.println(res);
		
	}
}
