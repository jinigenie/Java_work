package day12.trycatch;

public class TryCatchEx02 {
	public static void main(String[] args) {
		
		// 반복문에서의 예외 처리
		String[] arr = {"홍길동", "이순신", "홍길자"};
		
		int i = 0;
		while( i < 4) {
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println("배열 범위 벗어남");
			} finally {
				System.out.println("");
			}
			
		i++;
		}
		System.out.println("정상 종료");
	}
}
