package week2day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class LearnMap {

	public static void main(String[] args) {
		//HashMap, TreeMap, LinkedHashMap
		Scanner sc = new Scanner(System.in);
		System.out.println("enter map size");
		int size =sc.nextInt();
		Map<Integer, String> empData = new HashMap<>();
		for (int i = 0; i < size; i++) {
			int empId = sc.nextInt();
			String empName = sc.next();
			//empData.put(sc.nextInt(), sc.next());
			empData.put(empId, empName);
		}
       /* empData.put(111, "babu");
        empData.put(102, "gopi");
        empData.put(113, "sarath");
        empData.put(104, "koushik");
        empData.put(102, "gayatri");*/
        for(Entry<Integer, String> eachEmp : empData.entrySet()) {
        	System.out.println(eachEmp.getKey()+" --> "+eachEmp.getValue());
        } 
        /*for(int key : empData.keySet()) {
        	System.out.println(key +" --> "+ empData.get(key));
        }*/
        //System.out.print(empData.entrySet()); 
        //System.out.println(empData.values());
        //System.out.println(empData.keySet());
        //System.out.println(empData.containsKey(104));
        //System.out.println(empData.containsValue("Babu"));
        //System.out.println(empData.get(102));  
	}

}








