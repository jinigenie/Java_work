package study02;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02_hyeon {
	
	// 1번 문제 메소드 정의 - 2023년 월, 일에 따른 요일 출력
	public static void date(int m, int d) {
		
		// 각 월에 해당하는 일 수 저장한 배열 선언
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int sum = 0; // 입력한 월과 일에 따른 총 일 수 저장할 변수 선언 (ex. 3월 15일 -> 31 + 28 + 15 = 64일)

		for(int i = 0; i < m-1; i++) { // 입력한 월의 직전 월까지 일 수 누적
			sum += mon[i];
		}
		sum += d; // 입력한 일 누적

		switch (sum % 7) { // 1월 1일이 일요일이므로 7로 나누었을 때 나머지가 1 = 일요일, 2 = 월요일, ...
		case 1: 
			System.out.println("일요일");
			break;
		case 2: 
			System.out.println("월요일");
			break;
		case 3: 
			System.out.println("화요일");
			break;
		case 4: 
			System.out.println("수요일");
			break;
		case 5: 
			System.out.println("목요일");
			break;
		case 6: 
			System.out.println("금요일");
			break;
		default: 
			System.out.println("토요일");
		}
	}
	
	// 2번 문제 메소드 정의 - 입력받은 문자열 2개 결합 후, 정렬하여 배열로 출력
	public static void printArray(String str1, String str2) {
		
		String str = str1 + " " + str2;
		String[] arr = str.split(" "); 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("월 입력 > ");
		int m = scan.nextInt();
		System.out.print("일 입력 > ");
		int d = scan.nextInt();

		date(m, d);
		scan.nextLine();
		
		System.out.println("=================================");
		
		System.out.print("문자열1 입력 > ");
		String s1 = scan.nextLine();
		System.out.print("문자열2 입력 > ");
		String s2 = scan.nextLine();
		
		printArray(s1, s2);
		
		scan.close();
	}
}
