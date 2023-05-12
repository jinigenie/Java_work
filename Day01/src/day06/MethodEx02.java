package day06;

//import java.util.Scanner;

public class MethodEx02 {
	
	// 매개변수 2개 받는 메소드
	static int calSum(int x, int y) {
		
		return x + y;
	}
	
	static String calSum2(int n, String s) {
		
		String str = "";
		for(int i = 0; i < n; i++) {
			str += s;
		}
		return str;
	}
	
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println(calSum(n1, n2));
		scan.close();
		*/
		System.out.println(calSum2(5, "가"));
	}
}
