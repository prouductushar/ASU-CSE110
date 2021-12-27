//Importing Random

import java.util.Random;

public class FiveCards{

//Initializing private Variables

	private String cards;
	private int score;
	private int changes;
	private String history;

//Constructor method

	public FiveCards(){
		cards = "";
		score = 0;
		changes = 0;
		history = "";
	}

//setCards method

	public void setCards(String str){
		cards = str;
		changes++;
	}

//changeOne method

	public void changeOne(int pos){
		String cards13 = "1234567890JQK";
		String cards2 = cards;
		cards="";
		double randomNumber = Math.random()*13;
		for(int i = 0; i < cards2.length(); i++){
			if(i==pos){
				char randomchar = cards13.charAt((int)randomNumber);
				cards+=randomchar;
			}
			else{
				cards+=cards2.charAt(i);
			}
		}
		changes+=1;
	}

//calculateScore method

	public void calculateScore(){
		score = 0;
		int countpairs = 0;
		for(int i = 0; i < cards.length(); i++){
			for(int j = i+1; j < cards.length(); j++){
				if(cards.charAt(i)==cards.charAt(j)){
					countpairs++;
				}
			}
		}
		score+=countpairs;
		history+=cards+"\t"+score+"\t"+changes+"\n";
	}

//displayData method

	public String displayData(){
		System.out.println("[Cards] [Score] [Changes]");
		return history;
	}
}