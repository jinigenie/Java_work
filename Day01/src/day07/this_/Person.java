package day07.this_;

public class Person {
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
