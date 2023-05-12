package Prac;

import java.util.Scanner;

public class Beakjoon05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int x = 0; x < n; x++) {
			arr[x] = x + 1;
		}
		
		int temp = 0;
		
		for(int y = 0; y < m; y++) {
			int i = scan.nextInt() - 1;
			int j = scan.nextInt() - 1;
			
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int z = 0; z < arr.length ; z++) {
			System.out.print(arr[z] + " ");
		}
		scan.close();
	}
}
