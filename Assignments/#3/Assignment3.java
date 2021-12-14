//---------------------------------------------------------
//Name: Tushar Tyagi
//Title Assignment3.Java
//Description: This is my Third Assignment for CSE110!
//Date: 09/27/2021
//---------------------------------------------------------

/* 

Part 1: Writing Exercise

	a. 'a' : A
	         Input 0s and 1s in one line
	   'b' : B
	         Invalid command. Try again
	   'r' : R
	         The data is refreshed
	   'q' : Q
	         *** End of Program ***

	b.  Since temp is already converted to Upper Case and then
	    put into command, we dont need to test it for 'd' as the
	    case will already be included anyways.

		if(command == 'D'){
			System.out.println("Display the result");
		}

	c.  Values: num0 = 3
	            num1 = 4

	    This happens so because we enter a line of integers
	    and the while loop stays True until the last number.
	    For every 1, num1 increments by 1 and for every 0,
	    num0 increments by 0.

	d.  1) for(int i = num0; i > 0; i--)
	    2) for(int j = num1; i > 0; j--)

	e.  num0 = 0;
	    num1 = 0;
	    
*/

// Part 2: Programming

//This program reads a list of grades and displays the histogram and GPA in a specific format.

import java.util.Scanner;

public class Assignment3{
	public static void main(String[] args){

//Initiating Scanner and defining variables

		Scanner in = new Scanner(System.in);
		char choice;
		double A = 0;
		double B = 0;
		double C = 0;
		String asteriskA = "";
		String asteriskB = "";
		String asteriskC = "";
		String grades;

//Initialization of do loop

		do{
			System.out.println("Choose (A : Add Grades), (N : New Grades), or (Q : Quit)");
			String options = in.nextLine();
			choice = options.toUpperCase().charAt(0);

//Beginning of if-else statements for options

//A

			if(choice == 'A'){
				System.out.println("Type the additional input in single line");
				grades = in.nextLine();
				Scanner gradereader = new Scanner(grades);
				while(gradereader.hasNext()){
					String grade = gradereader.next();
					if(grade.toUpperCase().charAt(0) == 'A'){
						A++;
						asteriskA+="*";
					}
					else if(grade.toUpperCase().charAt(0) == 'B'){
						B++;
						asteriskB+="*";
					}
					else if(grade.toUpperCase().charAt(0) == 'C'){
						C++;
						asteriskC+="*";
					}
				}
				
//Print statements for histograph and GPA

				System.out.println("--------------------------------------");
				System.out.printf("%4s %s %n","A|",asteriskA);
				System.out.printf("%4s %s %n","B|",asteriskB);
				System.out.printf("%4s %s %n","C|",asteriskC);
				System.out.println("--------------------------------------");

//GPA

				double GPA = ((A*4.0)+(B*3.0)+(C*2.0))/(A+B+C);
				System.out.printf("%s %.2f %n","GPA = ", GPA);
			}

//N

			else if(choice == 'N'){
				A = 0;
				B = 0;
				C = 0;
				asteriskA = "";
				asteriskB = "";
				asteriskC = "";
				System.out.println("Type a new list of input in single line");
				grades = in.nextLine();
				Scanner gradereader = new Scanner(grades);
				while(gradereader.hasNext()){
					String grade = gradereader.next();
					if(grade.toUpperCase().charAt(0) == 'A'){
						A++;
						asteriskA+="*";
					}
					else if(grade.toUpperCase().charAt(0) == 'B'){
						B++;
						asteriskB+="*";
					}
					else if(grade.toUpperCase().charAt(0) == 'C'){
						C++;
						asteriskC+="*";
					}
				}

				System.out.println("--------------------------------------");
				System.out.printf("%4s %s %n","A|",asteriskA);
				System.out.printf("%4s %s %n","B|",asteriskB);
				System.out.printf("%4s %s %n","C|",asteriskC);
				System.out.println("--------------------------------------");

				double GPA = ((A*4.0)+(B*3.0)+(C*2.0))/(A+B+C);
				System.out.printf("%s %.2f %n","GPA = ", GPA);
			}

//Q

			else if(choice == 'Q'){
				System.out.println("*** End of Program ***");
			}

//else

			else{
				System.out.println("Invalid command was input!");
			}
		}while(choice != 'Q');
		in.close();
	}
}
