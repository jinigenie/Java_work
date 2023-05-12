package poly.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Person p1 = new Person("hong", 30);
		Student s1 = new Student("kim", 20, "123123");
		Student s2 = new Student("han", 22, "345345");
		Teacher t1 = new Teacher("park", 40, "야구");
		Teacher t2 = new Teacher("Son", 43, "축구");
		
		House h = new House();
		
		h.whoAreYou(p1);
		h.whoAreYou(s2);
		h.whoAreYou(t1);
	}
}
