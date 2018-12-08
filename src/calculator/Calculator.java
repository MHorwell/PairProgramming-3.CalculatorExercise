package calculator;

import java.util.Arrays;

public class Calculator {

	public static void main(String[] args) {
		calculator(2, 1, 3);

	}

	public static void calculator(int... number) {

		String list = Integer.toString(number[0]);
		calculator(list, number);

	}

	public static void calculator(String list, int[] number) {

		if (number.length == 2) {
			if (number[0] == number[1]) {
				System.out.println(list + "=" + Integer.toString(number[1]));
				//System.out.println(Integer.toString(number[0]) + "=" + Integer.toString(number[1]));
			} else {
				System.out.println(list + "!=" + Integer.toString(number[1]));
				//System.out.println(Integer.toString(number[0]) + "!=" + Integer.toString(number[1]));
				
			}
		}

		else {
			
			String multList = list + "*" + number[1];
			int[] multNum = reducer((number[0] * number[1]), number);
			calculator(multList, multNum);
			
			String addList = list + "+" + number[1];
			int[] addNum = reducer((number[0] + number[1]), number);
			calculator(addList, addNum);

			if (number[1] != 0 && number[0] % number[1] == 0) {
				String divList = list + "/" + number[1];
				int[] divNum = reducer(number[0] / number[1], number);
				calculator(divList, divNum);
			}
			
			String subList = list + "-" + number[1];
			int[] subNum = reducer(number[0] - number[1], number);
			calculator(subList, subNum);
		}

	}

	public static int[] reducer(int i, int[] array) {
		array[1] = i;
		return Arrays.copyOfRange(array, 1, array.length);
	}

}
