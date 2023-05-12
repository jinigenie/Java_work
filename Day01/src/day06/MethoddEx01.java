package day06;

public class MethoddEx01 {
	
	// 1~x까지 합을 반환하는 함수
	static int calSum(int x) {
		
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
		
	}
	
	// A~x까지 문자열 결합을 반환하는 함수
	static String calSum2(char x) {
		
		String str = "";
		for(char c = 'A'; c <= x; c++) {
			str += c;
		}
		return str;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(calSum(10));
		System.out.println(calSum(20));
		System.out.println(calSum2('H'));
		System.out.println(calSum2('Z'));
		
	}
}
