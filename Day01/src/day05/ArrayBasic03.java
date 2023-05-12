package day05;

public class ArrayBasic03 {
	public static void main(String[] args) {
		
		int arr[] = new int[100];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		String s = "";
		for(int j = 0; j < arr.length; j++) {
			s += (arr[j] + " ");
		}
		System.out.println(s);
	}
}
