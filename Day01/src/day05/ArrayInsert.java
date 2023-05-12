package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		int[] newArr = new int[arr.length + 1];
		
		Scanner scan = new Scanner(System.in);
		
		int data = 100;
		int idx = scan.nextInt();
	
		for(int j = 0; j < idx; j++) {
			newArr[j] = arr[j];
		}

		newArr[idx] = data;

		for(int i = idx + 1; i < newArr.length; i++ ) {
			newArr[i] = arr[i - 1];
		}
		
		arr = newArr;
		newArr = null;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		scan.close();
	}
}
