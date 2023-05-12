package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {

		int max = 0;
		int mid = 0;
		int min = 0;

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(a > b && a > c) {
			max = a;
			if(b > c) {
				mid = b;
				min = c;
			}else {
				mid = c;
				min = b;
			}
		} else if(b > c && b > a) {
			max = b;
			if(a > c) {
				mid = a;
				min = c;
			}else {
				mid = c;
				min = a;
			}
		} else {
			max = c;
			if(a > b) {
				mid = a;
				min = b;
			}else {
				mid = b;
				min = a;
			}
		}
		System.out.println("max: " + max + ", mid: " + mid + ", min:" + min);
		scan.close();
	}
}
