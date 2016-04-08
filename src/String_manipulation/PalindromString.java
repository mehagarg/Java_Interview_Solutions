package String_manipulation;

public class PalindromString {
	public static void main(String[] args) {
		String s1 = "aabcb";
		System.out.println(checkIfStringIsPalindromeRecurseive(s1));
		System.out.println(checkIfStringIsPalindromeIterative(s1));
	}
	
	private static boolean checkIfStringIsPalindromeRecurseive(String s1) {
		if(s1==null || s1.length()<2){
			System.out.println("exit condtion");
			return true;
		}
		
		//Recursive
		if(s1.charAt(0) == s1.charAt(s1.length()-1)){
			System.out.println(s1.substring(1, s1.length()-1));
			return checkIfStringIsPalindromeRecurseive(s1.substring(1, s1.length()-1));
		}
		return false;
	}
	
	
	private static boolean checkIfStringIsPalindromeIterative(String s1) {
		if(s1==null || s1.length()<2){
			System.out.println("exit condtion");
			return true;
		}
		// Iterative
		for(int i=0 ; i<s1.length()/2; i++){
			if(s1.charAt(i) == s1.charAt(s1.length()-1-i)){
				return true;
			}
		}
		return false;
	
	}
}
