package com.recursion;

public class Factorial {


	public int  fact(int n) {

		if (n == 1 || n == 0) {
			return 1;
		}
		int fact = fact(n - 1);
		fact = fact * n;
		return fact;

	}

	public static void main(String[] args) {
		Factorial ft = new Factorial();
		System.out.println(ft.fact(5));
	}

}
