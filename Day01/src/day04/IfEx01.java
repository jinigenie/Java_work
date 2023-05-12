package day04;

import java.util.Random;

public class IfEx01 {
	public static void main(String[] args) {

		int n = (int)(Math.random() * 101);

		if(n < 60) {
			System.out.println(n+ "점, 불합격");
		} else {
			System.out.println(n+ "점, 합격");
		}


	}
}
