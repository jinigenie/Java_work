package day13.collection.queue;

public class User implements Comparable<User> {

	private String name;
	private int age;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(User o) {
		// 자기 자신과 매개변수로 들어오는 User 객체의 멤버변수 값 비교
		// 앞의 값이 뒤의 값보다 사전적으로 앞이면 음수, 사전적으로 뒤이면 양수, 같으면 0
		
//		return this.name.compareTo(o.getName()); // 오름차순
//		return o.getName().compareTo(this.name); // 내림차순
//		return Integer.compare(this.age, o.getAge()); // 나이 오름차순
		return Integer.compare(o.getAge(), this.age); // 나이 내림차순
	}
	
	
	
}
