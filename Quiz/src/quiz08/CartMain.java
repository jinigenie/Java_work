package quiz08;

import java.util.Scanner;

public class CartMain {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		MyCart ca = new MyCart(2000);
		int x = 1;

		while(true) {
			System.out.println("==================================");
			System.out.print("구매하려면 1 입력, 그만 구매는 0 입력 >> ");
			x = scan.nextInt();
			
			if(x == 0) {
				System.out.println("프로그램 종료");
				return;
			}
			else {
				System.out.print("구매할 상품 > ");
				ca.buy(scan.next());
			}
		}
	}
}
