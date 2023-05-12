package day12.api.lang.wrapper;

public class AutoBoxingEx {
	public static void main(String[] args) {
		
		// Autoboxing: 기본타입 ~ 클래스 간의 자동형변환
		int a = 100;
		Integer val1 = a;
		
		int b = val1;
		
		Double val2 = 3.14;
		double c = val2;
		
		// 래퍼클래스의 기능
		// 문자열 => 기본형으로 변환
		int res1 = Integer.parseInt("10");
		double res2 = Double.parseDouble("3.14");
		long res3 = Long.parseLong("10");
		
		System.out.println(res1 + res2 + res3);
		
		// 앞에 값이 뒤보다 작으면 음수(-1), 크면 양수(1), 같으면 0 출력
		System.out.println(Integer.compare(3, 5)); 
		System.out.println(Integer.compare(5, 3)); 
		System.out.println(Integer.compare(5, 5)); 
		
		
		
	}
}
