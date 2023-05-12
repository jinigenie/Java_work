package day04;

public class WhileEx01 {
	public static void main(String[] args) {
		
		int a = 1;  // 제어변수
		int sum = 0;
		
		while(a <= 10) {
			
			sum += a;
			System.out.println(a + ", " + sum);
			a++;
		}
	}
}
