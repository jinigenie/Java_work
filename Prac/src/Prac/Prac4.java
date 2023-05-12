package Prac;

import java.util.Scanner;

public class Prac4 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
//		int x = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			
			/*
			String inputData = scanner.nextLine();
			if(inputData.equals("1")) {
				balance = 10000;
				System.out.println(balance);
			}
			else if(inputData.equals("2")) {
				x = 2000;
				System.out.println(x);
			}
			else if(inputData.equals("3")) {
				balance -= x;
				System.out.println(balance);
			}
			else {
				System.out.println("종료");
				break;
			}
			*/
			int num = Integer.parseInt(scanner.nextLine());
			
			switch(num) {
			case 1:
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			case 3:
				System.out.print("잔고> ");
				System.err.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("종료");
		scanner.close();
	}
}
