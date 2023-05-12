package day03;
import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		// 1. 배열 선언
		int[] arr;
		
		// 2. 배열 생성 - 크기 지정
		arr = new int[5];
		
		// 3. 배열 초기화
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;
		
		// 4. 배열 사용
		System.out.println(arr[2]);
		arr[2] = 300;
		System.out.println(arr[2]);
		
		// 5. 배열 모형 확인
		System.out.println(arr); //주소값 = 배열 위치 출력

		System.out.println(Arrays.toString(arr));
		
		// 6. 배열 길이 확인
		System.out.println("배열 길이: " + arr.length);
		
		// 7. 배열 선언과 생성 동시
		byte[] arr2 = new byte[10];
		
		// 8. 배열 선언과 생성, 초기화 동시
		int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7};
		System.out.println("arr3: " + Arrays.toString(arr3));
		
		int[] arr4 = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("arr4: " + Arrays.toString(arr4));
		
		// 9. 초기값을 지정하지 않으면 기본값으로 초기화
		// int = 0, double = 0.0, String = null
		System.out.println("arr2: " + Arrays.toString(arr2));	
	}
}
