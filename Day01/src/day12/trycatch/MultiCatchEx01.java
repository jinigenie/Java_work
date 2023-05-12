package day12.trycatch;

public class MultiCatchEx01 {
	public static void main(String[] args) {
		
		//참고
		//메인메소드도 매개변수를 받을 수 있음
		//run > run configuration -> argument탭
		
		try {
			
			String a1 = args[0];
			String a2 = args[1];
			
			//정수 변경
			int n1 = Integer.parseInt(a1);
			int n2 = Integer.parseInt(a2);
			
			System.out.println("두 수의 합: " + (n1 + n2));
			
			String str = null;
			str.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남(매개변수를 2개 입력하세요)");
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		} catch (Exception e) { // ctrl + t
			System.out.println("기타 예외입니다");
		}
		
		
	}
}
