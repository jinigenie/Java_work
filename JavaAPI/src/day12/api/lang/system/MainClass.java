package day12.api.lang.system;

public class MainClass {
	public static void main(String[] args) {
		
		// System 클래스는 전부 static 메소드로 선언되어 있음
		
		
		// System.exit(0); // 프로그램 강제 종료
		long start = System.currentTimeMillis();
		long sum = 0;
		
		for(long i = 0; i < 1000000000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start)*0.001);
		
		
	}
}
