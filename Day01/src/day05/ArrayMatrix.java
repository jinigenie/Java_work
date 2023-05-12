package day05;

import java.util.Arrays;

public class ArrayMatrix {
	public static void main(String[] args) {
		
		// 다차원 배열
		
		int[][] arr = new int [2][3];
		int n = 1;
		
		System.out.println(arr.length);
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(arr[1][2]);
		
		// 2차원 배열 생성 및 초기화 동시
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
		};
		
		// 2차원 배열 출력
		System.out.println(Arrays.deepToString(arr2));
		
	}
}
