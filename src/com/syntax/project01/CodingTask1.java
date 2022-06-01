package com.syntax.project01;

import java.util.Scanner;

public class CodingTask1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
     int[] num=new int[4];
		System.out.println("Please enter 5 integer values");
		int sum=0;
		for(int i=0; i<num.length; i++) {
			num[i]=scan.nextInt();
			sum+=num[i];
		}
		System.out.println(sum);
		

	}

}
