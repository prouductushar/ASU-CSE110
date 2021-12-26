//-------------------------------------------------------
//Name: Tushar Tyagi
//Lab: G
//Title: Lab2.java
//Date: 09/03/21
//-------------------------------------------------------

import java.util.Scanner;

public class Lab2
{
	public static void main(String[] args)
	{

//Part 1
		
		int age;
		int n1,n2,n3,n4;
		double avg;

		String firstName;
		String lastName;
		String fullName;

//Part 2

		age = 17;
		firstName = "Tushar";
		lastName = "Tyagi";
		System.out.println(firstName+" is "+age+" years old!");
		fullName = firstName + " " + lastName;
		System.out.println(fullName);

//Part 3

		Scanner input = new Scanner(System.in);
		System.out.println("Enter n1:");
		n1 = input.nextInt();
		System.out.println("Enter n2:");
		n2 = input.nextInt();
		System.out.println("Enter n3:");
		n3 = input.nextInt();
		System.out.println("Enter n4:");
		n4 = input.nextInt();
		System.out.println("The value of n1 is: "+n1);
		System.out.println("The value of n2 is: "+n2);
		System.out.println("The value of n3 is: "+n3);
		System.out.println("The value of n4 is: "+n4);
		avg = (double)(n1+n2+n3+n4)/4;
		System.out.println("The average of the 4 numbers is: "+avg);
	}
}


