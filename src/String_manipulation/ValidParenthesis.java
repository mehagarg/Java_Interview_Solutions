package String_manipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
//		String s = "((({{{}}})))";
//		String s = "123";
//		String s = "1()2{}3[]";
		String s = "1)2{}3[]";
		System.out.println(isValidParenthesis(s));
	}

	private static boolean isValidParenthesis(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		System.out.println(map.entrySet());
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<s.length(); i++){
			if(map.keySet().contains(s.charAt(i)) && stack.isEmpty()){
//				System.out.println("keyset = " + map.keySet() + "   char = " + s.charAt(i));
//				System.out.println();
				stack.push(s.charAt(i));
				System.out.println(stack.peek());
			}
			else if(map.containsValue(s.charAt(i))){
				if(!stack.isEmpty() && map.get(stack.peek()) == s.charAt(i)){
					System.out.println(stack.peek());
					stack.pop();
				} else{
					System.out.println(s.charAt(i));
					return false;
				}
			}
			
		}
		return stack.isEmpty();
	}

}
