package week2day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "TestLeaf";
		char[] ch = str.toCharArray();
		Map<Character, Integer> occurance = new LinkedHashMap<>();
		for (char c : ch) {
           if(occurance.containsKey(c)) {
        	   occurance.put(c, occurance.get(c)+1);
           }else {
        	   occurance.put(c, 1);
           }
		}
		System.out.println(occurance);
	}

}






