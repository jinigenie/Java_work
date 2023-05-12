package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	static String method6(char[] arr) {
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}		
		return str;
	}
	
	static int method7(int[] arr) {
		int sum = 0;
		/* for(int a : arr) {
		       sum += a;
		  }
		 */
		for(int i = 0; i < arr.length; i++) {
			sum += i;
		}
		return sum;
	}
	
	static String[] method8(String s1, String s2) {
		// return new String[] {s1, s2}; 
		String[] arr = {s1, s2};
		return arr;
	}
	
	public static void main(String[] args) {
		
		char[] newArr = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(method6(newArr));
		
		int[] newArr2 = {1, 2, 3, 4, 5};
		System.out.println(method7(newArr2));
		
		System.out.println(Arrays.toString(method8("안녕", "hello")));
	}
}
