package quiz02;

public class Tv {

	String company = "LG";
	int channel;
	boolean power;
	
	int changeChannel(int n) {
		channel = n;
		System.out.println("현재 " + channel + "번 입니다.");
		return channel;
	}
	
	void tvPower() {
		if(power == true) {
			power = false;
			System.out.println("tv를 끕니다.");
		}
		else {
			power = true;
			System.out.println("tv를 켭니다.");
		}
	}
	
	
}
