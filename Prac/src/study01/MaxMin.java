package study01;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = 0, min = 100;
		int max_idx = 0, min_idx = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int i = 0; i < 9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				max_idx = i + 1;
			} 
			if(arr[i] < min) {
				min = arr[i];
				min_idx = i + 1;
			}
		}
		
		System.out.println("최대값: " + max + ", " + max_idx + "번째");
		System.out.println("최솟값: " + min + ", " + min_idx + "번째");
		
		scan.close();
	}
}
