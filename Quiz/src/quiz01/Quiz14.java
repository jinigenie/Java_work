package quiz01;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {

		//1. 입력 받은 가로, 세로 길이의 사각형 , 윤곽선만 출력
		Scanner scan = new Scanner(System.in);

		System.out.print("가로 길이>");
		int x = scan.nextInt();

		System.out.print("세로 길이>");
		int y = scan.nextInt();

		/*		for(int i = 1; i <= y; i++) {
			if(i == 1 || i == y) {
				for(int j = 1; j <= x; j++) {
					System.out.print("*");
				}
			}else {
				System.out.print("*");
				for(int k = 1; k <= x-2; k++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		 */

		for(int i = 1; i <= y; i++) {
			for(int j = 1; j <= x; j++) {
				
				if(i == 1 || i == y || j == 1 || j == x) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		scan.close();
	}
}
