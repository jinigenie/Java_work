package quiz08_3;

public class MyCart extends Cart{

	//1. 생성자는 money를 전달받고 money값 초기화, tv = 300, com = 400, radio = 500;
	int index = 0;// cart[인덱스] 값을 누적시켜야하는데 반복문에서 i로 하다보니 첫번째인덱스에만 누적되어서 변수추가
	//cart배열 초기화를 여기서 하고싶었는데 오류가 발생해서 Cart에 만들었음
	String[] cart = {""};

	MyCart() {}
	
	MyCart(int money) {
		this.money = money;
		tv = 300;// 가격 // 쌤 this 추가
		com = 400;// 가격
		radio = 500; // 가격
		//String[] cart= {""}; //여기서 설정하니 다시 아주 그냥 null뛰네
	}


	/*2. buy(), add(), info() 메서드 오버라이드
	 *
	 *	상품명 "tv", "com", "radio"
	 *
	 * buy(상품명) 기능
	 * 매개변수가 tv, com, radio라면 금액에서 상품가격을 차감하고, add()메서드를 실행한다.
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리를 해주세요.
	 * switch case안에 if문 사용가능!
	 * 
	 */
	void buy(String product) {
		switch (product) {
		case "tv":
			if(this.money - tv < 0 ) {
				System.out.println("잔고가 부족합니다.");
			} else {
				this.money -= tv;
				System.out.println("잔액은 " + this.money + " 입니다.");
				add(product);
			}
			break;
		case "com":
			if(this.money - com < 0 ) {
				System.out.println("잔고가 부족합니다.");
			} else {
				this.money -= com;
				System.out.println("잔액은 " + this.money + " 입니다.");
				add(product);
			}
			break;
		case "radio":
			if(this.money - radio < 0) {
				System.out.println("잔고가 부족합니다.");
			} else {
				this.money -= radio;
				System.out.println("잔액은 " + this.money + " 입니다.");
				add(product);
			}
			break;

		default:
			System.out.println("잘못된 주문입니다.");
			break;
		}
	}



	/* add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉찼다면, 2배 크기의 카트배열로 옮겨주세요. 1->2->4->8
	 * if(
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	// 필요한 문법 : 배열의 초기화 및 복사. 단 조건을 통해 복사문 형성

	void add(String product) {
		// 배열이 공간여유있으면 초기화 실행하는 코드
		if (index <= cart.length-1)
		//if	("".equals(cart[cart.length-1]))
		{ 
			cart[index] += product; // index = 0;
			// 자리가 부족하면 배열 복사하는 코드
		} else  { //null로 설정하면 nulltv 이런식으로 출력되어 방식 바꿈
			String[] cart1 = new String[cart.length*2];
			for(int i = 0; i < cart1.length; i++ ) {
				cart1[i] = ""; // null값이 떠서 조건문으로 한번 초기화 하고 시작.
			}
			for(int i = 0; i < cart.length; i++) {
				cart1[i] = cart[i];
			}
			cart = cart1;
			cart1 = null; // 지금이야 데이터가 작지만 나중가면 얼마나 커질지 모르고, 그게 컴퓨터에 부하를 줄 수 있으니 지우기
			//index 설정이유는 값이 누적되어야 하는데 i로 설정하면 첫자리에만 초기화되어서
			cart[index] += product;
		} 
		index++;
		info();
	}


	/*
	 * info() 는
	 * cart배열에 담긴 물건 목록만 (null 제외) 출력해주세요.
	 *
	 *
	 */
	void info() {
		String str = "";
		for(int i = 0; i < cart.length; i++) {
			//if("".equals(cart[i]) ) {
			//} else {
				str += cart[i]+" ";
			//}
		}
		
		System.out.println("cart에 담긴 물건 : " + str);
	}
}


