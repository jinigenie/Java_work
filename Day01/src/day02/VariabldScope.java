package day02;

public class VariabldScope {
	public static void main(String[] args) {
		
		// 변수는 중괄호{} 안에서 선언, 그 안에서 유효
		int num1 = 10;
		int num2 = 20;
		int num4 = 0;
		
		if(true) {
			int num3 = num1 + num2;
			System.out.println(num3);
			
			num4 = 2000;
		}
		
//		System.out.println(num3); // error
		int num3 = 30; // if문 안의 num3과는 다름
		System.out.println(num3);
		System.out.println(num4);
	}
}
