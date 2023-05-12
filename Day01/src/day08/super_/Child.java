package day08.super_;

public class Child extends Parent {

	String me;
	
	/* 부모클래스에 기본 생성자가 없을 때 해결 방안
	 * 1. 부모 클래스에 기본 생성자 선언(추천X)
	 * 2. 자식클래스에서 super()를 통해 부모클래서와 강제 연결
	 */
	Parent p = new Parent("엄마", "아빠");
	
	
	Child(String me){
		super("엄마", "아빠"); // 방법2
		this.me = me;
	}
	
	String info() {
		return "name: " + p.getMother() + ", name: " + p.getFather() + ", name: " + me;
	}
}
