//---------------------------------------------------------
//Name: Tushar Tyagi
//Title Assignment5.Java & Quiz.Java
//Description: This is my Fivth Assignment for CSE110!
//Time Spent: 2 Hours
//Date: 10/11/2021
//---------------------------------------------------------

/*Part 1

a) This program i.e. Assignment5.Java works to setup the
   questions to a quiz, then the 4 choices/options for it,
   then a correct answer, then the feature to display it,
   and finally, the option to shuffle options as well. All
   of these options have been enabled by the use of an
   external file named Quiz.Java from where methods have
   been imported.

   Keyword: quiz
   Tasks:

   - A: Test the quiz i.e. asks an external user the stored
   question and takes in an answer, then checks whether it
   is correct or not.
   - B: Here is where we assign a question to the quiz.
   - C: Here is where we assign 4 choices to a question for
   the quiz.
   - S: This option shuffles the order of options to a given
   question and assigns the new correct answer as well.
   - ?: Re-prints the Menu
   - Q: Quits the Menu and ends the loop

b) The quiz is the object reference, and Quiz is the object.

c) quiz.displayQuiz() at Line 25
   quiz.isCorrect() at Line 28
   quiz.setQuestion() at Line 35
   quiz.set4Choices() at Line 47
   quiz.setCorrectAnswer() at Line 50
   quiz.shuffle() at Line 54

d) The nextLine() is required because we need to read the
   entire line of response to capture the entire
   option/question that is given by the user. next() however,
   can only read an input until the next space.

e) Re-prints the entire Menu for the user to look at and
respond to, again.

*/

//Importing random

import java.util.Random;

public class Quiz{

//Initializing private variables

	private String question;
	private String choiceA;
	private String choiceB;
	private String choiceC;
	private String choiceD;
	private char answer;

//Constructor method

	public Quiz(String Question, String ChoiceA, String ChoiceB, String ChoiceC, String ChoiceD, char Answer){
		question=Question;
		choiceA=ChoiceA;
		choiceB=ChoiceB;
		choiceC=ChoiceC;
		choiceD=ChoiceD;
		answer=Answer;
	}

//setQuestion method

	public void setQuestion (String q) {
		question=q;
	}

//set4Choices method

	public void set4Choices(String c1,String c2,String c3,String c4){
		choiceA=c1;
		choiceB=c2;
		choiceC=c3;
		choiceD=c4;
	}

//getChoice method

	private String getChoice(char choice){
		String chosen="";
		if(choice=='A'){
			chosen=choiceA;
		}
		else if(choice=='B'){
			chosen=choiceB;
		}
		else if(choice=='C'){
			chosen=choiceC;
		}
		else if(choice=='D'){
			chosen=choiceD;
		}
		return chosen;
	}

//setCorrectAnswer method

public void setCorrectAnswer(char correctans){
			answer=correctans;
	}

//isCorrect method

	public boolean isCorrect(char input) {
			if(input==answer){
				return true;
			}
			else{
				return false;
			}
	}

//displayQuiz method

	public String displayQuiz(){
		return question+"\n"+choiceA+"\n"+choiceB+"\n"+choiceC+"\n"+choiceD;
	}

//shuffle method

	public void shuffle(){
		String choices = "ABCD";
		String correctanswer = getChoice(answer);
		String newChoices = "";
		String options = "0123";
		while(newChoices.length()!=4){
			int randomOption = (int)(Math.random()*options.length());
			newChoices+=choices.charAt(randomOption);
			if(randomOption==0){
				options=options.substring(1);
				choices=choices.substring(1);
			}
			if(randomOption==1){
				options=options.substring(0,1)+options.substring(2);
				choices=choices.substring(0,1)+choices.substring(2);
			}
			if(randomOption==2){
				options=options.substring(0,2)+options.substring(3);
				choices=choices.substring(0,2)+choices.substring(3);
			}
			if(randomOption==3){
				options=options.substring(0,3);
				choices=choices.substring(0,3);
			}
		}
		set4Choices(getChoice(newChoices.charAt(0)),getChoice(newChoices.charAt(1)),getChoice(newChoices.charAt(2)),getChoice(newChoices.charAt(3)));
		for(int i = 0; i!=4; i++){
			if(correctanswer.equals(getChoice(newChoices.charAt(i)))){
				answer=newChoices.charAt(i);
			}
		}
	}
}
