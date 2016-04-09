package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * http://www.geeksforgeeks.org/check-if-an-array-can-be-divided-into-pairs-whose-sum-is-divisible-by-k/
 Check if an array can be divided into pairs whose sum is divisible by k
Given an array of integers and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Examples:

Input: arr[] = {9, 7, 5, 3}, k = 6
Output: True
We can divide array into (9, 3) and (7, 5).
Sum of both of these pairs is a multiple of 6.

Input: arr[] = {92, 75, 65, 48, 45, 35}, k = 10
Output: True
We can divide array into (92, 48), (75, 65) and 
(45, 35). Sum of all these pairs is a multiple of 10.

Input: arr[] = {91, 74, 66, 48}, k = 10
Output: False
 */

public class TwoMultiplePair {
	public static void main(String[] args) {
		int a[] = {9, 7, 5, 3};
	    int n = 6;	    
	    System.out.println(printPairs(a, n));
		
	}
	

	private static boolean printPairs(int[] a, int target) {
		// An odd length array cannot be divided into pairs
		int n = a.length;
	    if ((n & 1) !=0){
	    	System.out.println(n&1);
	        return false;
	    }
	    
	    // Create a frequency array to count occurrences
	    // of all remainders when divided by k.
		Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
		
		// Count occurrences of all remainders
	    for (int i = 0; i < n; i++){
	    	freq.put(a[i] % target, i);
	    }

	    // Traverse input array and use freq[] to decide
	    // if given array can be divided in pairs
	    for (int i = 0; i < n; i++)
	    {
	        // Remainder of current element
	        int rem = a[i] % target;
	 
	        // If remainder with current element divides
	        // k into two halves.
	        if  (2*rem == target)
	        {
	            // Then there must be even occurrences of
	            // such remainder
	            if (freq.get(rem) % 2 != 0)
	                return false;
	        }
	 
	        // If remainder is 0, then there must be two 
	        // elements with 0 remainder
	        else if (rem == 0)
	        {
	           if ((freq.get(rem) & 1) !=0)           
	               return false;
	        }        
	 
	        // Else number of occurrences of remainder
	        // must be equal to number of occurrences of
	        // k - remainder
	        else if (freq.get(rem) != freq.get(target - rem))
	            return false;
	    }
	    return true;

	}
}
