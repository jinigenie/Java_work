package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0, opt = 0;
		int ans = 0, res = 0;
		int cnt1 = 0, cnt2 = 0;

		while(true) {
			x = (int)(Math.random()*100) + 1;
			y = (int)(Math.random()*100) + 1;
			opt = (int)(Math.random()*2);
			
			/* 삼항 연산자 사용하는 경우
			   System.out.print(x + (opt == 0? "+" : "-") + y + " = ?\n");
			   res = opt == 0? x + y : x - y;
			 */
			if(opt == 0) {
				System.out.print(x + " + " + y + " = ?\n");
				res = x + y;
			} else {
				System.out.print(x + " - " + y + " = ?\n");
				res = x - y;
			}
			
			System.out.print("[게임 종료 시, 0 입력]\n> ");
			ans = scan.nextInt();
			
			if(ans == 0) {
				System.out.println("\n프로그램 정상 종료");
				break;
			}
			else if(ans == res) {
				System.out.println("\"정답\"\n");
				cnt1++;
			}else {
				System.out.println("\"오답\"\n");
				cnt2++;
			}
		}
		
		System.out.println("정답: " + cnt1);
		System.out.println("오답: " + cnt2);
		scan.close();
	}
}
