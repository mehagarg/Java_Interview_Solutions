package String_manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://gist.github.com/hr1383/d9078aec997de34dab02

public class PrintAllSentencesFromAList {
	
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("you");
		l1.add("we");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("have");
		l2.add("are");
		
		List<String> l3 = new ArrayList<String>();
		l3.add("apples");
		l3.add("bananas");
		l3.add("oragnes");
		
		List<List<String>> l4 = new ArrayList<List<String>>();
		l4.add(l1);
		l4.add(l2);
		l4.add(l3);
		
		
		System.out.println(l4);
		
		int listIndex = 0;
		String output = "";
		printAllSentencesFromList(l4, listIndex, output );
	}

	private static void printAllSentencesFromList(List<List<String>> l4, int listIndex, String output) {
		if(l4.isEmpty()){
			System.out.println("Empty list");
		}
		if(listIndex == l4.size()){
			System.out.println(output);
			return;
		}
		
		for(String s:l4.get(listIndex)){
			printAllSentencesFromList(l4, listIndex+1, output + " " + s);
		}
	}

}
