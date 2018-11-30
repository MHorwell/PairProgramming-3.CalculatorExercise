package calculator;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println(calculator(15, 5 , 3));
		
	}
	
	public static String calculator(int numberOne, int numberTwo) {
		if (numberOne == numberTwo) {
			return (numberOne + " = " + numberTwo);
		}
		return "";
	}
	
	
	public static String calculator(int numberOne, int numberTwo, int numberThree) {
		
		if (calculator((numberOne / numberTwo), numberThree).equals((numberOne / numberTwo) + " = " + numberThree)) {
				return (numberOne + " / " + numberTwo + " = " + numberThree);
			}
			
		if	(calculator((numberOne * numberTwo), numberThree).equals((numberOne * numberTwo) + " = " + numberThree)) {
				return (numberOne + " * " + numberTwo + " = " + numberThree);
			}
			
		if	(calculator((numberOne + numberTwo), numberThree).equals((numberOne + numberTwo) + " = " + numberThree)) {
				return (numberOne + " + " + numberTwo + " = " + numberThree);
			}
			
		if	(calculator((numberOne - numberTwo), numberThree).equals((numberOne - numberTwo) + " = " + numberThree)) {
				return (numberOne + " - " + numberTwo + " = " + numberThree);
			}
		
			return "";
		}
	}

	
