package day03;

public class Operator05 {
	public static void main(String[] args) {
		
		// 랜덤 함수 : 1 미만의 랜덤 double값 반환
		System.out.println( Math.random() ); 
		
		// 1~10 사이의 랜덤값 반환
		System.out.println( (int)(Math.random() * 10) + 1 );
		
		// 3항 연산식
		int result = (int)(Math.random()*10) + 1;
		String res = result % 2 == 0 ? "짝수" : "홀수";
		
		System.out.println(result + "은(는) " + res);
	}
}
