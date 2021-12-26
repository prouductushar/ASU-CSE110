import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook{

	private String filePath = "";
	private ArrayList<People> infoList = new ArrayList<People>();

	public PhoneBook(String path){
		filePath = path;
	}

	public void add(String name, String number){
		People people = new People(name,number);
		infoList.add(people);
	}

	public void delete(String name){
		for(int i = 0; i < infoList.size(); i++){
			if(infoList.get(i).getName().equals(name)){
				infoList.remove(i);
			}
		}
	}

	public void save(){
		try{
			FileWriter writer = new FileWriter(filePath);
			for(int i = 0; i < infoList.size(); i++){
				writer.write(infoList.get(i).toString());
			}
			writer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void read(){
		try{
			File file = new File(filePath);
			Scanner in = new Scanner(file);
			while(in.hasNext()){
				String info = in.nextLine();
				String[] splits = info.split("\t");
				People p = new People(splits[0],splits[1]);
				infoList.add(p);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void show(){
		System.out.println("name"+"\t"+"number");
		for(int i = 0; i < infoList.size(); i++){
			System.out.println(infoList.get(i).toString());
		}
	}
}
