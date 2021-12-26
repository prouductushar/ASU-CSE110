/* -------------------------------------------------------------------------------
   Author: Tushar Tyagi
   Filename: Lab5.java

   Specification: This program is for practicing nested loops. It prints out a
   certain size of pyramid and triangle of stars.

   Instructions: Read the following code skeleton and add your own code according
   to the comments. Ask your TA or your classmatesfor help and/or clarification.
   When you see that //--> that is where you need to add code.

   Lab Letter: G
   -------------------------------------------------------------------------------*/

import java.util.Scanner;
public class Lab5{
	public static void main(String[] args){

		final int PYRAMID = 1;
		final int TRIANGLE = 2;
		final int QUIT = 3;

		Scanner in = new Scanner(System.in);

		int choice;
		int size;

		do{
			System.out.println("This program does the following:");
			System.out.println("1. Print a Pyramid");
			System.out.println("2. Print a Triangle");
			System.out.println("3. Quit");

			choice = in.nextInt();

			switch(choice)
				{

				case PYRAMID:

					System.out.println("Please input the Pyramid height:");
					size = in.nextInt();

					for(int i = 0; i < size; i++){
						for(int j = 0; j <= i; j++){
							System.out.print("* ");
						}
						System.out.println();
					}
					break;

				case TRIANGLE:

					System.out.println("Please input the Triangle height:");
					size = in.nextInt();
					int k = size - 1;

					for(int i = 0; i < size; i++){
						for(int j = 0; j < k; j++){
							System.out.print(" ");
						}
						for(int h = 0; h <= i; h++){
							System.out.print("* ");
						}
						k--;
						System.out.println();
					}
					break;

				case QUIT:

					System.out.println("Quitting the program as you requested...");
					break;

				default:

					System.out.println("Please choose again");
					break;

			}
			
		}while(choice!=QUIT);

		in.close();

	}
}





