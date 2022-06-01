package com.syntax.project01;

public class CodingTask10 {

	public static void main(String[] args) {
		int array[] = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };
	    int largest = array[0];
	    int secondLargest = array[0];
	   
	    for (int i = 0; i < array.length; i++) {
	
	      if (array[i] > largest) {
	        secondLargest = largest;
	        largest = array[i];
	
	      } else if (array[i] > secondLargest) {
	        secondLargest = array[i];
	
	      }
	    }
	
	    System.out.println("Second largest number is " + secondLargest);

	}

}
