package day10.static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		String[] arr1 = {"apple", "banana", "orange"};
		System.out.println(MyArrays.printArray(arr1));
		
		int[] arr2 = {1, 2, 3, 4, 5};
		System.out.println(MyArrays.printArray(arr2));
		
		char[] arr3 = {'a', 'b', 'c'};
		System.out.println(MyArrays.printArray(arr3));
		
		System.out.println("============================");
		// 클래스가 여러 번 로드되더라도 static은 단 한번만 실행
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		System.out.println(Init.price);
		
		
	}
}
