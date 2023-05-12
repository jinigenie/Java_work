package day05;

import java.util.Arrays;

public class ArraySort2 {
	public static void main(String[] args) {
		
		//버블정렬
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
/*		int temp = 0;
		
		for(int i = 0; i < arr.length -1 ; i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
*/
		Arrays.sort(arr); // 퀵정렬 기반의 정렬
		System.out.println("최종: " + Arrays.toString(arr));
	}
}
