package day04;

public class BreakEx01 {
	public static void main(String[] args) {

		/*
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i > 5) break;			
		}
		*/
		
		int i = 0;
		while(true) {
			i++;
			if(i > 15) break;
			System.out.println(i);
		}
	}
}
