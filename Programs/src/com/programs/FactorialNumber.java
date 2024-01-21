package com.programs;

public class FactorialNumber {
	static int outs =1;
	public static void main(String[] args) {
		
		int number = 5;
		
		int factorial = new FactorialNumber().factorial(number);
		System.out.println("factorial  "+factorial);

	}

	public  int factorial(int number) {
		
		System.out.println(number);
		if(number==1) {
			return 1;
		}else {
			number = number*factorial(number-1);
		}
		return number;
	}

}
