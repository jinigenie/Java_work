package day05;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySearch2 {
	public static void main(String[] args) {
		
		// 이진탐색
		int[] arr = {1, 3, 5 ,10, 20, 30, 50, 80, 100};
		
		int start = 0;
		int end = arr.length-1;

		Scanner scan = new Scanner(System.in);
		System.out.print("찾을 값 >");
		
		int find = scan.nextInt();
		/*
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if(find == arr[mid]) {
				System.out.println("결과: "+ (mid + 1) + "번째");
				break;
			}else if(find > arr[mid]) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			
		}
		
		if(start > end) {
			System.out.println("찾는 값이 없습니다.");
		}
		scan.close();
		*/
		System.out.println(Arrays.binarySearch(arr, find));
	}
}
