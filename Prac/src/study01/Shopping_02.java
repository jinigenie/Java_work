package study01;

import java.util.Scanner;

class Shopping_02 {
	public static void main(String[] args) {

		String[] stock	= new String[100];  // 전체 상품 저장할 배열
		String[] buy= new String[100]; 		// 구매 가능한 상품 저장할 배열
		int[] price	= new int[100]; 		// 전체 상품에 대한 가격 저장할 배열

		int idx	= 0;  	// 인덱스
		int cnt	= 0; 	// 구매 가능한 물품 개수
		int money = 2000;

		Scanner scan = new Scanner(System.in);

		// 상품명과 가격 입력받아 저장하기
		while(idx < 100){
			System.out.print("추가할 물품 >> ");
			stock[idx] = scan.next();
			
			System.out.print("물품 가격 >> ");
			price[idx] = scan.nextInt();

			System.out.print("그만 추가하고 싶으면 0 입력 >> ");
			if(scan.next().equals("0")) {
				break;
			}
			idx++;
		}

		System.out.println("==============================================");

		// 전체 상품 목록 출력 + 구매 가능한 상품은 buy[]에 저장(이때 cnt 같이 증가)
		System.out.print("상품 목록 [");

		for(int i = 0; i <= idx; i++){
			if(price[i] <= money) {
				buy[cnt++] = stock[i];
			}

			System.out.print(stock[i] + "-" + price[i]);
			System.out.print(i < idx ? " / " : "]\n");
		}

		System.out.println("==============================================");
		
		// 구매 가능한 상품 cnt에 맞춰 출력
		System.out.print("구매 가능 물품: ");

		for(int i = 0; i < cnt ; i++){
			System.out.print(buy[i]);
			System.out.print(i < cnt-1 ? ", " : "\n");
		}

		System.out.println(cnt + "개 구매 가능");
		scan.close();
	}
}