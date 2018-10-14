package week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {

	public static void main(String[] args) {
	
	String data = "ABCDE1234f"; 
    String pat = "[A-Z]{5}[0-9]{4}[A-Z]"; 
    Pattern p = Pattern.compile(pat);
    Matcher m = p.matcher(data);
    System.out.println(m.matches());
    String text = "12s3Gftd";
    System.out.println(text.replaceAll("\\D", " "));  
	}

}










