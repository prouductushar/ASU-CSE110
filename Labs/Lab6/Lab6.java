/* -------------------------------------------------------------------------------
   Author: Tushar Tyagi
   Filename: Lab6.java

   Specification: This program is for practicing the use of Object Oriented
                  Programming. It also reviews some previous topics.

   Lab Letter: G

   Start Time: Oct 1 : 10:10 AM
   End Time: Oct 1 : 11:00 AM

   -------------------------------------------------------------------------------*/

   import java.util.Scanner;

   public class Lab6{
	   public static void main(String[] args){
		   Scanner scan = new Scanner(System.in);
		   String userName, accountNumber;
		   Double balance;

		   System.out.println("Please Enter UserName:");
		   userName = scan.next();

		   System.out.println("Please Enter Account Number:");
		   accountNumber = scan.next();

		   System.out.println("Please Enter Initial Account Balance:");
		   balance = scan.nextDouble();

           Account account = new Account(userName, accountNumber, balance);

		   final int DISPLAY_BALANCE = 0;
		   final int MODIFY_NAME = 1;
		   final int DEPOSIT = 2;
		   final int WITHDRAW = 3;
		   final int QUIT = 4;

		   int choice;

		   do{
			   System.out.println("This Program Does The Following:-");
			   System.out.println("Press 0 to Display User Account Information.");
			   System.out.println("Press 1 to Modify User Name.");
			   System.out.println("Press 2 to Make a Deposit.");
			   System.out.println("Press 3 to Make a Withdrawal.");
			   System.out.println("Press 4 to Quit.");

			   choice = scan.nextInt();

			   switch(choice)
			      {
				  case DISPLAY_BALANCE:

				     System.out.println("User Account Information is:");
				     System.out.println(account.toString());
				     break;

				  case MODIFY_NAME:

					 String newName;
				     System.out.println("Please Enter New Name:");
				     newName = scan.next();
					 userName = account.setName(newName);
					 break;

				  case DEPOSIT:

				     System.out.println("Please Enter Deposit Amount:");
					 double depositAmount = scan.nextDouble();
					 account.toCredit(depositAmount);
				     break;

				  case WITHDRAW:

				     System.out.println("Please Enter Withdrawal Amount:");
				     double withdrawalAmount = scan.nextDouble();
				     account.toDebit(withdrawalAmount);
				     break;

				  case QUIT:

				     System.out.println("Thank You. Have a nice day!");
				     break;

				  default:

				     System.out.println("Please enter a valid Option.");
				     break;
			   }
		   }while(choice!=QUIT);

		   scan.close();

	   }
}





