/* ---------------------------------------------------------------------------------

   Author: Tushar Tyagi
   Filename: Lab10.java

   Specification: This program is for practicing object-oriented programming.
   Lab Letter: G

   Start Time: Nov 5 : 10:10 AM
   End Time: Nov 5 : 11:00 AM

   -------------------------------------------------------------------------------*/

   import java.util.Scanner;

   public class Lab10{
	   public static void main(String[] args){

		   Scanner in = new Scanner(System.in);
		   int[][] mat_A = new int[4][4];
		   int[][] mat_B = new int[4][4];
		   int[][] mat_C = new int[4][4];
		   int[][] mat_D = new int[4][4];

		   System.out.println("Enter values into mat_A:");
		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   mat_A[i][j]=in.nextInt();
			   }
		   }

		   System.out.println();
		   System.out.println("Matrix A is:");
		   System.out.println();

		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   System.out.print(mat_A[i][j]+"	");
		   	   }
		   	   System.out.println();
		   }

		   System.out.println();

		   System.out.println("Enter values into mat_B:");
		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   mat_B[i][j]=in.nextInt();
			   }
		   }

		   System.out.println();
		   System.out.println("Matrix B is:");
		   System.out.println();

		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   System.out.print(mat_B[i][j]+"	");
		   	   }
		   	   System.out.println();
		   }

		   System.out.println();
		   System.out.println("Addition of two matrices: Matrix C is:");
		   System.out.println();

		   int sum = 0;

		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   mat_C[i][j]=mat_B[i][j]+mat_A[i][j];
				   System.out.print(mat_C[i][j]+"	");
				   sum+=mat_C[i][j];
		   	   }
		   	   System.out.println();
		   }

		   System.out.println();
		   System.out.println("Sum of elements of matrix C is: "+sum);
		   System.out.println();

		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   mat_D[i][j]=mat_C[j][i];
		   	   }
		   }

		   System.out.println("Transpose of matrix C is:");
		   System.out.println();

		   for(int i = 0; i < 4; i++){
			   for(int j = 0; j < 4; j++){
				   System.out.print(mat_D[i][j]+"	");
		   	   }
		   	   System.out.println();
		   }

		   System.out.println();
		   in.close();
	   }
   }













