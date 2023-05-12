package study02;

import java.util.Arrays;

public class Quiz01_hyeon {

	// 구매한 로또 번호 생성하는 메소드 정의
	public static int[] myLotto(int n1, int n2, int n3) {

		int[] arr = {n1, n2, n3, 0, 0, 0};
		int cnt = 3; // 로또 숫자 개수 저장하는 변수 선언

		while(cnt < 6) { 
			boolean x = false; // 중복되는 숫자가 있는지 검사하는 상태 변수 선언
			int n = (int)(Math.random()*45) + 1;
			
			for(int i = 0; i < cnt; i++) { 
				if(n == arr[i]) {   // 새로운 랜덤 숫자가 기존 숫자들 중에 있다면, 
					x = true;       // 상태 변수 값 변경
					break;
				}
			}
			if(!x) {                // 새로운 랜덤 숫자가 기존 숫자들 중에 없다면,
				arr[cnt++] = n;     // 배열에 랜덤 숫자 추가 및 카운트 증가
			}
		}
		return arr;
	}

	// 이번 주 새로운 로또 번호 생성하는 메소드 정의
	public static int[] lotto() {   // 위의 메소드와 동일, 숫자 6개 생성
		int[] arr = new int[6];
		int cnt = 0;

		while(cnt < 6) {
			boolean x = false;
			int n = (int)(Math.random()*45) + 1;
			for(int i = 0; i < cnt; i++) {
				if(n == arr[i]) {
					x = true;
					break;
				}
			}
			if(!x) {
				arr[cnt++] = n;
			}
		}

		return arr;
	}

	// 구매한 로또 번호와 이번 주 당첨 번호 비교
	public static void check(int[] mlot) {
		int count = 0;                // 같은 숫자 개수 저장할 변수 선언
		int[] lot = lotto();
		System.out.println("이번 주 로또 번호: " + Arrays.toString(lot));

		for(int x: lot) {        
			for(int y: mlot) {        // 이번주 로또 번호와 내 로또 번호 비교하여 
				if(x == y) count++;   // 같은 숫자만큼 카운트 증가
			}
		}
		System.out.println(count);
		switch (count) {
		case 6: 
			System.out.println("축하합니다. 1등 당첨입니다!");
			break;
		case 5: 
			System.out.println("축하합니다. 2등 당첨입니다!");
			break;
		case 4: 
			System.out.println("축하합니다. 3등 당첨입니다!");
			break;
		case 3: 
			System.out.println("축하합니다. 4등 당첨입니다!");
			break;
		default:
			System.out.println("아쉽지만 다음 기회로...");
		}
	}

	// 메인 함수
	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) { // 로또 5개 구매
			int[] myLot = myLotto(3, 17, 23);
			System.out.println("구매한 로또 번호: " + Arrays.toString(myLot));
			check(myLot);
			System.out.println("--------------------------------------");
		}

	}
}
