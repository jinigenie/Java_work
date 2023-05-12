package day10.abstract_.good;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. 추상메소드를 사용하면 오버라이딩 강제화 되어서 오버라이딩 실수를 줄일 수 있음
		 * 2. 객체 추상화 == 다형성의 사용
		 *     -> 추상클래스는 객체로 생성이 안되므로, 자식으로 생성하고 부모타입으로 구체화하여 사용
		 */
		
		Store s1 = new SeoulStore();
		s1.apple();
		s1.melon();
		s1.grape();
		s1.orange();
		s1.newMenu();
		System.out.println(s1.getName());
		
		System.out.println("---------------------");
		Store b1 = new BusanStore();
		b1.apple();
		b1.melon();
		b1.grape();
		b1.orange();
		b1.newMenu();
		System.out.println(b1.getName());
		
	}
}
