package String_manipulation;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfString {
	public static void main(String[] args) {
		String s1 = "ABC";
		getPermutationString(s1);
	}

	private static void getPermutationString(String s1) {	
		getPermutationString(s1,"" );
	}

	private static void getPermutationString(String s1, String string) {
		if(s1.length() == 0){
			System.out.println(string);
		} else{
			for(int i=0; i<s1.length(); i++){
				getPermutationString(s1.substring(0, i) + s1.substring(i+1),
						string + s1.charAt(i));
			}
		}
	}


}
