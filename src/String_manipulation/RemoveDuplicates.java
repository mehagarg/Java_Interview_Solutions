package String_manipulation;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
	//http://www.geeksforgeeks.org/remove-all-duplicates-from-the-input-string/
	/*
	 * Below are the different methods to remove duplicates in a string.

METHOD 1 (Use Sorting)
Time Complexity: O(nlogn) If we use some nlogn sorting algorithm instead of quicksort.
Algorithm:

  1) Sort the elements.
  2) Now in a loop, remove duplicates by comparing the 
      current character with previous character.
  3)  Remove extra characters at the end of the resultant string.

Example:

Input string:  geeksforgeeks
1) Sort the characters
   eeeefggkkosss
2) Remove duplicates
    efgkosgkkosss
3) Remove extra characters
     efrgkos
     
     
  METHOD 2 (Use Hashing )   
     
	 */
	
	public static void main(String[] args) {
		String s1 = "geekforgeeks";
//		removeDuplicates(s1);
		System.out.println(removeDuplicates(s1));
	}
	
	public static String removeDuplicates(String s1){
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();		
		
		for(int i=0; i<s1.length(); i++){
			Integer freq = map.get(s1.charAt(i));
			map.put(s1.charAt(i), (freq==null)?1:freq+1);		
		}
		System.out.println(map.entrySet());
		
		StringBuilder result = new StringBuilder();
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			System.out.println(entry);
			if(entry.getValue()>1){
				map.put(entry.getKey(), 1);				
				
			}
			result.append(entry.getKey());
		}
		System.out.println(map.entrySet());
	
		return result.toString();
	}
	
	
	
	

}
