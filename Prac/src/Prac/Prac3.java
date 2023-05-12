package Prac;

public class Prac3 {
	public static void main(String[] args) {
		/*
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/
		/*
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = i; j < 3; j++) {
				System.out.print(" ");
			}
		    for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
		    System.out.println("");
		}
		*/
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 3 ; j >= 0 ; j--) {
				if(j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
}
