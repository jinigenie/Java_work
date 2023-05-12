package quiz01;

import java.util.Scanner;

public class ContinueEx02 {
	public static void main(String[] args) {

		// 1. 입력받은 수까지의 소수들의 합
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int cnt = 0, sum = 0;

		x: for(int i = 2 ; i <= num; i++) {
			cnt = 0;
			for(int j = 1 ; j <= i; j++) {				
				if( i % j == 0) {
					cnt++;
				}
				if(cnt > 2) continue x;
			}
			System.out.print(i + " ");
			sum += i;
		}
		
		System.out.println();
		System.out.println("result: " + sum);
		scan.close();

	}
}
