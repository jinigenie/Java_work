package quiz13;

public class MainClass {
	public static void main(String[] args) {
		
		Shape r = new Rect("정사각형", 10);
		Shape c = new Circle("원", 5);
		
		System.out.println(r.getName() + " / 넓이: " + r.getArea());
		System.out.println(c.getName() + " / 넓이: " + c.getArea());
		
		
	}
}
