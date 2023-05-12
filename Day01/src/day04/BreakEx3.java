package day04;

public class BreakEx3 {
	public static void main(String[] args) {
	
		x: for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + "-" + l);

				if(l == 'f') {
					break x;
				}
			}
		}
/*
		for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {
				
				System.out.println(c + "-" + l);
				
				if(l == 'f') {
					return; // 메소드 자체가 종료
				}
			}
		}
*/
/*
  		boolean flag = true;
 

		for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + "-" + l);

				if(l == 'f') {
					flag = false;
					break;
				}
			}
			if(flag == false) break;
		}
*/
	}
}
