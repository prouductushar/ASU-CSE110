/* -------------------------------------------------------------------------------
   Author: Tushar Tyagi
   Filename: Lab9.java

   Specification: This program is for practicing the use of arrays.

   Lab Letter: G

   Start Time: Oct 29 : 10:10 AM
   End Time: Oct 29 : 11:00 AM

   -------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab9{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("Create an array of 10 Integers.");
		int[] ints = new int[10];

		System.out.println("Insert 8 integers into the Array.");
		for(int i = 0; i < 8; i++){
			ints[i]=in.nextInt();
		}

		System.out.println("Values in array are:");
		for(int i = 0; i < 8; i++){
			System.out.print(ints[i]+",");
		}
		System.out.println();

		System.out.println("Enter which location you want to insert:");
		int loc = in.nextInt();
		System.out.println("Enter which value you want to insert:");
		int value = in.nextInt();

		for(int i = 9; i > 1; i--){
			ints[i]=ints[i-1];
		}
		ints[loc-1]=value;

		System.out.println("Values in array are:");
			for(int i = 0; i < 9; i++){
				System.out.print(ints[i]+",");
			}
		System.out.println();

		System.out.println("Enter which location you want to delete:");
		loc = in.nextInt();
		for(int i = loc-1; i < 9; i++){
			ints[i] = ints[i+1];
		}

		System.out.println("Values in array are:");
			for(int i = 0; i < 8; i++){
				System.out.print(ints[i]+",");
			}
		System.out.println();

		System.out.println("Enter first swap location:");
		int first = in.nextInt();
		System.out.println("Enter second swap location:");
		int second = in.nextInt();

		int val = ints[first-1];
		ints[first-1] = ints[second-1];
		ints[second-1] = val;

		System.out.println("Values in array are:");
			for(int i = 0; i < 8; i++){
				System.out.print(ints[i]+",");
			}
		System.out.println();

	}
}



