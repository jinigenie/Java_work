package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int i = 1;
		
		System.out.println("구구단: " + n + "단");
		
		while(i <= 9) {
			
			System.out.println(n + " x " + i + " = " + (n*i));
			i++ ;
		}
		scan.close();
	}
}
