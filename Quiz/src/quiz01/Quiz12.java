package quiz01;

public class Quiz12 {
	public static void main(String[] args) {
		
		int i = 1, cnt = 0;
		int sum = 0;
		
		while(i <= 1000) {
			if(i % 4 == 0 && i % 8 != 0) {
				cnt++;
			}
			i++;
		}
		System.out.println("1번 답: " + cnt);
		
		i = 50;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("2번 답: " + sum);
		
	}
}
