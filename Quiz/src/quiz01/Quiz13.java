package quiz01;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {

		// 1. 7~100 정수 중 7의 배수 가로 출력
		for(int i = 7; i <= 100; i++) {
			if(i % 7 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("--------------------------------");
		
		// 2. 1~200 정수 중 9의 배수 개수 출력
		int cnt = 0;
		for(int j = 1; j <= 200; j++) {
			if(j % 9 == 0) {
				cnt++;
			}
		}
		System.out.println("개수: " + cnt);
		
		System.out.println("--------------------------------");
		
		// 3. 50~100 사이의 두 수 사이의 합
		int sum = 0;
		for(int x = 50; x <= 100; x++) {
			sum += x;
		}
		System.out.println("50~100 합: " + sum);
		
		System.out.println("--------------------------------");
		
		// 4. A~E 가로로 붙여서 출력, A=65, Z=90
		
		for(int y = 65; y < 91; y++) {
			System.out.print((char)y);
		}
		System.out.println();
		
		System.out.println("--------------------------------");
		
		// 5. 입력받은 정수 팩토리얼 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수 입력 >");
		int num = scan.nextInt();
		int res = 1;
		
		for(int z = num; z > 0 ; z--) {
			res *= z;
		}
		System.out.println("팩토리얼 결과: " + res);
		scan.close();
	}
}
