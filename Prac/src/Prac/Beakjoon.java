package Prac;

import java.util.Scanner;

public class Beakjoon {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/* 알람 시계
		int h = scan.nextInt();
		int m = scan.nextInt();

		if(m >= 45) {
			m -= 45;
			
		}else {
			if(h >= 1) {
				h -= 1;
			}else {
				h = 23;
			}
			m = m + 15;
		}
		
		System.out.println(h + " " + m);	
		*/
		/* 오븐 시간
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		int t = scan.nextInt();
		
		m += t;
		
		if(m > 59) {
			h += m / 60;
			m %= 60;
			
			if(h > 23) {
				h -= 24;
			}
		}
		System.out.println(h + " " + m);
		*/
		/* 주사위 문제
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int m = 0;
		
		if (a == b && b == c) {
			m = 10000 + a * 1000;
		}else if(a == b && b != c || a == c && a != b) {
			m = 1000 + a * 100;
		}else if(b == c && b != a) {
			m = 1000 + b * 100;
		}else {
			if(a > b && a > c) {
				m = a * 100;
			}else if(b > a && b > c){
				m = b * 100;
			}else {
				m = c * 100;
			}
		}
		
		System.out.println(m);
		 */
		
		
		scan.close();	
	}
}
