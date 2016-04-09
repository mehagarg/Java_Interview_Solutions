package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingMap {

	/**
	 * http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
	 * Given an array A[] and a number x, check for pair in A[] with sum as x
	 * Write a C program that, given an array A[] of n numbers and another number x, 
	 * determines whether or not there exist two elements in S whose sum is exactly x. 
	 * 
	 */
	public static void main(String[] args) {
		int a[] = {1, 4, 45, 6, 10, 8};
	    int n = 16;
	    
	    printPairs(a, n);
		
	}

	private static void printPairs(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++){
			if(map.containsKey(a[i])){
				int prevIndex = map.get(a[i]);
				int currIndex = i;
				System.out.println(a[prevIndex] + " " + a[currIndex]);
			}
			map.put(target-a[i], i);	
		}
	}

}
