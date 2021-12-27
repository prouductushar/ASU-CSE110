//---------------------------------------------------------
//Name: Tushar Tyagi
//Title Assignment4.Java
//Description: This is my Fourth Assignment for CSE110!
//Date: 10/02/2021
//---------------------------------------------------------

//Importing Scanner

import java.util.Scanner;

//Starting main method

public class Assignment4{
	public static void main(String[] arg){

//Initializing Scanner and Other Important Variables

		String command;
		Scanner in = new Scanner(System.in);
		FiveCards myCards = new FiveCards();
		int pos;

//Beginning of do loop

		do{
			System.out.println("Choose (A: new), (B: changeOne), (C: Display) or (Q: quit)");
			command = in.next();

//Case : A

			if(command.toUpperCase().charAt(0) == 'A'){
				System.out.println(" *** Make A new FiveCards ***");
				System.out.println("Type five letters without space");
				String str = in.next();
				myCards.setCards(str);
				myCards.calculateScore();
				System.out.println(myCards.displayData());
			}

//Case : B

			else if(command.toUpperCase().charAt(0) == 'B'){
				System.out.println(" *** Change One Card ***");
				System.out.println("Type one position to change");
				pos = in.nextInt();
				myCards.changeOne(pos);
				myCards.calculateScore();
				System.out.println(myCards.displayData());
			}

//Case : C

			else if(command.toUpperCase().charAt(0) == 'C'){
				System.out.println(" *** Display Data ***");
				System.out.println(myCards.displayData());
			}

//Case : Q

			else if(command.toUpperCase().charAt(0) == 'Q'){
				System.out.println(" ***End of Program ***");
			}

//Invalid Command

			else{
				System.out.println(" *** Invalid Command. Try Again ***");
			}

//While condition and closing scanner

		}while(command.toUpperCase().charAt(0)!='Q');
		in.close();
	}
}



