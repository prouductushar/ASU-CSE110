public class Student{
	private String name01;
	private int age01;
	private String name02;
	private int age02;

	public Student(String username1, int age1, String username2, int age2 ){
		this.name01 = username1;
		this.age01 = age1;
		this.name02 = username2;
		this.age02 = age2;
	}

	public void setName(int num, String name){
		if(num==1){
			name01 = name;
		}
		else if(num==2){
			name02 = name;
		}
	}

	public void setAge(int num, int age){
		if(num==1){
			age01 = age;
		}
		else if(num==2){
			age02 = age;
		}
	}

	public void tostring(){
		System.out.println("Name is  :"+name01);
		System.out.println("Age is        :"+age01);
		System.out.println("Name is  :"+name02);
		System.out.println("Age is        :"+age02);
	}

}
