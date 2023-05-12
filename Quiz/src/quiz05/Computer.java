package quiz05;

public class Computer extends Calculator {

	double circle(int n) {
		return n * n * Math.PI;
	}
	
	double rect(double d) {
		return d * d;
	}
	
	double rect(double d1, double d2) {
		return d1 * d2;
	}
	
	double rect(double d1, double d2, double d3) {
		return d1 * d2 * d3;
	}
}
