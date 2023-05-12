package day12.trycatch;

public class ThrowEx01 {

	public static void main(String[] args) {
		
//		int res = sum(-10);
		try {
			int res = sum(-10);
			System.out.println(res);
			
		} catch (Exception e) {
			String m = e.getMessage();
			System.out.println(m);
		}
		
	}
	
	public static int sum(int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("0 이상의 값이어야 합니다.");
		}
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
		
	}
}
