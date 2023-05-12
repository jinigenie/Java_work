package day04;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= n; i++) {			
			if(n % i == 0) {
				cnt++;
			}
		}
		System.out.println(cnt == 2 ? n + "은 소수" : n + "은 소수 x");
		
		scan.close();
	}
}
