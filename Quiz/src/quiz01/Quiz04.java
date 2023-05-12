package quiz01;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1);
		} else if(n2 > n1) {
			System.out.println(n2);
		} else {
			System.out.println("같은 수");
		}
		
		scan.close();
	}
}
