package day03;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		// 1. 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너 메소드 사용하여 입력받기
		System.out.print("이름을 입력하세요 >");
		String s = scan.next();

		System.out.print("나이를 입력하세요 >");
		int n = scan.nextInt();
		
		System.out.print("키를 입력하세요 >");
		double h = scan.nextDouble();
		
		System.out.println("이름: " + s);
		System.out.println("나이: " + n + "세");
		System.out.println("키: " + h + "cm");
		
		// 3. 스캐너 종료
		scan.close();
	}
}
