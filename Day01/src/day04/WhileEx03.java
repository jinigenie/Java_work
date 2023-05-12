package day04;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i = 2;
		
		while(num % i != 0) {
			i++;
		}
		
		System.out.println(num == i ? num +"은 소수" : num + "소수X");
		/*
		if(num == i) {
			System.out.println("소수");
		}else {
			System.out.println("소수 X");
		}
		*/
		scan.close();
	}
}
