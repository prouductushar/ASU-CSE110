/* -------------------------------------------------------------------------------
   Author: Tushar Tyagi
   Filename: Lab4.java
   Specification:

   This program is for practicing the switch statement, do-while,
   while, and for loops.

   Using a while loop calculate the sum of integers from 1 to n.

   Using a for loop find the factorial of n.

   Lab Letter: G
   -------------------------------------------------------------------------------*/

import java.util.Scanner;
public class Lab4
{
	public static void main(String[] args)
	{
		final int SUM = 1;
		final int FACTORIAL = 2;
		final int FACTORS = 3;
		final int QUIT = 4;

		int choice;

		Scanner in = new Scanner(System.in);
		do{
			System.out.println("1. Sum of number from 1 to n");
			System.out.println("2. Factorial of n");
			System.out.println("3. Factors of n");
			System.out.println("4. Quit");
			System.out.println("Please choose an option");
			choice = in.nextInt();
			switch(choice)
				{
				case SUM:

					System.out.println("Please enter a number n:");
					int n1 = in.nextInt();
					int sum = 0;
					int count1 = 0;
					while(count1<n1)
						{
						count1++;
						sum+=count1;
					}
					System.out.println("Sum of numbers from 1 to "+n1+" is "+sum);
					break;

				case FACTORIAL:

					System.out.println("Please enter a number n:");
					int n2 = in.nextInt();
					long fact = 1;
					for(int i = n2; i > 1; i--)
						{
						fact*=i;
					}
					System.out.println("Factorial of "+n2+" is "+fact);
					break;

				case FACTORS:

					System.out.println("Please enter a number n:");
					int n3 = in.nextInt();
					System.out.print("Factors of "+n3+" : ");
					for(int i = 1; i < n3; i++)
						{
							if(n3%i==0)
							{
								System.out.print(i+"  ");
						}
					}
					System.out.println("");
					break;

				case QUIT:

					System.out.println("Your choice was "+QUIT+". Quitting the program, Have a good day!");
					break;

				default:

					System.out.println("Incorrect choice "+choice+". Please choose again");

			}
		}while(choice!=QUIT);
	}
}





