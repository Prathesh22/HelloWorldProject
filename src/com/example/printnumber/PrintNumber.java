package com.example.printnumber;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i = 1; i <= 50; i++) {
	            System.out.println(i);
	        }
		 
		 // Print even numbers
		 PrintEvenNumbers p = new  PrintEvenNumbers();
		 p.PrintEven();
	}

}
