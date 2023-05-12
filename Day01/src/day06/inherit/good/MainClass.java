package day06.inherit.good;

public class MainClass {
	public static void main(String[] args) {
		
		Student std = new Student();
		std.age = 20;
		std.name = "김현진";
		std.studentId = "123456";
		System.out.println(std.info());
		
		Teacher t = new Teacher();
		t.age = 33;
		t.name = "홍길동";
		t.subject = "coding";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 34;
		e.name = "이순신";
		e.department = "개발";
		System.out.println(e.info());
		
	}
}
