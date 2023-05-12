package ClassEx01;

public class Car {
	
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		this("버스", "blue", 150);
	}
	
	Car(String model){
		this(model, "silver", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
