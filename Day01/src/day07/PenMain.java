package day07;

public class PenMain {

	public static void main(String[] args) {
		// pen 객체 생성
		Pen pen = new Pen();
		
		pen.ink = "red";
		pen.price = 5000;
		pen.company = "모나미";
		
		pen.write();
		pen.info();
		
		System.out.println();
		
		Pen pen2 = new Pen();
		
		pen2.ink = "black";
		pen2.price = 1000;
		pen2.company = "하이테크";
		
		pen2.write();
		pen2.info();
	}
}
