package day10.static_.basic;

public class MyArrays {
	/*
	 * Arrays 클래스의 toSting메소드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체 생성 못하도록 생성자에 접근제한자 
	 * 2. printArray() 생성, 배열을 매개변수로 받아 toString처럼 리턴 - 메소드 오버로딩
	 */
	private MyArrays() {
		
	}
	
	public static String printArray(String[] arr) {
		String str = "[";
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
			if(i < arr.length -1) str += ", ";
		}
		str += "]";
		return str;
	}
	
	public static String printArray(int[] arr) {
		String str = "[";
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
			if(i < arr.length -1) str += ", ";
		}
		str += "]";
		return str;
	}
	
	public static String printArray(char[] arr) {
		String str = "[";
		for(int i=0; i<arr.length; i++) {
			str += arr[i];
			if(i < arr.length -1) str += ", ";
		}
		str += "]";
		return str;
	}
	
}
