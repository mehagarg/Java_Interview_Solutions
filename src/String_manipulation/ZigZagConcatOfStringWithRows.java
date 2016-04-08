package String_manipulation;

public class ZigZagConcatOfStringWithRows {
	/*
	 * http://www.geeksforgeeks.org/print-concatenation-of-zig-zag-string-form-in-n-rows/
	 * Print Concatenation of Zig-Zag String in ‘n’ Rows
Given a string and number of rows ‘n’. Print the string formed by concatenating n rows when input string is written in row-wise Zig-Zag fashion.
	 */

	public static void main(String[] args) {
		String s1 = "PALPALISHIRING";
		int noRows = 3;
		System.out.println(zigzag(s1, 3));
	}

	private static String zigzag(String s1, int noOfRows) {
		StringBuilder[] list = new StringBuilder[noOfRows];
		
		// initialize string builders
		for(int i=0; i<noOfRows; i++){
			list[i] = new StringBuilder();
		}
		int currRows = 0;
		boolean down = false;
		
		for(int i=0; i<s1.length(); i++){
			System.out.println("i = " + i + ", currRows = " + currRows );
			if(currRows<noOfRows){
				list[currRows].append(s1.charAt(i));
				if(currRows == 0){
					down = true;
				}
				if(currRows == noOfRows-1){
					down = false;
				}
				if(down){
					currRows++;
				} else{
					currRows--;
				}
			}
		}
		StringBuilder result = new StringBuilder();
		for(StringBuilder sb: list){
			result.append(sb);
		}
		
		return result.toString();
	}

}
