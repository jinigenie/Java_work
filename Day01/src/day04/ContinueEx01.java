package day04;

public class ContinueEx01 {
	public static void main(String[] args) {
/*		
		for(int i = 1; i <= 10; i++) {
			if(i == 5) continue;
			System.out.println(i);
		}
*/
		int i = 0;
		while(i < 10) {
			i++;
			if(i == 5) continue;
			System.out.println(i);
		}
	}
}
