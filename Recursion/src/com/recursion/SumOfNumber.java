package com.recursion;

public class SumOfNumber {
	int sum = 0;

	public void add(int i, int n) {
		if (i > n) {
			System.out.println(sum);
			return;
		}
		sum = sum + i;
		add(i + 1,n);
	}

	public static void main(String[] args) {
		SumOfNumber sn = new SumOfNumber();
		sn.add(1,5);
	}
}
