package com.recursion;

public class PrintNumber {

	public void print(int n) {
		if(n ==0 ) 
			return ;
		System.out.println(n);
		print(n-1);
	}
	
	public static void main(String[] args) {
		PrintNumber pt = new PrintNumber();
		pt.print(10);

	}

}