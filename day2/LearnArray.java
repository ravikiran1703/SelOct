package week1.day2;

import java.util.Scanner;

public class LearnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input number");
		int input = sc.nextInt();
		LearnArray array = new LearnArray();
		System.out.println(array.sumOfOddDigites(input));
	}
	private int sumOfOddDigites(int input) {
		int sum =0;
		while(input>0) {
			int num = input%10;
			if (num%2!=0) {
			   sum = sum+num;
			}
			input = input/10;
		}
		return sum;
	}
	
	

}










