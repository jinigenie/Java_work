package quiz01;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		
		int[] arr = {1000, 500, 100, 50, 10};
//		int[] arr2 = new int[5];
		
		Scanner scan = new Scanner(System.in);
		System.out.print("금액 입력 > ");
		int x = scan.nextInt(); 
		
		/*
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = x/arr[i];
			x %= arr[i];
			System.out.println(arr[i] + "원: " + arr2[i]);
		}
		*/

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "원: " + x/arr[i]);
			x %= arr[i];
		}
		
		scan.close();
	}
}
