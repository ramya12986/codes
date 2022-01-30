package com.avensys;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayGame {
	//declare 2 array list for user and cpu position
	static ArrayList allUserPos = new ArrayList();
	static ArrayList allCpuPos = new  ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char board[][]=  {
				           {' ','|',' ','|',' '},
						   {'-','+','-','+','-'},
						   {' ','|',' ','|',' '},
						   {'-','+','-','+','-'},
						   {' ','|',' ','|',' '}
	                      };
		            Game2.display(board);
		            System.out.println("Enter the no of players1!");
		            int pl = sc.nextInt();
		            if(pl==1)
		            {
		            	Game2.onePlayer(board);
		            }
		            else if(pl==2)
		            {
		            	Game2.twoPlayer(board);
		            }
		            else
		            {
		            	System.out.println("Invalid input");
		            }
		            
		           

}
}
