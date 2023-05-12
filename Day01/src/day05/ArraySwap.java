package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp = 0;
		
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		System.out.println(Arrays.toString(arr));
		
		
		/*
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 8, 9, 10};
		int temp[] = new int[5];
		
		for(int i = 0; i < arr1.length; i++) {
			temp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = temp[i];
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		*/
		scan.close();
	}
}
