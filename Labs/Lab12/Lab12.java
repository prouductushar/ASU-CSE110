/* -------------------------------------------------------------------------------

   Author: Tushar Tyagi
   Filename: Lab12.java

   Specification: Practicing File IO.
   Lab Letter: G

   Start Time: Nov 19 : 10:10 AM
   End Time: Nov 19 : 11:00 AM

   -------------------------------------------------------------------------------*/

   import java.util.Scanner;
   public class Lab12{
	   public static void main(String[] args){

		   Scanner in = new Scanner(System.in);
		   int choice;
		   String name;
		   String number;
		   String path = "test.txt";
		   boolean EXIT = false;
		   PhoneBook pb = new PhoneBook(path);

		   while(!EXIT){
			   System.out.println("Select the action that you want to perform");
			   System.out.println("1. Add a record.");
			   System.out.println("2. Delete a record.");
			   System.out.println("3. Read records from file");
			   System.out.println("4. Save your records.");
			   System.out.println("5. Exit.");
			   System.out.println("Enter action number (1-5):");
			   choice = in.nextInt();
			   switch(choice){
				   case 1:
				   		System.out.println("Input the name of the record:");
				   		name = in.next();
				   		System.out.println("Input the phone number of the record");
				   		number = in.next();
				   		pb.add(name, number);
				   		pb.show();
				   		break;
				   case 2:
				   		System.out.println("Input the name of the record you want to delete:");
				   		name = in.next();
				   		pb.delete(name);
				   		pb.show();
				   		break;
				   case 3:
				   		pb.read();
				   		pb.show();
				   		break;
				   case 4:
				   		pb.save();
				   		break;
				   case 5:
				   		EXIT = true;
				   		System.out.println("Exiting the Program...");
				   		break;
				   default:
				   		System.out.println("Invalid Input!");
				   		break;
			   }
		   }
	   }
   }


