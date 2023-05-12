package ClassEx03;

public class Gas {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("가스가 없습니다.");
			return false;
		}
		System.out.println("가스가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("남은 가스량: " + gas);
				gas -= 1;
			} else {
				System.out.println("남은 가스량: " + gas);
				return;
			}
		}
	}
}
