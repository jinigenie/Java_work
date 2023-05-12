package quiz01;

import java.util.Scanner;

public class MethodQuiz01 {

	static void method1() {
		System.out.println("안녕");
	}

	static String method2(String s) {
		return s;	}

	static double method3(int n1, int n2, double n3) {
		return n1 + n2 + n3;
	}

	static String method4(int n) {
		if(n % 2 == 0) return "짝수";
		else return "홀수";
		
		// return a % 2 == 0 ? "짝수" : "홀수";
	}

	static void method5(String s, int n) {

		for(int i = 0; i < n; i++) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

	static int maxNum(int n1, int n2) {
		if(n1 > n2) return n1;
		else if(n2 > n1) return n2;
		else return 0;
	}

	static int abs(int n) {
		if(n < 0) return -n;
		else return n;
	}
	
	static String java(int n) {
		String s = "";
		for(int i = 1; i <= n; i++) {
			s += (i % 2 == 1? "자" : "바");
		}
		return s;
	}

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		/*
		method1();
		System.out.println(method2("hello"));
		System.out.println(method3(10, 20, 33.5));
		System.out.println(method4(11));
		method5("hi", 3);
		System.out.print("숫자 두 개 입력 > ");
		System.out.println(maxNum(scan.nextInt(), scan.nextInt()));
		System.out.println(abs(-88));
		*/
		
		System.out.println(java(scan.nextInt()));
		
		scan.close();
	}
}
