/* -------------------------------------------------------------------------------
   Author: Tushar Tyagi
   Filename: Lab8.java

   Specification: This program is for practicing arrays.

   Lab Letter: G

   Start Time: Oct 22 : 10:10 AM
   End Time: Oct 22 : 11:00 AM

   -------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab8{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int size;
		int[] int_arr;
		int_arr = new int[5];

		for(int i = 0; i < int_arr.length; i++){
			System.out.println("Please enter value for index "+i+":");
			int_arr[i] = scan.nextInt();
		}

		int sum=0;

		for(int i = 0; i < int_arr.length; i++){
			System.out.println("Value at index "+i+": "+int_arr[i]);
			sum+=int_arr[i];
		}

		System.out.println("\nThe sum of all the elements of the array: "+sum);
		System.out.println("\nArray after left rotation:\n");

		int first = int_arr[0];

		for(int i = 0; i < int_arr.length - 1; i++){
			int_arr[i]=int_arr[i+1];
		}

		int_arr[int_arr.length - 1] = first;

		for(int i = 0; i < int_arr.length; i++){
			System.out.println("Value at index "+i+": "+int_arr[i]);
			sum+=int_arr[i];
		}

		scan.close();
	}
}





