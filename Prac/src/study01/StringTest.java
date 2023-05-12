package study01;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n1 = 0, n2 = 0, cnt = 2;
		System.out.println("공백 없는 10자 이상 문자열을 입력하시오 > ");
		String str = scan.next();
		
		System.out.println("0 이상 5 미만의 정수를 입력하시오 >");
		while(true) {
			n1 = scan.nextInt();
			if(n1 < 0 || n1 >= 5) System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			else break;
		}
		
		System.out.println("5 이상 10 미만의 정수를 입력하시오 >");
		while(true) {
			n2 = scan.nextInt();
			if(n2 < 5 || n2 >= 10) System.out.println("잘못 입력했습니다. 다시 입력하세요.");
			else break;
		}
		
		System.out.println("입력한 정수 : " + n1 + ", " + n2);
		
		System.out.println(n1 + "번째 인덱스 -> '" + str.charAt(n1) + "' 부터, " + n2 + "번째 인덱스 -> '" + str.charAt(n2) + "' 까지 늘어납니다!");
		
		String temp = str.substring(0, n1);
		for(int i = n1; i <= n2; i++) {
			temp += String.valueOf(str.charAt(i)).repeat(cnt);
			cnt++;
		}
		temp += str.substring(n2 + 1);
		System.out.println(temp);
		
		scan.close();
	}
}
