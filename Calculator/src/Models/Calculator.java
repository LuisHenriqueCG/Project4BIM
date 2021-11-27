package Models;

public abstract class Calculator {
	double result;
	String operator;
	
	public double sum(double n1, double n2) { 
		return result = n1 + n2;
	}
	public double sub(double n1, double n2) {
		return result = n1 - n2;
	}
	public double div(double n1, double n2) {
		return result = n1 / n2;
	}
	public double mult(double n1, double n2) {
		return result = n1 * n2;
	}
}
