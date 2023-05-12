package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		if(n < 0) {
			System.out.println("음수입니다.");
		} else if(n == 0) {
			System.out.println("0입니다.");
		} else if(n % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}


		scan.close();

	}
}
