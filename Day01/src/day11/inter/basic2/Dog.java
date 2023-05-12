package day11.inter.basic2;

public class Dog extends Animal implements IPet {

	public void eat() {
		System.out.println("강아지는 사료를 먹습니다.");
	}
	
	public void play() {
		System.out.println("강아지는 공놀이를 합니다.");
	}

}
