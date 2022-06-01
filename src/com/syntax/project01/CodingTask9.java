package com.syntax.project01;

public class CodingTask9 {

	public static void main(String[] args) {
		int[] num = { 2, 15, 3500, 1, 80, 20 };
		int max = 0;

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);

	}

}
