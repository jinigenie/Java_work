package day03;

public class Operator03 {
	public static void main(String[] args) {
		
		// 논리연산자
		int x = 10;
		int y = 20;
		
		if(x != 10 & ++y == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x: "+ x + " , y: " + y);
		
		if(x == 10 | ++y == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x: "+ x + " , y: " + y);
		
		System.out.println("------------------------");
		
		x = 10;
		y = 20;
		
		if(x != 10 && ++y == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x: "+ x + " , y: " + y);
		
		if(x == 10 || ++y == 21) {
			System.out.println("참");
		} else {
			System.out.println("거짓");
		}
		System.out.println("x: "+ x + " , y: " + y);
		
	}
}
