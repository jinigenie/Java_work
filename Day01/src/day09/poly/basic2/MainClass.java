package day09.poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person("hong", 30);
		Student s1 = new Student("kim", 20, "123123");
		Student s2 = new Student("han", 22, "345345");
		Teacher t1 = new Teacher("park", 40, "야구");
		Teacher t2 = new Teacher("Son", 43, "축구");
		Employee e1 = new Employee("kang", 50, "기획");
		
		Person[] arr = {p1, s1, s2, t1, t2, e1};
		
		for( Person p : arr) {
			System.out.println(p.info());
		}
		
		System.out.println("=========================");
		
		//House객체의 inHouse메소드 실행
		House h = new House();
		h.inHouse(p1);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		
//		h.printHouse();
		h.whoAreYou(p1);
	}
}
