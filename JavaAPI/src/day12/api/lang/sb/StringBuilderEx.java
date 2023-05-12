package day12.api.lang.sb;

public class StringBuilderEx {
	public static void main(String[] args) {
		
//		StringBuilder - 단일 쓰레드 환경에서 사용
//		StringBuffer - 멀티 쓰레드 환경에서 사용

		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		str = str + "program";
		sb.append("program"); // append() - 문자열 끝에 추가
		
		System.out.println(str);
		System.out.println(sb);
		
		sb.insert(5, "study "); // insert() - 문자열 중간에 추가
		System.out.println(sb);
		
		sb.replace(5, 10, "book"); // replace() - 문자열 변경
		System.out.println(sb);
		
		sb.delete(5, 10); // delete() - 문자열 삭제
		System.out.println(sb);
		
		sb.deleteCharAt(0); // deleteCharAt() - 인덱스번째 삭제
		System.out.println(sb);
		
		sb.reverse(); // reverse() - 문자열 뒤집기
		System.out.println(sb);
		
		System.out.println(sb.equals("margorp ava"));
		String res = sb.toString(); // toString() - 문자열로 형 변환
		System.out.println(res.equals("margorp ava"));
	}
}
