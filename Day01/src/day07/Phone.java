package day07;

public class Phone {
	
	String model;
	String color;
	int price;
	
	// 생성자 선언을 직접 하게되면, JVM이 기본생성자를 자동생성하지 않게 됨
	// 생성자 선언(반환 유형이 없음)
	Phone() {
		model = "아이폰";
		color = "black";
		price = 500000;
	}
	
	// 생성자 오버로딩
	Phone(String a){
		model = a;
		color = "pink";
		price = 200000;
	}
	
	Phone(String color, int price){
		model = "갤럭시";
		this.color = color;
		this.price = price;
	}
	
	Phone(String model, String color, int price){
		this.model = model;
		this.color = color;
		this.price = price;
	}
	
	
	void info() {
		System.out.println("====폰의 정보====");
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
}
