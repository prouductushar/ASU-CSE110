//***********************************************************
// Name: Tushar Tyagi
// Title: Assignment7.java
// Author Info: Computer Science, 1222002808, Lab: G
// Description: This is the 7th assignment for CSE110.
// Date: 11/12/2021
//**********************************************************

//Importing Scanner

import java.util.Scanner;

public class Assignment7{
	public static void main(String[] args){

//Initializing Scanner and other constants/variables

		Scanner in = new Scanner(System.in);
		final char createNewCards = 'a';
		final char flipTheCards = 'b';
		final char shiftTheCards = 'c';
		final char shuffleTheCards = 'd';
		final char changeTheCards = 'e';
		final char displayMenu = '?';
		final char quit = 'q';
		char choice;
		int size;
		CardList cl = null;

//do-loop

		do{
			printMenu();
			System.out.println("\n\nPlease enter a command or type ?");
			choice = in.next().charAt(0);

//switch method for different cases

			switch(choice){

				case createNewCards:

					System.out.println("\ta [Create new cards]");
					System.out.print("\t[Input the size of cards]:");
					size = in.nextInt();
					cl = new CardList(size);
					System.out.println(cl.getHistory());
					break;

				case flipTheCards:

					System.out.println("\tb [Flip the cards]");
					cl.flip();
					System.out.println(cl.getHistory());
					break;

				case shiftTheCards:

					System.out.println("\tc [Shift the cards]");
					cl.shift();
					System.out.println(cl.getHistory());
					break;

				case shuffleTheCards:

					System.out.println("\td [Shuffle the cards]");
					cl.shuffle();
					System.out.println(cl.getHistory());
					break;

				case changeTheCards:

					System.out.println("\te [Change the cards]");
					System.out.print("\t[Input the number of cards to change]:");
					size = in.nextInt();
					cl.change(size);
					System.out.println(cl.getHistory());
					break;

				case quit:

					System.out.println("*** End of Program ***");
					break;

				default:

					System.out.println("\t[Invalid input] ");
					System.out.println();
					break;

			}

		}while(choice!=quit);

	}

//printMenu method

	public static void printMenu(){
	System.out.println("Command Options");
	System.out.println("-------------------------------------------");
	System.out.println("a: Create new cards");
	System.out.println("b: flip the cards");
	System.out.println("c: shift the cards");
	System.out.println("d: shuffle the cards");
	System.out.println("e: change the cards");
	System.out.println("?: Display the menu again");
	System.out.println("q: Quit this program");

	}
}


/*

Part 2: Coding Bat Exercises

1. swapEnds

public int[] swapEnds(int[] nums) {
  int temp;
  temp = nums[0];
  nums[0]=nums[nums.length-1];
  nums[nums.length-1]=temp;
  return nums;
}

2. commonEnd

public boolean commonEnd(int[] a, int[] b) {
  if(a[a.length-1]==b[b.length-1] || a[0]==b[0]){
    return true;
  }
  else{
    return false;
  }
}

3. countEvens

public int countEvens(int[] nums) {
  int evens = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i]%2==0){
      evens++;
    }
  }
  return evens;
}

4. sum13

public int sum13(int[] nums) {
  int sum = 0;
  for(int i = 0; i < nums.length; i++){
    if(nums[i]!=13){
      sum+=nums[i];
    }
    else{
      i++;
    }
  }
  return sum;
}

5. fix34

public int[] fix34(int[] nums) {
  int temp;
  int count;
  for(int i = 0; i < nums.length; i++){
    count = 0;
    if(nums[i]==3){
      for(int j = 0; j < nums.length; j++){
        if(nums[j]==4 && count==0 && nums[j-1]!=3){
          temp=nums[i+1];
          nums[i+1]=4;
          nums[j]=temp;
          count = 1;
        }
      }
    }
  }
  return nums;
}

*/



