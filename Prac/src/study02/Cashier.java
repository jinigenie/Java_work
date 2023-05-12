package study02;

// Cashier 클래스 정의
public class Cashier {

	int[] coinUnit = {10000, 5000, 1000, 500, 100, 50, 10};
	int[] coin     = {2, 4, 0, 5, 5, 5, 5};

	String[] fruit = {"사과", "메론", "바나나", "딸기", "수박", "블루베리", "참외", "포도", "배"};
	int[] price = {4990, 7890, 3990, 14990, 17990, 9990, 1990, 24990, 4590};

	
	int money;
	
	public Cashier() {
		
	}

	// money를 매개변수로 받는 생성자
	public Cashier(int money) {
		this.money = money;
	}

	// account() 함수 정의 - 현재 시재 확인
	public int account() {
		int cash = 0;
		for(int i = 0; i < coin.length; i++) {
			cash += coinUnit[i] * coin[i];
		}		
		return cash;
	}

	// receipt() 함수 정의 - 영수증 출력
	public void receipt() {
		
		System.out.println("========영수증=========");
		
		// 과일 및 과일 가격 배열의 요소 랜덤으로 섞기
		for(int i = 0; i < fruit.length; i++) {
			
			int n = (int)(Math.random()*8);
			String temp1 = fruit[i];
			int temp2 = price[i];
			fruit[i] = fruit[n];
			price[i] = price[n];
			fruit[n] = temp1;
			price[n] = temp2;
		}
		
		// 과일 배열에서 순서대로 5개 과일 가격 계산
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println(fruit[i] + " - " + price[i] + "원");
			sum += price[i];
		}
		System.out.println("=====================");
		System.out.println("총액 : " + sum + "원");
		System.out.println("=====================");
		calculate(this.money, sum);
	}

	// calculate() 함수 정의 - 시재 확인 및 거스름돈 출력
	public void calculate(int money, int sum) {
		
		int change = money - sum;
		System.out.println("받은 돈 : " + money);
		System.out.println("거스름돈 : " + change);
		
		System.out.println("======거스롬돈 내역======");
		
		// 시재가 거스름돈보다 적으면 "시재 보충 필요" 출력 후 함수 종료
		if(change > this.account()) {
			System.out.println("시재 보충 필요");
			return;
		}
		
		int[] num = new int[7]; // 지폐 및 동전 개수 저장할 배열 선언
		
		// 거스름돈을 보유하고 있는 현금에 맞춰 계산
		for(int i = 0; i < coin.length; i++) {
			int x = change/coinUnit[i]; // 10000, 5000, 1000, 500, 100, 50, 10 순서로 나누기
			if(x <= coin[i]) {  // 보유한 현금으로 거슬러 줄 수 있는지 확인
				change %= coinUnit[i];  
				num[i] = x;
			}else {
				change -= coinUnit[i] * coin[i];
				num[i] = coin[i];
			}
		}
		
		// 보유하고 있는 현금이 거스름돈보다는 많지만 거슬러 줄 수 없는 경우
		if(change != 0) System.out.println("시재 보충 필요");
		else { // 거슬러 줄 수 있으면 현금 수 출력
			for(int i = 0; i < coin.length; i++) {
				System.out.println(coinUnit[i] + "원 : " + num[i] + "장");
			}
		}
	}

}
