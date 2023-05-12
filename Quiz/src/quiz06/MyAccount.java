package quiz06;

import java.util.Scanner;

public class MyAccount extends Account {
	
	MyAccount(String accountNumber, String pw, int balance){
		this.accountNumber = accountNumber;
		this.pw = pw;
		this.balance = balance;
	}
	
	Scanner scan = new Scanner(System.in);
	
	void withDraw(int x) {
		System.out.print("비밀번호 입력> ");
		String p = scan.next();
		
		if(p.equals(pw)) {
			
			if(balance >= x) balance -= x;
			else System.out.println("잔액 부족");
			
		} else System.out.println("pw 불일치");
		System.out.println("잔고: " + balance);
	}
}
