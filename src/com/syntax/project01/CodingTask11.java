package com.syntax.project01;

public class CodingTask11 {

	public static void main(String[] args) {
		 String []  state= new String [] {"virginia", "texas", "california", "texas", "virginia", "maryland"};  
	        System.out.println("Duplicate elements in given array of strings ");  
	          
	        for(int i = 0; i < state.length; i++) {  
	            for(int j = i + 1; j < state.length; j++) {  
	                if(state[i] == state[j])  
	                    System.out.println(state[j]);  
	            }  
	        }  
	    }  

	

}
