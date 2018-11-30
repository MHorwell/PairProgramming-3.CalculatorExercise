package calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(calculator(15, 5, 3));
		System.out.println(calculator(3, 5, 15));

	}

	public static String calculator(int numberOne, int numberTwo) {
		if (numberOne == numberTwo) {
			return (numberOne + " = " + numberTwo);
		}
		return "";
	}

	public static String calculator(int... number) {

		int count = number.length;

		if (count == 3) {

			if (calculator((number[0] / number[1]), number[2]).equals((number[0] / number[1]) + " = " + number[2])) {
				return (number[0] + " / " + number[1] + " = " + number[2]);
			}

			if (calculator((number[0] * number[1]), number[2]).equals((number[0] * number[1]) + " = " + number[2])) {
				return (number[0] + " * " + number[1] + " = " + number[2]);
			}

			if (calculator((number[0] + number[1]), number[2]).equals((number[0] + number[1]) + " = " + number[2])) {
				return (number[0] + " + " + number[1] + " = " + number[2]);
			}

			if (calculator((number[0] - number[1]), number[2]).equals((number[0] - number[1]) + " = " + number[2])) {
				return (number[0] + " - " + number[1] + " = " + number[2]);
			}
		
		}

		return "";
	}
}
