package day10.static_.basic;

public class Calculator {

	/*
	 * 클래스 설계 시, 적절한 곳에 static을 붙이는 것이 좋음
	 * 
	 * 객체마다 다른 값을 가져야 하면 일반 변수,
	 * 객체마다 동일한 값을 가져야 하면 static 변수
	 */
	
	private String color;
	public static double pi = 3.14;
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public static double circle(int r) {
		return r * r * pi;
	}
	
}
