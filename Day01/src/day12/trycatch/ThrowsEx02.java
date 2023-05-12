package day12.trycatch;

import java.util.Arrays;

public class ThrowsEx02 {

	public ThrowsEx02() {
		System.out.println("생성자 시작");
		aaa();
		System.out.println("생성자 종료");
	}
	
	public void aaa() {
		System.out.println("aaa 시작");
		bbb();
		System.out.println("aaa 종료");
	}
	
	public void bbb() {
		System.out.println("bbb 시작");
		System.out.println(10 / 0);
		System.out.println("bbb 종료");
	}

	public static void main(String[] args) {
		
		ThrowsEx02 ex = new ThrowsEx02();
		
		int[] arr = { 1, 5, 22 };
	
	}
}

