package day11.inter.basic2;

public class GoldFish extends Fish implements IPet{

	public void swim() {
		System.out.println("금붕어는 어항에서 헤엄칩니다.");
	}

	public void play() {
		System.out.println("금붕어는 그냥 놉니다.");
	}

}
