package com.syntax.project01;

public class CodingTask8 {

	public static void main(String[] args) {
		int[] num = new int[10];
		num[0] = 0;
		num[1] = 1;
		System.out.print(num[0] + " " + num[1] + " ");

		for (int i = 2; i < 10; i++) {
			num[i] = num[i - 1] + num[i - 2];
			System.out.print(num[i] + " ");

	}
	}
}
