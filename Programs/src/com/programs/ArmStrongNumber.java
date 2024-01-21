package com.programs;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		int n =1000;
		for(int j =1; j<n;j++) {
			int sum =0;
			int i = j;
			while(i!=0){
				int temp = i%10;
				sum = sum +(temp*temp*temp);
				i = i/10;
			}
			if(sum==j) {
				System.out.println("armstrong is  : "+sum);	
			}
			
		}

	}

}
