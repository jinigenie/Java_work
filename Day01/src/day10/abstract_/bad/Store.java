package day10.abstract_.bad;

public class Store {
	// 추상메소드가 없는 경우
	// 자식 클래스에서 오버라이딩을 못한 경우, 잘못된 메소드가 실행될 수 있음
	public void melon() {
		System.out.println("각 지점에서 가격 책정 필요");
	}
	
	public void orange() {
		System.out.println("각 지점에서 가격 책정 필요");
	}
	
	public void grape() {
		System.out.println("각 지점에서 가격 책정 필요");
	}
	
	public void apple() {
		System.out.println("각 지점에서 가격 책정 필요");
	}
	
}
