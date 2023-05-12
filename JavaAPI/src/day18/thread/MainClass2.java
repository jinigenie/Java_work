package day18.thread;

public class MainClass2 {
	public static void main(String[] args) {
		
		ThreadTest02 thread = new ThreadTest02();
		thread.setName("Thread_B");
		thread.start();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
	}
}
