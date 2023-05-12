package day07.overload;

public class Basic {
	
	// 오버로딩 - 같은 이름의 메소드를 여러 개 생성
	
	/* 규칙
	 * 1. 이름은 같음
	 * 2. 매개변수 다르게 하여 모형 다르게 설정
	 * 3. 반환 유형은 오버로딩에 영양 미치지 않음
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력 받음");
	}
	
//	int input(int x) {
//		return 0;
//	}
	void input(String a) {
		System.out.println("문자열 1개 입력 받음");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력 받음");
	}
	
	void input(double a, int b) {
		System.out.println("실수 1개, 정수 1개 입력 받음");
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력 받음");
	}
	
	
}
