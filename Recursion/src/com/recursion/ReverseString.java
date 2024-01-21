package com.recursion;

public class ReverseString {

	private void reverse(String str, int idx) {

		if (idx == -1) {
			return;
		}

		System.out.print(str.charAt(idx));
		reverse(str, idx - 1);

	}

	public static void main(String[] args) {
		String str = "qwertpoi";
		ReverseString rs = new ReverseString();
		rs.reverse (str,str.length()-1);

	}

}
