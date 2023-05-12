package quiz01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ans = 0, cnt = 1;
		int x = (int)(Math.random() * 100) + 1;
		
		while(true) {
			System.out.print("정답 입력> ");
			ans = scan.nextInt();
			
			if(ans == x) {
				System.out.println("\n정답입니다.");
				System.out.println("시도횟수 : " + cnt);
				break;
			} else if(ans > x) {
				System.out.println("Down");
			} else {
				System.out.println("Up");
			}
			cnt++;
		}
		scan.close();	
	}
}
