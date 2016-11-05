package methodOverloading;

import inheritance.Employee;

public class Calculator extends Employee {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		Employee Steve = new Employee();

		basicCal.add(20, 30);
		basicCal.add(10, 20, 30);
		//Steve.circular();
		//basicCal.circular();

	}

}
