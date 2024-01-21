package com.recursion;

public class Keypad {

	static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	private static void keypadOccurance(String str, int idx, String occurance) {

		if (idx == str.length()) {
			System.out.println(occurance);
			return;
		}
		char currChar = str.charAt(idx);
		String mapping = keypad[currChar - '0'];

		for (int i = 0; i < mapping.length(); i++) {

			keypadOccurance(str, idx + 1, occurance + mapping.charAt(i));
		}

	}

	public static void main(String[] args) {
		String str = "23";
		keypadOccurance(str, 0, "");

	}
}
