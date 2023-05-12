package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Wizard wiz = new Wizard("wizard");
		wiz.info();
		wiz.iceArrow();
		wiz.info();
		
		Warrior war = new Warrior("warrior");
		war.info();
		war.bash();
		war.info();
		
	}
}
