package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int i = 1;
		while(i <= num) {
			if(i % 3 == 0 || i % 4 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		scan.close();
		
	}
}
