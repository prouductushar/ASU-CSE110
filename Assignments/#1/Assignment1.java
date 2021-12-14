//-----------------------------------------------------
//Name: Tushar Tyagi
//Title Assignment1.Java
//Description: This is my First Assignment for CSE110!
//Date: 09/04/2021
//-----------------------------------------------------


//Part 1

/*

Both use a scanner to input the amount of dollars/seconds.

Q1) First the user is asked to input the number of dollars.

All the variables are defined and assigned values at the same time.
The amount is first divided by 100 to calculate the 100$ bills.
For subsequent bills, we use the modulus operator and then divide by the given amount(20$, 10$, 5$, and 1$ bills respectively).
Then, we define a variable named format including the formatting information for all lines and so, the output is printed on the basis of the given sample output!

Q2) First the user is asked to input the number of seconds.

All the variables are defined and assigned values at the same time.
The seconds are first divided by 86400 to get the number of days.
For subsequent values, we use the modulus operator and then divide by the given number of seconds(86400 seconds/day,3600 seconds/hour, and 60 seconds/minute).
Then, we define a variable named format2 including the formatting information for all lines and so, the output is printed on the basis of the given sample output!

*/

//Part 2

import java.util.Scanner;
public class Assignment1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

        System.out.println("\n*****************QUESTION 1********************\n");

		int amount;
		System.out.print("Please input the total amount of money:");
		amount= input.nextInt();

		int amtHundred=amount/100;
		int amtTwenty=(amount%100)/20;
		int amtFive=((amount%100)%20)/5;
		int amtOne=(((amount%100)%20)%5)/1;

		System.out.println("\n    $"+amount+" is");

		String format="%18s %4d %n";

		System.out.printf(format,"$100 Bills",amtHundred);
		System.out.printf(format,"$20  Bills",amtTwenty);
		System.out.printf(format,"$5   Bills",amtFive);
		System.out.printf(format,"$1   Bills",amtOne);

		System.out.println("\n*****************QUESTION 2********************\n");

		int seconds;
		System.out.print("Please input the total number of seconds:");
		seconds=input.nextInt();

		int days= seconds/86400;
		int hours= (seconds%86400)/3600;
		int minutes= ((seconds%86400)%3600)/60;
		int seconds2=(((seconds%86400)%3600)%60);

		System.out.println("\n    "+seconds+" seconds are");

		String format2="%15d %4s %n";

		System.out.printf(format2,days,"Days");
		System.out.printf(format2,hours,"Hours");
		System.out.printf(format2,minutes,"Minutes");
		System.out.printf(format2,seconds2,"Seconds");

		System.out.println("\n***************End of Program******************\n");
	}
}

