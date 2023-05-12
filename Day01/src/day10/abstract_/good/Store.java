package day10.abstract_.good;

abstract public class Store {
	
	// 추상클래스에서도 생성자, 변수, 메소드 모두 선언 가능
	private String name = "호식이치킨";
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	// 추상 메소드 정의
	public abstract void melon();
	public abstract void orange();
	public abstract void grape();
	public abstract void apple();
	
	// 일반 메소드
	public void newMenu() {
		System.out.println("본점에만 있는 신메뉴");
	}
	
	public String getName() {
		return name;
	}
	
}
