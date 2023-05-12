package day04;

import java.util.Scanner;

public class WhileEx04 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 0, sum = 0;
		
		while(i < num) {
			System.out.print(">");
			int x = scan.nextInt();
			sum += x;
			i++;
		}
		
		System.out.println("합계: " + sum);
		scan.close();
	}
}
