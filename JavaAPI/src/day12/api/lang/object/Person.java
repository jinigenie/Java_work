package day12.api.lang.object;

public class Person extends Object {

	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// alt + shift + s -> Override/Implement~
	@Override
	public boolean equals(Object obj) {
		
		//멤버변수 name 값이 같으면 true반환
		if(obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName() != null) {
				if(p.getName().equals(this.name)) {
					return true;
				}
			}
		}
		
		return false;
	}

	// alt + shift + s -> Generate toString~
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

	
	
}
