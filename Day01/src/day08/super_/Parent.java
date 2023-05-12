package day08.super_;

public class Parent {
	
	private String mother;
	private String father;
	
	/* 방법1
	Parent(){
		
	}
	*/
	
	Parent(String mother, String father){
		this.mother = mother;
		this.father = father;
	}
	
	public void setMother(String mother) {
		this.mother = mother;
	}
	
	public String getMother() {
		return mother;
	}
	
	public void setFather(String father) {
		this.father = father;
	}
	
	public String getFather() {
		return father;
	}
	
	String info() {
		return "name: " + mother + ", name: " + father;
	}
}
