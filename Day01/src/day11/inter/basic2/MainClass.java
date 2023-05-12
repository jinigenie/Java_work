package day11.inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tig = new Tiger();
		Fish gf = new GoldFish();
		
		Animal[] animals = {dog, cat, tig};
		
		for(Animal ani : animals) {
			ani.eat();
		}
		
		System.out.println("--------------------");
		
		// dog, cat은 Interface 타입으로 상호형변환
		IPet[] pets = new IPet[3];
		
		pets[0] = (IPet)dog;
		pets[1] = (IPet)cat;
		pets[2] = (IPet)gf;
		
		for(IPet p: pets) {
			p.play();
		}

		System.out.println("--------------------");
		
		PetHouse.carePet((IPet) dog);
		PetHouse.carePet((IPet) cat);
		PetHouse.carePet((IPet) gf);
	}
}
