package String_manipulation;

public class CombinationSetOfString {
	public static void main(String[] args) {
		String s1 = "ABCD";
		combinationSet(s1);
	}

	private static void combinationSet(String s1) {
		int len = s1.length();
		int opSize = (int) Math.pow(2, len);
		System.out.println(opSize);
		
		// for power(2, len of string), get the no. of output possibilities
		for(int counter=1; counter< opSize; counter++){
//			System.out.print("counter " + counter);
			// for string len from 0 to len
			for (int j=0; j<len; j++){
				
//				int result = counter & (1<<j);
//				System.out.print("    j = " + j  + "     result =" + result);
				
//				check which bits are ON
				if((counter & (1<<j))!=0){
					
//					System.out.print(" print= " + s1.charAt(j));
					System.out.print(s1.charAt(j));
				}
			
			}
			System.out.println();
		}
		
		System.out.println("null ");
		
				
	}
	
}
