package com.syntax.project01;

import java.util.Scanner;

public class Codingtask2 {

	public static void main(String[] args) {
		String[] country = new String[4];
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an array of countries");
		String capital = null;

		for (int i = 0; i < country.length; i++) {
			country[i] = input.next();
			if (country[i].equalsIgnoreCase("USA")) {
				capital = "Washington DC";
			} else if (country[i].equalsIgnoreCase("France")) {
				capital = "Paris";
			} else if (country[i].equalsIgnoreCase("Austria")) {
				capital = "Vienna";
			} else {
				capital = "Unknown";
			}
			System.out.println("The capital for " + country[i] + " is " + capital);
		}
		
		//another loop
		for(String x:country) {
		x=input.next();
			if(x.equalsIgnoreCase("usa")) {
				capital = "Washington DC";
			}else if (x.equalsIgnoreCase("France")) {
				capital = "Paris";
			} else if (x.equalsIgnoreCase("Austria")) {
				capital = "Vienna";
			} else {
				capital = "Unknown";
			}
			System.out.println("The capital for " + x + " is " + capital);

		}
	
	}

}
