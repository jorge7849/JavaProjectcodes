package com.syntax.project01;

public class CodingTask3 {

	public static void main(String[] args) {
		int [][] number= {
				{1, 23, 65},
				{5, 33, 44},
				{54, 93, 6}
				};
			
		int sum=0;
		
		for(int i=0; i<number.length; i++) {
			for(int j=0; j<number[i].length; j++) {
				sum+=number[i][j];
			}
			
			
		}
		System.out.println(sum);

	}

}
