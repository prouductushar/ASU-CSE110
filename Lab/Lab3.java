//----------------------------------------------------------
//Author: Tushar Tyagi
//Filename: Lab3.java
//Specification: This program is for practicing the use of
//               if-else conditional expressions. It also
//               reviews some previous topics. It also finds
//               the dictionary order of two strings.
//Lab Letter: G
//Start Time: 10:10AM
//End Time: 11:00AM
//----------------------------------------------------------

import java.util.Scanner;

public class Lab3
{
	public static void main(String[] args)
	{

//Initializing and taking in values of n1,n2,n3,n4

		double n1,n2,n3,n4,ans,max,min;
		String s1;
		Scanner in= new Scanner(System.in);
		System.out.println("Input four integers on which we want to perform Mathematical Operations!");
		n1=in.nextDouble();
		n2=in.nextDouble();
		n3=in.nextDouble();
		n4=in.nextDouble();

//Print Statements for user to choose value for s1

		System.out.println("Please input one of the following operations:");
		System.out.println("Type a to Add the numbers");
		System.out.println("Type b to Multiply the numbers");
		System.out.println("Type c to find Avg");
		System.out.println("Type d to find Max");
		System.out.println("Type e to find Min");
		s1=in.next();

//if-else statements for each condition

		if(s1.equals("a")) {
			System.out.println("Sum:"+(n1+n2+n3+n4));
		}

		else if(s1.equals("b")) {
			System.out.println("Multiplication:"+(n1*n2*n3*n4));
		}

		else if(s1.equals("c")) {
			System.out.println("Average:"+((n1+n2+n3+n4)/4));
		}

		else if(s1.equals("d")) {
			max=n1;
			if(max<n2) {
				max=n2;
			}
			if(max<n3) {
				max=n3;
			}
			if(max<n4) {
				max=n4;
			}
			System.out.println("Max:"+max);
		}

		else if(s1.equals("e")) {
			min=n1;
			if(min>n2) {
				min=n2;
			}
			if(min<n3) {
				min=n3;
			}
			if(min<n4) {
				min=n4;
			}
			System.out.println("Min:"+min);
		}
		else {
			System.out.println("Error");
		}

//Part 2: Comparing 2 Strings; Initializing and taking values for str1 and str2

		String str1,str2;
		System.out.println("We are now comparing 2 strings and finding which one will come first in a dictionary");
		System.out.println("Please enter 2 strings of length 4");
		System.out.println("Enter String 1:");
		str1=in.next();
		System.out.println("Enter String 2:");
		str2=in.next();

//Initializing and Defining firstString & lastString

		String firstString="";
		String lastString="";

//if-else loops for comparison between the two

		if(str1.charAt(0)>str2.charAt(0)) {
			firstString=str2;
			lastString=str1;
		}
		else if((str1.charAt(0))==(str2.charAt(0))) {
			if(str1.charAt(1)>str2.charAt(1)) {
				firstString=str2;
				lastString=str1;
			}

			else if((str1.charAt(1))==(str2.charAt(1))) {
				if(str1.charAt(2)>str2.charAt(2)) {
					firstString=str2;
					lastString=str1;
				}

				else if((str1.charAt(2))==(str2.charAt(2))) {
					if(str1.charAt(3)>(str2.charAt(3))) {
						firstString=str2;
						lastString=str1;
					}

					else if((str1.charAt(3))==(str2.charAt(3))) {
						firstString=str1;
						lastString=str2;
					}
					else {
						firstString=str1;
						lastString=str2;
					}
				}

			    else {
					firstString=str1;
					lastString=str2;
				}
			}
		}

		else {
			firstString=str1;
			lastString=str2;
		}

//Final Print Statements

			System.out.println("First String is: "+firstString);
			System.out.println("Second String is: "+lastString);
			in.close();
	}
}





