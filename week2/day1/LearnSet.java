package week2.day1;

import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
//		1. HashSet -> Random O/P
//		2. TreeSet -> ASCII
//		3. LinkedHashSet -> maintains the insertion order
		Set<String> set = new TreeSet<>(); 
		Set<Long> s = new TreeSet<>();
		s.add(12345567890l);
		set.add("koushik");
		set.add("Gayathri");
		set.add("Raja");
		set.add("Gopi");
		set.add("Gayathri"); // ignored duplicates values
		set.clear();
		System.out.println(set.isEmpty());
		/*List<String> ls = new ArrayList<>();
		ls.addAll(set);
		System.out.println(ls.get(0));*/
		
		/*System.out.println(set.size());
		for (String value : set) {
			System.out.println(value);
		}*/
	}

	
	
	
}








