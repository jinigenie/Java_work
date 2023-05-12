package day02;

public class Prac1 {
	public static void main(String[] args) {
		
		// 자바 출력문 종류 - 3가지 제공
		
		// 1. 개행문자 \n가 없는 출력문
		System.out.print("hi");
		System.out.print("hi\n");
		System.out.print("hi");
		
		// 2. 개행문자를 마지막에 포함하는 출력문
		System.out.println("hi");
		System.out.println("hi\n");
		System.out.println("hi");
		
		// 3. 형식 지정 출력문
		// %d: 정수, %f: 실수, %s: 문자열
		int a = 10;
		System.out.printf("a: %d\n", a);
		System.out.printf("제 이름은 %s 입니다.\n", "genie");
		System.out.printf("원주율은 %f입니다.\n", 3.14);
		System.out.printf("원주율은 %.2f입니다.\n", 3.14);
		
		
		System.out.printf("제 생일은 %d년 %d월 %d일 입니다.", 1991, 8, 5);
	}
}
