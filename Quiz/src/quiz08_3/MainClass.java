package quiz08_3;

public class MainClass {
	public static void main(String[] args) {
/*
		MyCart mc = new MyCart(1500);

		mc.buy("tv");
		mc.buy("com");
		mc.buy("radio");

		mc.buy("tv");
		mc.buy("radio");
		mc.buy("radi");
*/
		
		MyCartA mca = new MyCartA(1500);
		
		mca.buy("tv");
		mca.buy("com");
		mca.buy("radio");
		
		mca.buy("tv");
		mca.buy("radio");
		mca.buy("radi");
		
	}
}

