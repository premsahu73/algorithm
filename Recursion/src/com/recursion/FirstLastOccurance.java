package com.recursion;

public class FirstLastOccurance {
	static int firstOccurance = -1;
	static int lastOccurance = -1;
	public void find(String str, int idx,int length, char element) {
        
		if(idx == length) {
			return;
		}
		if(str.charAt(idx) == element) {
			if(firstOccurance == -1) {
				firstOccurance = idx;
			}
			lastOccurance = idx;
		}
		find(str,idx+1,length,element);
	}

	public static void main(String[] args) {
		String str ="apppoeijfhoolp";
		FirstLastOccurance fl = new FirstLastOccurance();
		fl.find(str,0,str.length()-1,'a');
        System.out.println(firstOccurance+" "+lastOccurance);
	}


}
