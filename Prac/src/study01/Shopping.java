package study01;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {

		String[] stock = new String[100];
		int[] price = new int[100];

		int idx = 0;
		int money = 2000, cnt = 0;
		Scanner scan = new Scanner(System.in);

		while(idx < 100){
			System.out.print("추가할 물품 >> ");
			stock[idx] = scan.next();
			System.out.print("물품 가격 >> ");
			price[idx] = scan.nextInt();

			System.out.print("그만 추가하고 싶으면 0 입력 >> ");
			if(scan.next().equals("0")) break;
			idx++;
		}

		System.out.println("==============================================");
		System.out.print("상품 목록 [");
		for(int i = 0; i <= idx; i++){
			System.out.print(stock[i] + "-" + price[i]);
			System.out.print(i < idx ? " / " : "]\n");
		}

		System.out.println("==============================================");
		System.out.print("구매 가능 물품: ");
		for(int i = 0; i <= idx ; i++){
			if(price[i] <= money) {
				cnt++;
				System.out.print(stock[i]);
				System.out.print(i < idx ? ", " : "\n");
			}
		}

		System.out.println(cnt + "개 구매 가능");
		scan.close();
	}
}

