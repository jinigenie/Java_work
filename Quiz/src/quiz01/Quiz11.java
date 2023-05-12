package quiz01;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int i = 1, res = 0;

		while(i <= num) {
			if(num % i == 0) {
				res += i;
				System.out.println(i);
			}
			i++;
		}
		System.out.println("Result: " + res);
		scan.close();
	}
}
