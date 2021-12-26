/* --------------------------------------------------------------------------------

   Author: Tushar Tyagi
   Filename: Lab11.java

   Specification: Practicing array of objects.
   Lab Letter: G

   Start Time: Nov 12 : 10:10 AM
   End Time: Nov 12 : 11:00 AM

   -------------------------------------------------------------------------------*/

import java.util.Scanner;

public class Lab11{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		String name;
		int marks;
		int num;
		int choice;
		System.out.println("Enter the total number of students");
		num = in.nextInt();
		Student2[] students = new Student2[num];
		
		for(int i = 0; i < num; i++){
			System.out.println("Enter name and marks of student");
			name = in.next();
			marks = in.nextInt();
			students[i] = new Student2(name,marks);
		}
		
		final int sum = 1;
		final int update = 2;
		final int swap = 3;
		final int max_marks = 4;
		final int quit = 5;
		
		do{
			System.out.println("This program will do the following:");
			System.out.println("1. Total Marks");
			System.out.println("2. Update a student's marks");
			System.out.println("3. Swap marks");
			System.out.println("4. Find maximum marks");
			System.out.println("5. Exit");
			System.out.println("Give your choice for the above options");
			choice = in.nextInt();
			
			switch(choice){
					
				case sum:
					
				      System.out.println("The sum of the marks is: "+sum(students));
				      break;
					
				case update:
					
				      System.out.println("Enter student name");
				      String nName;
				      nName = in.next();
				      System.out.println("Enter student marks");
				      int nMarks;
				      nMarks = in.nextInt();
				      update(students,nName,nMarks);
				      break;
					
				case swap:
					
				      System.out.println("Enter first student's name");
				      String name1;
				      name1 = in.next();
				      System.out.println("Enter second student's name");
				      String name2;
				      name2 = in.next();
				      swap(students, name1, name2);
				      break;
					
				case max_marks:
					
				      System.out.println("The maximum marks are: "+max(students));
				      break;
					
				case quit:
					
				      System.out.println("Exiting the program..");
				      break;
					
				default:
					
				      System.out.println("Invalid choice, try again!");
				      break;
					
			}
			
		}while(choice!=5);
		
		in.close();
	}

	public static int sum(Student2[] _student){
		int sum = 0;
    		for(int i = 0; i < _student.length; i++){
			sum+=_student[i].getMarks();
		}
		return sum;
	}

	public static void update(Student2[] _student, String _name, int _value){
		for(int i = 0; i < _student.length; i++){
			if(_name.equals(_student[i].getName())){
				_student[i].setMarks(_value);
			}
		}
		print(_student);
	}

	public static int max(Student2[] _student){
		int max = 0;
		for(int i = 0; i < _student.length; i++){
			if(_student[i].getMarks()>max){
				max = _student[i].getMarks();
			}
		}
		return max;
	}

	public static void swap(Student2[] _student, String name1, String name2){
		int index1 = 0;
		int index2 = 0;
		
		for(int i = 0; i < _student.length; i++){
			if(name1.equals(_student[i].getName())){
				index1 = i;
			}
			else if(name2.equals(_student[i].getName())){
				index2 = i;
			}
		}
		
		int temp = _student[index1].getMarks();
		_student[index1].setMarks(_student[index2].getMarks());
		_student[index2].setMarks(temp);
		print(_student);
	}

	public static void print(Student2[] _student){
		System.out.println("The list is :");
		for(int i = 0; i < _student.length; i++){
			System.out.println("Name : "+_student[i].getName()+", Marks : "+_student[i].getMarks());
		}
	}
}


