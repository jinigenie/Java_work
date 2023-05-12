package day13.api.util.random;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		double d = r.nextDouble(); // 0이상 1미만
		System.out.println(d);
		
		int i = r.nextInt(); // 전체 정수 범위
		System.out.println(i);
		
		
		
	}
}
