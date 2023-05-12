package day11.inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		Printed pt1 = new LG();
		
		pt1.print("hello world");
		pt1.colorPrint("hi world", "blue");
		int res = pt1.copy(5);

		System.out.println("------------------");
		
		Printed pt2 = new Samsung();
		
		pt1.print("hello world");
		pt1.colorPrint("hi world", "red");
		int result = pt1.copy(3);
		
		
	}
	
}
