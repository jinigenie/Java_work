package study02;

public class Quiz03_hyeon {
	public static void main(String[] args) {
		
		Cashier cashier = new Cashier(100000);
		System.out.println("시제 : " + cashier.account() + "원");
		cashier.receipt();
		
		
	}
}
