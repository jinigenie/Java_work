package quiz05;

public class Calculator {
	
	int result;
	double pi;
	
	void add(int n) {
		result += n;
		System.out.println("합 결과: " + result);
	}
	void sub(int n) {
		result -= n;
		System.out.println("차 결과: " + result);
	}
	double circle(int n) {
		pi = 3.14;
		return n * n * pi;
	}
}
