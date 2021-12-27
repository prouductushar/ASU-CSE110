//***********************************************************
// Name: Tushar Tyagi
// Title: Assignment 8
// Description: 2D Arrays and File I/O
// Date: 12/02/21
//**********************************************************

//Part 1

/*

a) Rect x y width height Rect x y width height

b) 0 0 10 20 100 5 125 2 20 7 10 0

c) 0 0 1 0 2 0 1 0 0 5 1 2 5 2 2 0 7 1 0 0

d) Rect x y width height
   Rect x . y . width . height .

e) in.useDelimiter("[^0.0-9.0]+");

*/

//Part 2


//Importing essential features required

import java.util.Arrays;
import java.lang.*;
import java.util.Random;


//Dungeon

public class Dungeon{
	private Monster[][] monsters;
	public int gridWidth;
	public int gridHeight;

//Constructor

	public Dungeon(int width, int height){
		gridWidth = width;
		gridHeight = height;
		monsters = new Monster[height][width];
		for(int i = 0; i < monsters.length; i++){
			for(int j = 0; j < monsters[i].length; j++){
				monsters[i][j]= new Monster();
			}
		}
	}

//updateMonster

	public void updateMonster(int x, int y, Monster m){
		if(y < monsters.length && x < monsters[y].length){
			Monster mTry = new Monster();
			if(monsters[y][x].equals(mTry)){
				monsters[y][x] = m;
			}
		}
	}

//shift

	public void shift(char command){
		switch(command){
			case 'w':
				Monster[] shiftUp;
				shiftUp = monsters[0];
				for(int i = 0; i < monsters.length-1; i++){
					monsters[i] = monsters[i+1];
				}
				monsters[monsters.length-1]=shiftUp;
				break;
			case 'a':
				Monster shiftLeft;
				for(int i = 0; i < monsters.length; i++){
					shiftLeft = monsters[i][0];
					for(int j = 0; j < monsters[i].length-1; j++){
						monsters[i][j] = monsters[i][j+1];
					}
					monsters[i][monsters.length-1]=shiftLeft;
				}
				break;
			case 's':
				Monster[] shiftDown;
				shiftDown = monsters[monsters.length-1];
				for(int i = monsters.length-1; i > 0; i--){
					monsters[i] = monsters[i-1];
				}
				monsters[0]=shiftDown;
				break;
			case 'd':
				Monster shiftRight;
				for(int i = 0; i < monsters.length; i++){
					shiftRight = monsters[i][monsters.length-1];
					for(int j = monsters.length-2; j > -1; j--){
						monsters[i][j+1] = monsters[i][j];
					}
					monsters[i][0]=shiftRight;
				}
				break;
			default:
				System.out.println("Error! Invalid input.");
				break;
		}
	}

//shuffle

	public void shuffle(){
		for(int i = 0; i < monsters.length; i++){
			for(int j = 0; j < monsters[i].length; j++){
				swap(i,j,(int)(Math.random()*monsters.length),(int)(Math.random()*monsters[i].length));
			}
		}
	}

//swap

	private void swap(int x1, int y1, int x2, int y2){
		Monster temp;
		temp = monsters[x1][y1];
		monsters[x1][y1] = monsters[x2][y2];
		monsters[x2][y2] = temp;
	}

//printInfo

	public String printInfo(){
		String Info = "\n";
		for(int i = 0; i < monsters.length; i++){
			for(int j = 0; j < monsters[i].length; j++){
				Info+="	"+monsters[i][j].getInfo();
			}
			Info+="\n";
		}
		return Info;
	}

}