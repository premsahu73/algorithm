package com.recursion;

public class TowerOfHanoi {


	private static void tower(int n, String source , String helper, String destination) {
		
		if(n == 1 ) {
			System.out.println("transfer disk "+n+" from "+source +" to "+destination);
			return;
		}
		tower(n-1,source,destination,helper);
		System.out.println("transfer disk "+n+" from "+source +" to "+destination);
		tower(n-1,helper,source,destination);
		
	}

	public static void main(String[] args) {
		
		int n = 3;
		tower(n,"S","H","D");

	}

}
