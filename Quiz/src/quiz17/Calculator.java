package quiz17;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 정수 2개 입력받아 두 수의 합을 반환
		 * 2. 입력된 값이 정수라면 합계 반환
		 * 3. 예외 발생 시, 직접 예외를 생성하고 예외 메시지를 외부 전달
		 * 4. scan.close()는 finally에서 처리
		 */
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.print("숫자1 입력 > ");
			int n1 = scan.nextInt();
			System.out.print("숫자2 입력 > ");
			int n2 = scan.nextInt();
			return n1 + n2;
			
		} catch (Exception e) {
			throw new Exception("0 이상의 값이어야 합니다.");
			
		} finally
		{
			scan.close();
		}
		
	}
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		try {
			System.out.println(c.input());
		} catch (Exception e) {
			String m = e.getMessage();
			System.out.println(m);
		}


		
	}
}
