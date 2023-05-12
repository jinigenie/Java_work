package day05;

public class ArrayBasic02 {
	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
/*
		int a = 0;
		while(a < arr.length) {
			
			System.out.println(arr[a]);
			a++;
		}
*/		
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
}
