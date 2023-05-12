package quiz18;

import java.util.Scanner;

public class StringQuiz01 {
	public static void main(String[] args) {
		
		/*
		 * 스캐너로 id 입력 받음
		 * 아이디는 공백 포함해서 받을 수 있음(nextLine())
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력
		 *    5글자 이상이면 "id가 등록됐습니다" 출력 후 종료
		 */
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("id 입력>> ");
			String id = scan.nextLine();
			
			if(id.replace(" ", "").length()	>= 5) {
				System.out.println("id가 등록되었습니다. >> " + id);
				break;
			}
		}
		
			
		
		
	}
}
