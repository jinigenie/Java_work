package day04;

public class EnhancedForEx01 {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		// 향상된 for문 : 배열과 같은 연속된 타입을 돌리기에 적합
		for(int x : arr) {
			System.out.println(x);
		}
		
		System.out.println("------------------");
		
		String[] arr2 = {"a", "b", "c", "d", "e"};
		
		for(String y : arr2) {
			System.out.println(y);
		}
		
		System.out.println("------------------");
		
		int[] score = {57, 40, 39};
		int sum = 0;
		double avg = 0;
		
		for(int x : score) {
			sum += x;
		}
		avg = (double)sum / score.length;
		System.out.println("합계 :" + sum + ", 평균: " + avg);
	}
	
}
