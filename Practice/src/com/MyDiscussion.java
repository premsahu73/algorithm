/**
 * 
 */
package com;

import java.util.ArrayList;

import java.util.Arrays;
public class MyDiscussion {
	private int[] arr;
    private int[] tempArr;
    private int length;
    public static void main(String a[]){
        int[] arr = {67,89,32,76,41,99,12,05,40,53};
		System.out.println("Array before sorting is ");
		for(int i=0;i < arr.length;i++){
		System.out.println(arr[i]);
		}		
		MyDiscussion mers = new MyDiscussion();
        mers.sort(arr);
		System.out.println("Array after sorting is ");
        for(int i:arr){
            System.out.println(i);
        }
    }
    public void sort(int arr[]) {
        this.arr = arr;
        this.length = arr.length;
        this.tempArr = new int[length];
        MergeMethod1(0, length - 1);
    }
    private void MergeMethod1(int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
        	System.out.println("lowIndex  "+lowIndex  +"highIndex  "+highIndex);
            int middle = lowIndex + (highIndex - lowIndex) / 2;
            MergeMethod1(lowIndex, middle);
            MergeMethod1(middle + 1, highIndex);
            mergeMethod2(lowIndex, middle, highIndex);
        }
    }
    private void mergeMethod2(int lowIndex, int middle, int highIndex) {
    	
    	System.out.println("lowIndex  "+lowIndex  +"highIndex  "+highIndex);
        for (int i = lowIndex; i <= highIndex; i++) {
            tempArr[i] = arr[i];
        }
        
        int i = lowIndex;
        int j = middle + 1;
        int k = lowIndex;
        while (i <= middle && j <= highIndex) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempArr[i];
            k++;
            i++;
        }
 
    }
}
