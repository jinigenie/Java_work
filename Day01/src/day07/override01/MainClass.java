package day07.override01;

public class MainClass {
	public static void main(String[] args) {

		Parent p = new Parent();
		p.mathod01();
		p.mathod02();
		
		Child c = new Child();
		c.mathod01();
		c.mathod02();

	}
}
