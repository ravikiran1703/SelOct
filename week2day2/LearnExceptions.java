package week2day2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptions {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 try { 
	  int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a/b);
      if (a>10) {
		throw(new StringIndexOutOfBoundsException());
	}
      }catch(Exception e){
    	  System.out.println("should not enter zero");
      }finally {
		System.out.println("its always run"); 
	}
	 
	 
	 /*catch(ArithmeticException e){
    	  System.out.println("should not enter zero");
      }catch(InputMismatchException e) {
    	  System.out.println("enter only numbers");
      }catch(Exception e) {
    	  System.out.println("something wrong");
      }*/
	}
}





