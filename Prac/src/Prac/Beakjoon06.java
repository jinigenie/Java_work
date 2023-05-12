package Prac;

import java.util.Scanner;

public class Beakjoon06 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			res += s.charAt(i) - 48;
		}
		System.out.println(res);
	}
}
