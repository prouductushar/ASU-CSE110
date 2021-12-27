//Importing random

import java.util.Random;

public class CardList{

//Initializing private variables

	private char[] cards;
	private String history;

//Constructor method

	public CardList(int numberOfCard){
		cards = new char[numberOfCard];
		history = "";
		history+="[";
		String cardValues = "A234567890JQK";
		double randomNumber;
		for(int i = 0; i < numberOfCard; i++){
			randomNumber = Math.random()*(cardValues.length());
			cards[i] = cardValues.charAt((int)randomNumber);
			if(i == 0){
				history+=cards[i];
			}
			else{
				history+=", "+cards[i];
			}
		}
		history+="]\n";
	}

//flip method

	public void flip(){
		history+="[";
		char temp;
		for(int i = 0; i < (cards.length)/2; i++){
			temp = cards[i];
			cards[i] = cards[cards.length-1-i];
			cards[cards.length - 1-i] = temp;
		}
		for(int k = 0; k < cards.length; k++){
			if(k == 0){
				history+=cards[k];
			}
			else{
				history+=", "+cards[k];
			}
		}
		history+="]: Flip\n";
	}

//shift method

	public void shift(){
		history+="[";
		char temp = cards[0];
		for(int i = 0; i < cards.length; i++){
			if(i == cards.length-1){
				cards[i] = temp;
			}
			else{
				cards[i] = cards[i+1];
			}
		}
		for(int k = 0; k < cards.length; k++){
			if(k == 0){
				history+=cards[k];
			}
			else{
				history+=", "+cards[k];
			}
		}
		history+="]: Shift\n";
	}

//shuffle method

	public void shuffle(){
		history+="[";
		char[] card = new char[cards.length];
		for(int i = 0; i < cards.length; i++){
			card[i] = cards[i];
		}
		int[] pos = shuffleIndex();
		for(int j = 0; j < cards.length; j++){
			cards[j] = card[pos[j]];
		}
		for(int k = 0; k < cards.length; k++){
			if(k == 0){
				history+=cards[k];
			}
			else{
				history+=", "+cards[k];
			}
		}
		history+="]: Shuffle\n";
	}

//change method

	public void change(int num){
		history+="[";
		String values = "A234567890JQK";
		for(int i = 0; i < num; i++){
			double randomNumber = Math.random()*(values.length());
			cards[i] = values.charAt((int)randomNumber);
			values = values.substring(0,(int)randomNumber) + values.substring((int)randomNumber+1,values.length());
		}
		for(int k = 0; k < cards.length; k++){
			if(k == 0){
				history+=cards[k];
			}
			else{
				history+=", "+cards[k];
			}
		}
		history+="]: Change\n";
	}

//shuffleIndex method for shuffle

	private int[] shuffleIndex(){
		int[] positions = new int[cards.length];
		for(int i = 0; i < positions.length; i++){
			positions[i] = i;
		}
		boolean condition = false;
		double randomNum1;
		double randomNum2;
		int temp;
		int check;
		while(!condition){
			check = 0;
			randomNum1 = Math.random()*(positions.length);
			randomNum2 = Math.random()*(positions.length);
			temp = positions[(int)randomNum1];
			positions[(int)randomNum1] = positions[(int)randomNum2];
			positions[(int)randomNum2] = temp;
			for(int j = 0; j < positions.length; j++){
				if(j == positions[j]){
					check++;
				}
			}
			if(check == 0){
				condition = true;
			}
		}
		return positions;
	}

//getHistory method

	public String getHistory(){
		return history;
	}
}





