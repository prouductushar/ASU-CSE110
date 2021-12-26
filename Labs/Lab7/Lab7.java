/* -------------------------------------------------------------------------------
   Author: Tushar Tyagi
   Filename: Lab7.java

   Specification: This program is for practicing the Object Oriented Programming.
   You need to develop the setName() method of Student Class and construct a
   simple system that can manage a student's name and age.

   Lab Letter: G

   Start Time: Oct 8 : 10:10 AM
   End Time: Oct 8 : 11:00 AM

   -------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab7{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String username1,username2;
		int age1,age2;

		System.out.println("Please Input Username for Student 1:");
		username1 = in.next();

		System.out.println("Please Input Age for Student 1:");
		age1 = in.nextInt();

		System.out.println("Please Input Username for Student 2:");
		username2 = in.next();

		System.out.println("Please Input Age for Student 2:");
		age2 = in.nextInt();

		Student student = new Student(username1, age1, username2, age2);

		final int PRINT = 0;
		final int MODIFY_USERNAME = 1;
		final int MODIFY_AGE = 2;
		final int QUIT = 3;

		int choice;

		do{
			System.out.println("This program does the following:");
			System.out.println("0.Print Information");
			System.out.println("1.Modify Username");
			System.out.println("2.Modify Age");
			System.out.println("3.Quit");

			choice = in.nextInt();

			switch(choice)
			{
				case PRINT:

					student.tostring();
					break;

				case MODIFY_USERNAME:

					String newName;
					System.out.println("Enter the student number that you wish to modify:(1/2)?:");
					int stu_num = in.nextInt();
					System.out.println("Please input new name:");
					newName = in.next();
					student.setName(stu_num,newName);
					break;

				case MODIFY_AGE:

					int newAge;
					System.out.println("Enter the student number that you wish to modify:(1/2)?:");
					stu_num = in.nextInt();
					System.out.println("Please input new age:");
					newAge = in.nextInt();
					student.setAge(stu_num,newAge);
					break;

				case QUIT:

					System.out.println("You choose to quit");
					break;

				default:

					System.out.println("Please Choose Again");
					break;

			}
		}while(choice!=QUIT);
		in.close();
	}
}



