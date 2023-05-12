package quiz06;

public class Account {

	String accountNumber;
	String pw;
	int balance;

	Account(){
		
	}
	Account(String accountNumber, String pw, int balance){
		this.accountNumber = accountNumber;
		this.pw = pw;
		this.balance = balance;
	}

	// 잔고에 매개변수를 누적하는 기능
	void deposit(int x) {
		if(x > 0) balance += x;
		else System.out.println("입금 불가");
		System.out.println("잔고: " + balance);
	}

	// 잔고에서 매개변수를 차감하는 기능
	void withDraw(int x) {
		if(balance >= x) balance -= x;
		else System.out.println("출금 불가");
		System.out.println("잔고: " + balance);
	}

	// 잔고 반환하는 기능
	int getBalance(){
		return balance;
	}

}
