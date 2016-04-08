package String_manipulation;

import java.util.HashMap;
import java.util.Map;

//http://www.geeksforgeeks.org/return-maximum-occurring-character-in-the-input-string/
//Time Complexity: O(n)
/**
 * Notes:
	If more than one character have the same and 
	maximum count then function returns only the 
	first character in alphabetical order. 
	For example if input string is “test sample” 
	then function will return only ‘e’.
 */

public class MaxOccuringChar {

	public static void main(String[] args) {
		String s1 = "geekforgeeks";
		String s2 = "test sample";
		System.out.println(getMaxOccuringChar(s2));
	}

	public static Character getMaxOccuringChar(String s1){
		Character result = null;
		Map<Character, Integer> map = new HashMap<Character, Integer>();		
		
		for(int i=0; i<s1.length(); i++){
			Integer freq = map.get(s1.charAt(i));
			map.put(s1.charAt(i), (freq==null)?1:freq+1);		
		}
		System.out.println(map.entrySet());
		
		int max = Integer.MIN_VALUE;
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue() > max){
				max = entry.getValue();
				result = entry.getKey();
			}
		}		
		System.out.println(max);
		return result;
	}
}
