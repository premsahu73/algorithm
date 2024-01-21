package com.recursion;

public class SubSequence {

	public void sequence(String str, int idx, String set) {

		if (idx == str.length()) {
			System.out.println(set);
			return;
		}
		sequence(str, idx + 1, set + str.charAt(idx));

		sequence(str, idx + 1, set);

	}

	public static void main(String[] args) {

		String str = "abc";
		SubSequence ss = new SubSequence();
		ss.sequence(str, 0, "");
	}

}
