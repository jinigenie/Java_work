package day07;

public class PhoneMain {

	public static void main(String[] args) {
		
		System.out.println("p1 객체 생성");
		Phone p1 = new Phone();
		p1.info();
		
		System.out.println("\np2 객체 생성");
		Phone p2 = new Phone("플립");
		p2.info();

		System.out.println("\np3 객체 생성");
		Phone p3 = new Phone("white", 100000);
		p3.info();
		
		System.out.println("\np4 객체 생성");
		Phone p4 = new Phone("아이폰프로", "white", 100000);
		p4.info();
	}
}
