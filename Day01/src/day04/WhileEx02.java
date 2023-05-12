package day04;

import java.util.Scanner;

public class WhileEx02 {
	public static void main(String[] args) {
		/*
		int i = 1, sum = 0;
		
		while(i < 100) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("최종 합계: " + sum);
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		int i = 1, sum = 0;
		
		while(i < num) {
			if(i % 2 == 0) {
				sum += i;
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("최종 합계: " + sum);
		scan.close();
	}
}
