package quiz02;

public class AccountMain {
	public static void main(String[] args) {

		Account p1 = new Account("219402-000-0000", "1234", 100000);
		
		p1.deposit(50000);
		p1.withDraw(10000);
		System.out.println("현재 잔고: " + p1.getBalance());
		
	}
}
