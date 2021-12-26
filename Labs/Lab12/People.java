public class People{

	private String name;
	private String number;

	public People(String _name, String _number){
		name = _name;
		number = _number;
	}

	public String getName(){
		return name;
	}

	public String getNumber(){
		return number;
	}

	public String toString(){
		return name + "\t" + number;
	}
}

