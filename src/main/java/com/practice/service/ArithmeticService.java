package com.practice.service;

public class ArithmeticService {
	
	public ArithmeticService() {
		
	}
	
	//We have 2 inputs, which are both Strings
	// We want to take these Strings and Convert them into numbers
	// So lets convert from a String to double
	public String add(String num1, String num2) {
		
		double number1 = Double.parseDouble(num1);
		double number2 = Double.parseDouble(num2);
		
		double result = number1 + number2;
		
		return "" + result;
	}

}
