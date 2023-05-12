package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		
		MyCart cart = new MyCart(2000);
		
		Product radio = new Radio();
		Product tv = new Tv();
		Product com = new Computer();
		
		
		cart.buy(radio);
		cart.buy(tv);
		cart.buy(com);
		cart.buy(radio);
		cart.buy(tv);
		cart.buy(com);
		


	}
}
