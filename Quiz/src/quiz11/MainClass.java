package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
//		Computer com = new Computer(new KeyBoard(), new Monitor(), new Mouse());
		Computer com = new Computer();
		Monitor m = com.getMoni();
		m.info();
	}
}
