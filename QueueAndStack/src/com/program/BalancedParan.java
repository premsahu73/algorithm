package com.program;

import java.util.Stack;

public class BalancedParan {

	public static void main(String[] args) {
		String str = "{{[[(())]]}}{[]}";
		int length = str.length();
		String flag = pop(str,length);
		System.out.println(flag);
	}

	private static String pop(String str, int length) {
		Stack<Character> stack = new Stack<Character>(); 
		for(int i = 0;i<length;i++) {
			char x = str.charAt(i);
			if(x == '[' || x == '{' || x == '(') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) 
				return "NO"; 

			switch(x){

			case ')' :
				if(stack.pop() != '(') {
					return "NO"; 
				}
				break;

			case '}' :
				if(stack.pop() != '{') {
					return "NO"; 
				}
				break;

			case ']' :
				if(stack.pop() != '[') {
					return "NO"; 
				}
				break;
			}
		}
		return stack.isEmpty() ? "YES" :"NO"; 
	}

}
