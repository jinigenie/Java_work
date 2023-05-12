package day09.poly.basic2;

public class House {

	private Student[] student = new Student[100];
	private Employee[] employee = new Employee[100];
	private Teacher[] teacher = new Teacher[100];
	
	private int index;
	private Person[] person = new Person[100];
	
	
	public void inHouse(Person p) {
		person[index] = p;
		System.out.println(person[index].info());
		index++;
	}
	
	/*
	// 추가 -> 배열 안에 들어있는 객체 타입에 맞추어 출력
	public void printHouse() {
		
		for(int i = 0; i < index; i++){
			if(person[i] instanceof Student) {
				
				
			}
		
		}
	}
	*/
	
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
