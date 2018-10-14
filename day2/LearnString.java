package week1.day2;

import java.util.Scanner;

public class LearnString {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the size of array");
		String text = sc.next();
		String[] nameList = new String[5];
	//String text = "Hello World Java ";
		//System.out.println(text.charAt(4));
		//System.out.println(text.replace("l", "L"));
		//System.out.println(text.startsWith("H"));
		//System.out.println(text.contains("z"));
		Integer i = 10;
		String s = i.toString();
		//System.out.println(s+(10+20));
		char[] ch = text.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		
		
		
		
		//String text1 = new String("TestLeaf"); 
		/*int size = text.length();
        System.out.println(size);
       // text = text.concat("TestLeaf");
        System.out.println(text.concat(" TestLeaf"));*/
		//System.out.println(text.toUpperCase());
		///System.out.println(text.trim());
		//System.out.println(text.lastIndexOf("l"));
		
	}

}







