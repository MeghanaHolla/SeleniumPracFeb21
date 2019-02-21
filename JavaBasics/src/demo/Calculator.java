package demo;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {// Formal Parameters
		System.out.println(a / b);
	}
	//Adding comment to see the changes in GIT Hub
	public static void main(String[] args) {

		Calculator basicCal = new Calculator();
		basicCal.add(10, 20);
		basicCal.add(50, 100);

		basicCal.subtract(100, 50);// Actual Parameters
		basicCal.multiply(10, 15);
		basicCal.divide(100, 5);
	}

}
