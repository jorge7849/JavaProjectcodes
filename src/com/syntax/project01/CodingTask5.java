package com.syntax.project01;

public class CodingTask5 {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3, 4, 5 }, { 10, 25, 30, 45 }, { 100, 200, 300 } };
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					sumEven += num[i][j];
				} else {
					sumOdd += num[i][j];
				}
			}
		}
		System.out.println("Sum of Even numbers are " + sumEven);
		System.out.println("Sum of Odd numbers are " + sumOdd);


	}

}
