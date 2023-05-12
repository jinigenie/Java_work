package quiz13;

public class Circle extends Shape {

	/* 원은 radius 변수
	 * 생성 시, 이름과 radius 받을 수 있도록 생성자 선언
	 * getArea = 원의 넓이
	 */
	public double radius;
	
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}
	public double getArea() {
		return radius * radius * PI;
	}
}
