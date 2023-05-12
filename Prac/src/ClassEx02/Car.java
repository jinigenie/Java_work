package ClassEx02;

public class Car {
	String model;
	int speed;
	
	Car(String model){
		this.model = model;	
	}
	
	void setSpeed(int speed) {
		this.speed = speed;	
	}
	
	void run() {
		for(int i = 10; i <= this.speed; i += 10) {
			System.out.println(this.model + "가 달립니다.(시속: " + i + "km/h)");
		}
	}
}