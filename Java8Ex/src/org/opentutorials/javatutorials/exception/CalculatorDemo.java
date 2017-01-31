package org.opentutorials.javatutorials.exception;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.setOprands(3, 0);
		try {
			c.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println(e.left);
			System.out.println(e.right);
		}
	}
}
