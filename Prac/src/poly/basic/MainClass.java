package poly.basic;

public class MainClass {
	public static void main(String[] args) {

		Parent p = new Child();
		p.method01();
		p.method02();
		// p.method03(); 사용 불가
		
		Child c = (Child)p;
		c.method01();
		c.method02();
		c.method03();
	}
}
