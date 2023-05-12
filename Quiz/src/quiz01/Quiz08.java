package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "니하오", "오하~", "@@"};
		
		int n = (int)(Math.random()*5);
		System.out.println("선택된 단어: " + arr[n]);
		
		switch (n) {
		case 0:	
			System.out.println("한국어입니다.");
			break;
		case 1:
			System.out.println("영어입니다.");
			break;
		case 2:
			System.out.println("중국어입니다.");
			break;
		case 3:
			System.out.println("일본어입니다.");
			break;
		case 4:
			System.out.println("알 수 없는 언어입니다.");
			break;
		}
		
	}
}
