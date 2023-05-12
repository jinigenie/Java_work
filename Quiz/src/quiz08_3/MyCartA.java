package quiz08_3;

public class MyCartA extends Cart {
	
	
	//1. 생성자는 money를 전달받고 money값 초기화, tv = 300, com = 400, radio = 500;
	
	MyCartA (int money) {
		super.money = money;
		super.tv = 300;
		super.com = 400;
		super.radio = 500;
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
	void buy (String product) {
		switch (product) {
		case "tv":
			if(super.money - tv <= 0) {
				System.out.println("잔고가 부족합니다.");
				return;
			} else {
				super.money -= tv;
				System.out.println("잔고는 " + super.money + "원 입니다.");
			}			
			break;
		case "com":
			if(super.money - com <= 0) {
				System.out.println("잔고가 부족합니다.");
				return;
			} else {
				super.money -= com;
				System.out.println("잔고는 " + super.money + "원 입니다.");
			}
			break;
		case "radio":
			if(super.money - radio <= 0) {
				System.out.println("잔고가 부족합니다.");
				return;
			} else {
				super.money -= radio;
				System.out.println("잔고는 " + super.money + "원 입니다.");
			}
			
			break;

		default:
			System.out.println("상품명을 다시 입력해주세요");
			
			break;
		}
		System.out.println(product);
		add(product);
	}
	
	
	
	/* add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉찼다면, 2배 크기의 카트배열로 옮겨주세요. 1->2->4->8
	 * if(
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	void add(String product) {
		if (i >= cart.length) {
			String[] newCart = new String[cart.length * 2];
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			cart = newCart;
			newCart = null;
		} 
		cart[i] = product;
		System.out.println(cart[i]);
		i++;
		
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
		for(int j = 0; j < i; j++) {
			str += cart[j];
		}
		System.out.print("카트 : " + str +" ");
		System.out.println();
	}
	
	}


