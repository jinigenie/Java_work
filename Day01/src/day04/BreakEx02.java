package day04;
import java.util.Scanner;

public class BreakEx02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		int ans = 0;

		while(true) {
			x = (int)(Math.random()*9) + 1;
			y = (int)(Math.random()*9) + 1;
			System.out.print(x + " x " + y + " = ");
			ans = scan.nextInt();
			if(ans == x * y) {
				System.out.println("정답");
			}else {
				System.out.println("오답! 게임 종료");
			    break;
			}
		}
		scan.close();
	}
}
