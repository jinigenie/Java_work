package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert2 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		int[] newArr = new int[arr.length + 1];
		
		Scanner scan = new Scanner(System.in);
		
		int data = 100;
		int idx = scan.nextInt();
	
		for(int j = 0; j < newArr.length - 1; j++) {
			newArr[j] = arr[j];
		}

		for(int i = newArr.length - 1; i > idx ; i-- ) {
			newArr[i] = newArr[i - 1];
		}

		newArr[idx] = data;

		arr = newArr;
		newArr = null;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		scan.close();
	}
}
