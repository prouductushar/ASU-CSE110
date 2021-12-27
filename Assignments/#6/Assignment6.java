//***********************************************************
// Name: Tushar Tyagi
// Title: Assignment6.java
// Author Info: Computer Science, 1222002808, Lab: G
// Description: This is the 6th assignment for CSE110.
// Date: 28/10/2021
//**********************************************************
import java.util.Scanner;

public class Assignment6 {
   public static void main (String[] args) {

//Initializing Scanner and other important variables
	   
	   Scanner console = new Scanner (System.in);
       	   String choice;
	   char command;

// numbers used for input in the various cases

	   int num1, num2;

// print the menu

	   System.out.println("*** Start of Program ***");
	   printMenu();

//Initializing Fraction

	   Fraction globalFraction = new Fraction(0,1);
	   Fraction subFraction = new Fraction(0,1);

	   do
	   {

// ask a user to choose a command

		   System.out.println("\n[Please enter a command or type ?] ");
		   choice = console.next().toLowerCase();
		   command = choice.charAt(0);

		   switch (command)
			{
			   case 'c':
				   
				   globalFraction = new Fraction(0,1);
				   System.out.println("Value:"+globalFraction.toString());
		            	   break;
				   
			   case '*':
				   
				   System.out.println("[Enter two numbers for a fraction to MULTIPLY] ");
				   num1 = console.nextInt();
			       	   num2 = console.nextInt();
				   subFraction = new Fraction(num1,num2);
			           System.out.print(globalFraction.toString()+" * "+subFraction.toString()+" = ");
				   globalFraction = globalFraction.multiply(globalFraction,subFraction);
				   System.out.print(globalFraction.toString()+"\n");
				   System.out.println("Value:"+globalFraction.toString());
				   break;
				   
			   case '/':
				   
				   System.out.println("[Enter two numbers for a fraction to DIVIDE] ");
				   num1 = console.nextInt();
				   num2 = console.nextInt();
				   subFraction = new Fraction(num1,num2);
				   System.out.print(globalFraction.toString()+" / "+subFraction.toString()+" = ");
				   globalFraction = globalFraction.divide(globalFraction,subFraction);
				   System.out.print(globalFraction.toString()+"\n");
				   System.out.println("Value:"+globalFraction.toString());
				   break;
			   
			   case '+':
				   
				   System.out.println("[Enter two numbers for a fraction to ADD] ");
				   num1 = console.nextInt();
			           num2 = console.nextInt();
				   subFraction = new Fraction(num1,num2);
				   System.out.print(globalFraction.toString()+" + "+subFraction.toString()+" = ");
				   globalFraction = globalFraction.add(globalFraction,subFraction);
				   System.out.print(globalFraction.toString()+"\n");
				   System.out.println("Value:"+globalFraction.toString());
				   break;
			   
			   case '-':
				   
				   System.out.println("[Enter two numbers for a fraction to SUBTRACT] ");
				   num1 = console.nextInt();
				   num2 = console.nextInt();
				   subFraction = new Fraction(num1,num2);
				   System.out.print(globalFraction.toString()+" - "+subFraction.toString()+" = ");
				   globalFraction = globalFraction.subtract(globalFraction,subFraction);
				   System.out.print(globalFraction.toString()+"\n");
				   System.out.println("Value:"+globalFraction.toString());
				   break;
			   
			   case '?':
				   
				   printMenu();
				   System.out.println("\nValue:"+globalFraction.toString());
				   break;
			   
			   case 'q':
				   
				   break;
			   
			   default:
				   
				   System.out.println("[Invalid input] " + command);
				   break;
		   
		   }
	   } while (command != 'q');
	   System.out.println("*** End of Program ***");
   }

//printMenu

   public static void printMenu()
   {
	System.out.print(
				   "\nCommand Options\n"
				   +"-----------------------------------\n"
				   +"c: reset the value\n"
				   +"+: add a fraction to the current value\n"
				   +"-: subtract a fraction from the current value\n"
				   +"*: multiply a fraction to the current value\n"
				   +"/: divide the current value by a fraction\n"
				   +"?: display the menu again\n"
				   +"q: quit this program\n");
   } // end of the printMenu method
}


