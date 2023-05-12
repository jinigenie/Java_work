package poly.basic2;

public class House {

	public void whoAreYou(Person p) {

		if(p instanceof Student) {
			System.out.println("학생입니다.");
			Student s = (Student) p;
		} else if(p instanceof Teacher) {
			System.out.println("선생입니다.");
		} else if(p instanceof Employee) {
			System.out.println("직원입니다.");
		} else System.out.println("사람입니다.");

	}
}
