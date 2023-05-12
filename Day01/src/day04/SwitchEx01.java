package day04;

public class SwitchEx01 {
	public static void main(String[] args) {
		
		int a = (int)(Math.random()*5) + 1;
		System.out.println(a);
		
		// switch문 소괄호 안에는 변수 또는 변수 연산식
		// 타입 : 정수, 문자, 문자열
		switch(a) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
		default:
			System.out.println("!!");	
		}
		
	}
}
