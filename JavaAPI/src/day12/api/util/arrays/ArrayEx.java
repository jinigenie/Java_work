package day12.api.util.arrays;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		int[] arr = {3, 1, 2, 5, 6, 7};
		
		// 정렬
		Arrays.sort(arr);
		
		// 배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		// 탐색 - 없으면 음수값 출력, 있으면 인덱스 출력
		// 선행 조건 : 정렬되어 있어야 함
		int res1 = Arrays.binarySearch(arr, 4);
		System.out.println(res1);
		int res2 = Arrays.binarySearch(arr, 3);
		System.out.println(res2);

		// 배열복사
		int[] arr2 =  Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr == arr2); // 깊은 복사로 새로운 배열 생성됐으므로 false
		
		int[] arr3 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(arr3));
		
		// 배열 크기 지정 복사
		int[] arr4 = Arrays.copyOfRange(arr2, 1, 3); 
		System.out.println(Arrays.toString(arr4));
		
		// 배열의 원소비교
		if(Arrays.equals(arr2, arr)) {
			System.out.println("배열 원소가 정확히 일치함");
		}
		
		
	}
}
