package ClassEx03;

public class GasEx {
	public static void main(String[] args) {
		
		Gas car = new Gas();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("가스 주입 필요 없음");
		}else {
			System.out.println("가스 주입 필요함");
		}
	}
}
