package quiz13;

public class Rect extends Shape {

	/* 사각형은 side 변수
	 * 생성 시, 이름과 side 받을 수 있도록 생성자 선언
	 * getArea = 사각형의 넓이
	 */
	public double side;

	public Rect(String name, double side){
		super(name);
		this.side = side;
	}
	public double getArea() {
		return side * side;
	}

}
