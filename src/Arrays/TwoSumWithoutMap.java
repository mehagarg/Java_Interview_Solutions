package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumWithoutMap {

	/**
	 * http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
	 * Given an array A[] and a number x, check for pair in A[] with sum as x
	 * Write a C program that, given an array A[] of n numbers and another number x, 
	 * determines whether or not there exist two elements in S whose sum is exactly x. 
	 * Algorithm:

hasArrayTwoCandidates (A[], ar_size, sum)
1) Sort the array in non-decreasing order.
2) Initialize two index variables to find the candidate 
   elements in the sorted array.
       (a) Initialize first to the leftmost index: l = 0
       (b) Initialize second  the rightmost index:  r = ar_size-1
3) Loop while l < r.
       (a) If (A[l] + A[r] == sum)  then return 1
       (b) Else if( A[l] + A[r] <  sum )  then l++
       (c) Else r--    
4) No candidates in whole array - return 0
Time Complexity: Depends on what sorting algorithm we use. If we use Merge Sort or Heap Sort then (-)(nlogn) in worst case. If we use Quick Sort then O(n^2) in worst case.
Auxiliary Space : Again, depends on sorting algorithm. For example auxiliary space is O(n) for merge sort and O(1) for Heap Sort.
	 */
	public static void main(String[] args) {
		int a[] = {1, 4, 45, 6, 10, 8};
	    int n = 16;
	    
	    Arrays.sort(a);
	    for(int i=0; i<a.length; i++)
	    	System.out.println(a[i]);
	    
	    printPairs(a, n);
		
	}

	private static void printPairs(int[] a, int target) {
		int left = 0;
		int right = a.length-1;
		while(left<right){
			int sum = a[left] + a[right];
			if(sum == target){
				System.out.println(a[left] + " " + a[right]);
				break;
			}
			else if(sum<target){
				left++;
			}
			else{
				right--;
			}
		}

	}

}
