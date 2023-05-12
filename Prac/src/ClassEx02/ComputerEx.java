package ClassEx02;

public class ComputerEx {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		
		int[] values1 = {1, 2, 3};
		int r1 = com.sum1(values1);
		System.out.println("r1 : " + r1);
		
		int r2 = com.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("r2 : " + r2);
		
		int r3 = com.sum2(1, 2, 3);
		System.out.println("r3 : " + r3);
		
		int r4 = com.sum2(1, 2, 3, 4, 5);
		System.out.println("r4 : " + r4);
		
	}
}
