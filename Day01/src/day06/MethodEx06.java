package day06;

import java.util.Arrays;

// 큐
public class MethodEx06 {

	static int[] arr = { 1, 2, 3 };

	// push
	static void push(int n) {
		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[arr.length] = n;
		arr = newArr;
		newArr = null;
	}

	// pop
	static int pop() {
		if(arr.length > 0) {
			int[] newArr = new int[arr.length - 1];
			int temp = arr[0];
			for(int i = 1; i < arr.length; i++) {
				newArr[i - 1] = arr[i];
			}
			arr = newArr;
			newArr = null;
			return temp;
		} return 0;
	}

	public static void main(String[] args) {

		push(4);
		push(5);
		push(6);
		System.out.println(Arrays.toString(arr));
		System.out.println(pop() + ", " + Arrays.toString(arr));
		System.out.println(pop() + ", " + Arrays.toString(arr));
		System.out.println(pop() + ", " + Arrays.toString(arr));
		System.out.println(pop() + ", " + Arrays.toString(arr));
		System.out.println(pop() + ", " + Arrays.toString(arr));
		System.out.println(pop() + ", " + Arrays.toString(arr));

	}
}
