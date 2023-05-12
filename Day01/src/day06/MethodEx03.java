package day06;

public class MethodEx03 {

	static int add(int a, int b) {
		return a + b;
	}
	
	static void sub() {
		System.out.println("5 - 2 = 3");
	}
	
	static void div(int a, int b) {
		System.out.println(a / b);
	}
	
	static void noReturn(String s) {
		if(s.equals("hello")) {
			System.out.println("hi");
			return;
		}
		
		System.out.println("hello 전달 못 받음");
	}
	
	public static void main(String[] args) {
		
		System.out.println(add(add(1, 2), add(3, 5)));
		sub();
		div(10, 3);
		noReturn("hello");
		noReturn("bye");
	}
}
