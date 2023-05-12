package day04;

public class MultiForEx01 {
	public static void main(String[] args) {
		/*
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				
				System.out.println(i + "," + j);
			}
		}
		*/
		
		for(int x = 2; x <= 9; x++) {
			
			System.out.println("구구단: " + x + "단");
			for(int y = 1; y <= 9; y++) {
				System.out.println(x + " x " + y + " = " + x*y );
			}
			
			System.out.println("-------------------");
		}
		
	}
}
