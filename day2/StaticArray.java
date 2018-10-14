package week1.day2;

import java.util.Scanner;

public class StaticArray {

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int[] employeeId = new int[size];

		for(int i =0; i<size; i++) {
			System.out.println("Enter the Employee Id: "+(i+1));
			employeeId[i] = sc.nextInt();
		}
		/*for(int i =0; i<employeeId.length; i++) {
		    System.out.println(employeeId[i]);
			}*/
         for(int eachId : employeeId) {
        	 System.out.println(eachId); 
         }











		/*int[] employeeId = {22, 34, 45, 56, 67, 89, 99};
    for(int i =0; i<employeeId.length; i++) {
    System.out.println(employeeId[i]);
	}*/
	}
}