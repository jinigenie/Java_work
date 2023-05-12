package Prac;

import java.util.Scanner;

public class Beakjoon04 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < num ; i++) {
			arr[i] = scan.nextInt();
		}
		
		int n = scan.nextInt();
		int cnt = 0;

		for(int j = 0; j < num; j++) {
			if(arr[j] == n) {
				cnt++;
			}
		}

		System.out.println(cnt);
		scan.close();
	}
}


/*

*/