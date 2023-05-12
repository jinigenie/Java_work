package day04;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {


		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++ ) {

				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++ ) {

				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("---------------");

		int star = 7;
		
		for(int a = 1; a <= star; a++) {
			for(int b = 1; b <= star-a ; b++) {
				System.out.print(" ");
			}
			for(int c = 1; c <= a*2 -1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("---------------");
		
		
		for(int x = 1; x <= 5; x++) {
			for(int y = 5; y >= 1; y--) {
				if(y > x) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int a = 1; a <= n; a++) {
			for(int b = 1; b <= n-a ; b++) {
				System.out.print(" ");
			}
			for(int c = 1; c <= a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
		
	}
}
