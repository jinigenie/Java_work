package day06;

import java.util.Arrays;

public class MethodEx04 {

	static void method01(char[] newArr) {
		for(int i = 0; i < newArr.length; i++) {
			System.out.println(newArr[i]);
		}
	}
	
	static int[] method2() {
		int[] arr = {1, 2, 3, 4, 5};
		return arr;
	}
	
	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		method01(arr);
		
		System.out.println(Arrays.toString(method2()));
	}
}
