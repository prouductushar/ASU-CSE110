//---------------------------------------------------------
//Name: Tushar Tyagi
//Title Assignment2.Java
//Description: This is my Second Assignment for CSE110!
//             Topics include if,if/else,if/else if; other
//             expressions and string methods.
//Date: 09/18/2021
//---------------------------------------------------------


// Part 1: Writing Exercise

/*

	a) For Input (1,6,4), it returns a wrong output as (1,0,6), because
      after 'if(b-a>0)' is iterated, only the else loop is iterated
      which has an empty body and so middle is assigned no new value,
      thus continuing to be 0 itself.

   b) else{middle=c;}

   c) True; This is because the compareTo method compares two strings
      lexicographically and so, since Yoshi comes after Mario, then
      the condition: str1.compareTo(str2) is greater than 0 returning
      True.

   d) -32; Since the difference in the ascii codes of Y and y is that
      of 32, we get -32 when comparing 'Yoshi' with 'yoshi'.

   e) if (
 			str.toUpperCase().compareTo("A") >=0 &&
 			str.toUpperCase().compareTo("Z") <= 0
 		 )

*/



import java.util.Scanner;
public class Assignment2{
	public static void main(String[] args){

//Importing scanner and defining variables

		Scanner scanner=new Scanner(System.in);
		String s1,s2,s3;

//Inputting names and testing whether the first letter is an alphabet or not

		System.out.println("Please input the first name:");
		s1 = scanner.next().toUpperCase();
		if(s1.substring(0,1).compareTo("A")<=0 || s1.substring(0,1).compareTo("Z")>=0){
					System.out.println("Error: The first letter should be an alphabet");
					s1="";
		}

		System.out.println("Please input the second name:");
		s2 = scanner.next().toUpperCase();
		if(s2.substring(0,1).compareTo("A")<=0 || s2.substring(0,1).compareTo("Z")>=0){
					System.out.println("Error: The first letter should be an alphabet");
					s2="";
		}

		System.out.println("Please input the third name:");
		s3 = scanner.next().toUpperCase();
		if(s3.substring(0,1).compareTo("A")<=0 || s3.substring(0,1).compareTo("Z")>=0){
				System.out.println("Error: The first letter should be an alphabet");
				s3="";
		}

//Checking whether any string is an empty string and thus avoiding those in the inclusion for the algorithm to see what words come first lexicographically

//This one runs when all are perfect names

		if(!s1.equals("") && !s2.equals("") && !s3.equals("")){
			if(s1.compareTo(s2)>=0 && s1.compareTo(s3)>=0){
				if(s2.compareTo(s3)>=0){
					System.out.println(s3+", "+s2+", "+s1);
				}
				else{
					System.out.println(s2+", "+s3+", "+s1);
				}
			}
			else if(s2.compareTo(s1)>=0 && s2.compareTo(s3)>=0){
				if(s1.compareTo(s3)>=0){
					System.out.println(s3+", "+s1+", "+s2);
				}
				else{
					System.out.println(s1+", "+s3+", "+s2);
				}
			}
			else{
				if(s1.compareTo(s2)>=0){
					System.out.println(s2+", "+s1+", "+s3);
				}
				else{
					System.out.println(s1+", "+s2+", "+s3);
				}
			}
		}

//This is run when none are proper names

		if(s1.equals("") && s2.equals("") && s3.equals("")){
			System.out.println();
		}

//This one is run when s1 is not a proper name and then there are nested loops to check any other ones as well

		else if(s1.equals("")){
			if(s2.equals("")){
				System.out.println(s3);
			}
			else if(s3.equals("")){
				System.out.println(s2);
			}
			else{
				if(s2.compareTo(s3)>=0){
					System.out.println(s3+", "+s2);
				}
			    else{
					System.out.println(s2+", "+s3);
				}
			}
		}

//This one is run when s2 is not a proper name and then there are nested loops to check any other ones as well

		else if(s2.equals("")){
			if(s1.equals("")){
				System.out.println(s3);
			}
			else if(s3.equals("")){
				System.out.println(s1);
			}
			else{
				if(s1.compareTo(s3)>=0){
					System.out.println(s3+", "+s1);
				}
				else{
					System.out.println(s1+", "+s3);
				}
			}
		}

//This one is run when s3 is not a proper name and then there are nested loops to check any other ones as well


		else if(s3.equals("")){
			if(s1.equals("")){
				System.out.println(s2);
			}
			else if(s2.equals("")){
				System.out.println(s1);
			}
			else{
				if(s1.compareTo(s2)>=0){
					System.out.println(s2+", "+s1);
				}
				else{
					System.out.println(s1+", "+s2);
				}
			}
		}

//End of assignment/closing scanner

		System.out.println("\n*** END OF Assignment#2 ***");
		scanner.close();
	}
}



