package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		int[] newArr = new int[arr.length - 1];
		Scanner scan = new Scanner(System.in);
		int idx = scan.nextInt();
		
		for(int i = idx; i < arr.length -1; i++) {
			arr[i] = arr[i+1];
		}
		for(int j = 0; j < newArr.length; j++) {
			newArr[j] = arr[j];
		}
		
		arr = newArr;
		newArr = null;
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
}
