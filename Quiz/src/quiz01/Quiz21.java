package quiz01;

import java.util.Arrays;

public class Quiz21 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int temp = 0;
		
		for(int i = 0; i < 10; i++) {
			int x = (int)(Math.random()*9);
			int y = (int)(Math.random()*9);
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		
		int[] new_arr = {arr[0], arr[1], arr[2]};
		System.out.println(Arrays.toString(new_arr));
	}
}
