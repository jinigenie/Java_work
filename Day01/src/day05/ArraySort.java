package day05;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		//선택정렬
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		int temp = 0;
		
		for(int i = 0; i < arr.length -1 ; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("최종: " + Arrays.toString(arr));
	}
}
