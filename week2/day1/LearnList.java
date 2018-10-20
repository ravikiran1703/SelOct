package week2.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// <> -> Generic
		
		
		
		
		
		/*for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).startsWith("G")) {
				ls.remove(i);
			}
		}
		for (String string : ls) {
			System.out.println(string);
		}*/
		
		/*System.out.println("Sorted");
		Collections.sort(ls);
		for (String string : ls) {
			System.out.println(string);
		}
		System.out.println("Shuffle");
		Collections.shuffle(ls);
		for (String string : ls) {
			System.out.println(string);
		}*/
		List<String> ls = new ArrayList<>();
		ls.add("koushik");
		ls.add("Gayathri");
		ls.add("Raja");
		ls.add("Gopi");
		ls.add("Gayathri");		
		System.out.println(ls.size());
		
		for (int i = 0; i < ls.size();) {
			if (ls.get(i).startsWith("G")) {
				ls.remove(i);
			} else {
				i++;
			}
		}
		System.out.println(ls);
		
		/*int size = ls.size();
		System.out.println(size);
		// Allows null value
		ls.remove("Gayathri1");
		ls.remove("Gayathri1");
		ls.remove("Gayathri1");
		System.out.println(ls.contains("Gayathri"));
		System.out.println(ls.get(3));
		ls.clear();
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());*/
	}

}




