package day04;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("점수 입력>");
		int point = scan.nextInt();

		if (point >= 90) {
			if(point >= 95) {
				System.out.println("A+학점");
			} else {
				System.out.println("A-학점");
			}
			
		} else if(point >= 80) {
			if(point >= 85) {
				System.out.println("B+학점");
			} else {
				System.out.println("B-학점");
			}
		} else if(point >= 70) {
			if(point >= 75) {
				System.out.println("C+학점");
			} else {
				System.out.println("C-학점");
			}
		} else if(point >= 60) {

			System.out.println("D학점");

		} else {

			System.out.println("F학점");	
		}

		scan.close();


	}
}
