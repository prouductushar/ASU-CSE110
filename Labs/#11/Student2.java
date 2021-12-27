public class Student2{
	private String name;
	private int marks;

	Student2(String someName, int someMarks){
		name = someName;
		marks = someMarks;
	}

	public void setMarks(int newMarks){
		marks = newMarks;
	}

	public int getMarks(){
		return marks;
	}

	public String getName(){
		return name;
	}
}


