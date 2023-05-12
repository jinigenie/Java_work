package day10.static_.method;

public class MainClass {
	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01();
		
		//static 메소드의 사용
		Count.method02();
		
		MainClass mc = new MainClass();
		mc.test();
	}
	
	public void test() {
		
	}
}
