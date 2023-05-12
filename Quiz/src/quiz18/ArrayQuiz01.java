package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {
	public static void main(String[] args) {
		
		// arr과 arr2는 길이가 1 차이가 납니다.
		// arr은 마라톤 참가자
		// arr2는 마라톤 완주자 
		
		String[] arr = {"홍길동", "홍길자", "홍길동", "신사임당"};
		String[] arr2 = {"홍길동", "홍길자", "신사임당"};
		
		

		System.out.println(test(arr, arr2));
		
	}
	
	public static String test(String[] arr, String[] arr2) {
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr.length; i++) {
			
			if(Arrays.binarySearch(arr2, arr[i]) < 0) {
				return arr[i];
			}
		}
		
		return null;
	}
}
