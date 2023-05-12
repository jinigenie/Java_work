package day07;

// 클래스 생성
public class Pen {
	
	// 클래스 속성을 나타내는 멤버변수(=field)
	int price;
	String ink;
	String company;
	
	// 기능을 나타내는 메소드
	void write() {
		System.out.println(ink + "색을 사용합니다.");
	}
	
	void info() {
		System.out.println("========펜의 정보========");
		System.out.println("가격: " + price);
		System.out.println("색상: " + ink);
		System.out.println("회사: " + company);
	}
}
