package ClassEx02;

public class CarEx {
	public static void main(String[] args) {

		Car car1 = new Car("벤츠");
		Car car2 = new Car("포르쉐");

		car1.setSpeed(100);
		car1.run();
		car2.setSpeed(50);
		car2.run();
	}
}
