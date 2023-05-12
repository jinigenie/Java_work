package quiz16;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int ans = 0, cnt = 1;
		int x = (int)(Math.random() * 100) + 1;
		while(true) {
			try {

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

			} catch (Exception e) {
				System.out.println("제대로 입력하세요");
				scan.nextLine();
			}
			cnt++;
		}

		scan.close();	
	}
}
