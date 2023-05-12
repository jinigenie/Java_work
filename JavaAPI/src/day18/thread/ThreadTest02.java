package day18.thread;

public class ThreadTest02 extends Thread {
	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {
			System.err.println("쓰레드를 상속받은 클래스 실행: " + i);
			
			try {
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
