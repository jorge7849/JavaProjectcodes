package com.syntax.project01;

import java.util.Scanner;

public class CodingTask7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		boolean prime = false;

		if (num == 0 || num == 1) {
			prime = false;
		} else if (num == 2 || num == 3) {
			prime = true;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			} else if (num % i != 0) {
				prime = true;
			}
		}

		if (prime) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");

	}
	}
}
