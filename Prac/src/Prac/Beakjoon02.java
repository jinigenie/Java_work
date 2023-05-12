package Prac;

import java.util.Scanner;

public class Beakjoon02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
/* 영수증
		int total = scan.nextInt();
		int n = scan.nextInt();
		int sum = 0;

		for(int i = 0; i < n; i++ ) {
			int p = scan.nextInt();
			int num = scan.nextInt();
			sum += p * num;			
		}

		if(total == sum) {
			System.out.println("Yes");	
		}else {
			System.out.println("No");

		}
*/
/* A + B 합 1
		int num = scan.nextInt();
		int i;
		
		for(i = 0; i < num; i++) {

			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a + b);
		}
*/
/* 별 찍기
		int n = scan.nextInt();

		for(int i = 0; i < n; i++) {
			for(int j = n-1 ; j >= 0; j--) {
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
*/
		scan.close();
	}
}
