package String_manipulation;

import java.util.HashSet;
import java.util.Set;

public class PalindromicPermutationString {
	public static void main(String[] args) {
		String s1 = "aabcb";
		String s2 = "aabbcadad";
		Set<String> set = new HashSet<String>();
		getPalindromicPermutationString(s1, set);
		
		for(String s: set){
			System.out.println(s);
		}
	}

	private static void getPalindromicPermutationString(String s1, Set<String> set) {
		getPermutationsOfString(s1, "", set);
//		boolean isPalindrome = checkIfStringIsPalindrome(s1);	
//		System.out.println(isPalindrome);
	}

	
	private static void getPermutationsOfString(String s1, String output, Set<String> set) {
		if(s1.length() == 0){
//			System.out.println(output);
//			System.out.println("--------");
			if(checkIfStringIsPalindrome(output)){
				set.add(output);
//				System.out.println(output);
			}
//			System.out.println("--------");
		}
		else{
			for(int i=0; i<s1.length(); i++){
				getPermutationsOfString(s1.substring(0,i) + s1.substring(i+1),
						output + s1.charAt(i), set);
			}
		}
	}

	private static boolean checkIfStringIsPalindrome(String s1) {
		if(s1==null || s1.length()<2){
//			System.out.println("exit condtion");
			return true;
		}
		
		//Recursive
		if(s1.charAt(0) == s1.charAt(s1.length()-1)){
//			System.out.println(s1.substring(1, s1.length()-1));
			return checkIfStringIsPalindrome(s1.substring(1, s1.length()-1));
		}
		return false;
	}
	
	
	
}
