package quiz08;

public class MyCart extends Cart {

	int cnt = 1;

	MyCart(int money){
		this.money = money;
		tv = 300;
		com = 400;
		radio = 500;
	}

	/* 매개변수 tv, com, radio라면 금액에서 상품 가격 차감하고, add() 실행
	   단, 올바른 상품 아니거나 금액 부족하면 적절 처리
	 */
	void buy(String product) {
		if(product.equals("tv") || product.equals("com") || product.equals("radio")) {
			if(product.equals("tv")) {
				if(this.money < tv) {
					System.out.println("금액 부족");
					return;
				}
				else money -= tv; 
			}
			else if(product.equals("com")) {
				if(this.money < com) {
					System.out.println("금액 부족");
					return;
				}
				else money -= com; 
			}
			else {
				if(this.money < radio) {
					System.out.println("금액 부족");
					return;
				}
				else money -= radio; 
			}
			add(product);
		} else { 
			System.out.println("올바른 상품명이 아닙니다");
		}
	}

	/* 매개변수로 넘어온 상품을 cart 배열에 순서대로 담아주기
	   cart배열이 꽉 찼다면, 2배 크기의 배열 크기로 늘리기
	   마지막은 info() 호출
	 */
	void add(String product) {
		if(cart.length < cnt) {
			String[] temp = new String[cart.length * 2];
			for(int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			cart = temp;
			temp = null;
		}
		cart[cnt-1] = product;
		cnt++;

		info();
	}


	// cart 배열에 담긴 물건 목록만 출력(null 제외) - Arrays.toString() 사용 x
	void info() {
		System.out.print("cart 목록: ");
		for(int i = 0; i < cnt - 1; i++) {
			System.out.print("(" + cart[i] + ") ");
		}
		System.out.println();
		System.out.println("남은 금액: " + money);
	}
}
