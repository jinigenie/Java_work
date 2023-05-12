package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {
	
	// 매개변수, 반환값 모두 없는 메소드
	static void show() {
		System.out.println("[두 수의 합을 구합니다.]");
	}
	
	// 매개변수는 없지만 반환값은 있는 메소드
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		return scan.nextInt();
	}
	
	// 매개변수는 있지만 반환값은 없는 메소드
	static void print(int n) {
		System.out.println("두 수의 합: " + n);
	}
	
	// 매개변수, 반환값 모두 있는 메소드
	static int add(int x, int y) {	
		return x + y;
	}

	public static void main(String[] args) {
		
		show();
		
		int n1 = input();
		int n2 = input();
		
		print(add(n1, n2));
		
	}
}
