package day03;
import java.util.Arrays;

public class ArrayEx2 {
	public static void main(String[] args) {
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println("arr: " + Arrays.toString(arr));
		
		arr[3] = "목요일";
		System.out.println("arr: " + Arrays.toString(arr));	
	}
}
