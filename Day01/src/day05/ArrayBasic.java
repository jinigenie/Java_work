package day05;

import java.util.Arrays;

public class ArrayBasic {
	public static void main(String[] args) {

		int[] arr;

		arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr); // 배열 주소값
		System.out.println(Arrays.toString(arr)); // 배열값
		
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));

		System.out.println("배열 길이는 " + arr.length); // 배열 길이
		
		// 선언 및 생성 동시 방법
		int[] arr2 = new int[3]; // case1
		int[] arr3 = new int[] {1, 2, 3}; // case2
		int[] arr4 = {1, 2, 3}; // case3
		
		//배열 자동 초기화
		//int는 0, double은 0.0, String은 null
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
