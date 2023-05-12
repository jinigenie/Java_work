package day05;

public class ArraySearch {
	public static void main(String[] args) {
		// max 값 찾기
		int[] arr = {54, 23, 12, 76, 99, 1, 2, 3};
		
		int i = 0, max = 0;
		
		while(i < arr.length) {
			if(max < arr[i]) max = arr[i];
			i++;
		}
		System.out.println(max);
	}
}
