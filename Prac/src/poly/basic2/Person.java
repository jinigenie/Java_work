package poly.basic2;

//부모클래스지만 최상위는 Object가 있음
//extends Object는 생략 가능
public class Person extends Object {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
//		System.out.println(this.info());
	}
	
	Person(String name){
		this(name, 20);
	}
	
	Person(){
		this("이름없음", 0);
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
