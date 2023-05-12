package quiz01;

public class Quiz02 {
	public static void main(String[] args) {
		
		// 1~100 사이의 랜덤 정수 생성
	    int n = (int)(Math.random() * 100) + 1;
	    
	    // 랜덤 수가 3의 배수인지, 3의 배수가 아닌지 결과 출력
	    String res = n % 3 == 0 ? "참" : "거짓";
	    System.out.println(n + "은(는) " + res);
	}
}
