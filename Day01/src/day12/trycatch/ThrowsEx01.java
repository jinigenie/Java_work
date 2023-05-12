package day12.trycatch;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메소드나 생성자에서 발생되는 예외를 호출 문장으로 넘기는 키워드 throws
		 * throws 구문이 붙어있는 생성자나 메소드는 예외처리를 대신 진행해야 함
		 * 
		 * 즉, 예외처리를 강요할 때 사용
		 */
		try {
			greeting(10);
		} catch (Exception e) {
			System.out.println("에러 발생");
			e.printStackTrace(); // 에러 발생 시, 에러 로그를 확인하기 위해 많이 사용
		}
		
		//throws 예시
//		Class.forName("#$%@%")
		
		System.out.println("프로그램 정상종료");
	}

	private static String[] arr = {"a", "b", "c"};

	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);
	}
}
