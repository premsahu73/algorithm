package com;

public class Practice {

	public static void main(String[] args) {

		String text = "AABAACAADAABAAABAA";
		String pattern = "AABA";
		for (int i = 0; i < text.length() - pattern.length(); i++) {
			int j;
			for(j = 0; j<pattern.length();j++) {
				if(text.charAt(i+j) != pattern.charAt(j)) {
					break;
				}
				
			}
			if (pattern.length()  == j ) {
				System.out.println("yes found");
			}
		}

	}
}
