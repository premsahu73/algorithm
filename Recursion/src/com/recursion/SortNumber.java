package com.recursion;

public class SortNumber {

	public String sortNumber(int[] a, int idx, int max) {

		if (idx == max) {
			return "sorted";
		}
		if (a[idx] < a[idx + 1]) {
			return sortNumber(a, idx + 1, max);
		} else {
			return "Not sorted";
		}

	}

	public static void main(String[] args) {

		int a[] = { 10, 50, 20 };
		SortNumber sn = new SortNumber();
		System.out.println(sn.sortNumber(a, 0, a.length - 1));

	}

}
