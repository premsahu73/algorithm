package com.recursion;

public class MoveChar {

	static String value = "";
	static int count = 0;

	public void moveChar(String str, int idx, char element) {
		if (idx >= str.length()) {
			for (int i = 1; i <= count; i++) {
				value += element;
			}
			return;
		}
		if (str.charAt(idx) != element) {
			value = value + str.charAt(idx);
		} else {
			count++;
		}
		moveChar(str, idx + 1, element);
	}

	public static void main(String[] args) {
		String str = "ahhxxxgxxjx";
		MoveChar moveChar = new MoveChar();
		moveChar.moveChar(str, 0, 'x');
		System.out.println(value + " count" + count);
	}

}
