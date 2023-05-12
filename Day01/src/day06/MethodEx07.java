package day06;

// 재귀함수
public class MethodEx07 {

	// 재귀테스트
	static void recursive(int a) {
		if(a == 10) return;
		a++;
		System.out.println(a);
		recursive(a);
	}

	// 팩토리얼
	static int fac(int a) {
		if (a == 1) return 1;
		return a * fac(a-1);
	}

	// 피보나치 수열
	static int fibo(int a) {
		if(a == 1 || a == 2) {
			return 1;
		}
		return fibo(a-1) + fibo(a-2);
	}

	public static void main(String[] args) {
		recursive(1);
		fac(5);
		for(int i = 1; i <= 10; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
}
