package com.recursion;

public class DuplicateElement {
	public static boolean[] map = new boolean[26];
	
	private void duplicate(String str, int idx) {
		
		if(idx == str.length()) {
			return;
		}
		int element = str.charAt(idx) - 'a';
		if(map[element] == false) {
			map[element] = true;
		}
		duplicate(str, idx+1);
	}
	
	public static void main(String[] args) {
		String str ="jhsdbjodkqwdf";
		DuplicateElement de = new DuplicateElement();
		de.duplicate(str,0);
		for(int i = 0;i < 26;i++) {
			if(map[i] == true) {
				int value = 97 +i;
			System.out.print((char)value);
			}
		}
	}

}
