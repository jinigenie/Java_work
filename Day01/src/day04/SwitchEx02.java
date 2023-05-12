package day04;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 입력>");
		int p = scan.nextInt();
		
		switch (p / 10) {
		case 9:
			if(p >= 95) {
				System.out.println("A+입니다");
			}else {
				System.out.println("A-입니다");
			}
			
			break;
		case 8:
			System.out.println("B입니다");
			break;
		case 7:
			System.out.println("C입니다");
			break;
		case 6:
			System.out.println("D입니다");
			break;
		default:
			System.out.println("F입니다");
			break;
		}
		
		scan.close();
	}
}
