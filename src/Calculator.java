
public class Calculator {
	private double num1, num2;

	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double addition() {
		return this.num1 + this.num2;
	}

	public double subtraction() {
		return this.num1 - this.num2;
	}

	public double multiplication() {
		return this.num1 * this.num2;
	}

	public double division() {
		return this.num1 / this.num2;
	}
}
