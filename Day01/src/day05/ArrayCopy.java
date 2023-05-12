package day05;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		// 배열의 복사
		
		// 1. 얕은 복사 : 주소 값의 복사
		int[] arr = {1, 2, 3, 4, 5};
		int[] newArr = arr;
		
		newArr[0] = 100; // arr[0]도 100으로 출력됨
		arr = null;
		
		System.out.println(Arrays.toString(newArr)); 
		System.out.println(Arrays.toString(arr));
		
		// 2. 깊은 복사 : 새로운 배열 생성한 후, 요소 저장
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] newArr2 = new int[arr2.length];
		
		
		for(int i = 0; i < arr2.length; i++) {
			newArr2[i] = arr2[i];
		}
		newArr2[0] = 600;
		System.out.println(Arrays.toString(newArr2));
		System.out.println(Arrays.toString(arr2));
		
	}
}
