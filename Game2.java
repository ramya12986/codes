package com.avensys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class Game2 {
	static Scanner sc = new Scanner(System.in);
	
	static void onePlayer(char board[][])
	{
		String s1 = "user";
		String s2 = "CPU";
		 while(true)  //giving while loop to repeat the step to complete the position
         {
    	    System.out.println("Enter a position to place X btw 1-9");
    		int userPos = sc.nextInt();
    		while(ArrayGame.allUserPos.contains(userPos) || ArrayGame.allCpuPos.contains(userPos))
    		{
    			System.out.println("Position taken already. Please choose another Position");
    			userPos = sc.nextInt();
    		}
		 	Game2.insert(board, userPos, 'X'); 
		 	Game2.display(board);
		 	Game2.CheckWinner(s1, s2);
		 	//Ramdom no generate for cpu position
		 	 Random r = new Random();
	         int cpuPos = r.nextInt(9)+1;  //generate  1 2 3 4 5 6 7 8 9 and reffer to cpuPos
	         System.out.println("cpu position:" +cpuPos);
	         while(ArrayGame.allUserPos.contains(cpuPos) || ArrayGame.allCpuPos.contains(cpuPos))
        		{
        			System.out.println("Position taken already. Please choose another Position");
        			cpuPos = r.nextInt(9)+1;
        		}
	         Game2.insert(board, cpuPos, 'O');
			 Game2.display(board);
			 Game2.CheckWinner(s1, s2);
     }
     
	}
	
	static void twoPlayer(char board[][])
	{
		String s1="User1";
		String s2 ="User2";
		 while(true)  //giving while loop to repeat the step to complete the position
         {
    	    System.out.println("User 1 please Enter a position to place X btw 1-9");
    		int userPos = sc.nextInt();
    		while(ArrayGame.allUserPos.contains(userPos) || ArrayGame.allCpuPos.contains(userPos))
    		{
    			System.out.println("Position taken already. Please choose another Position");
    			userPos = sc.nextInt();
    		}
		 	Game2.insert(board, userPos, 'X'); 
		 	Game2.display(board);
		 	Game2.CheckWinner(s1, s2);
		 	 System.out.println("User 2 please Enter a position to place X btw 1-9");
	         int cpuPos = sc.nextInt(); //generate  1 2 3 4 5 6 7 8 9 and reffer to cpuPos
	         System.out.println("User 2 position:" +cpuPos);
	         while(ArrayGame.allUserPos.contains(cpuPos) || ArrayGame.allCpuPos.contains(cpuPos))
        		{
        			System.out.println("Position taken already. Please choose another Position");
        			cpuPos = sc.nextInt();
        		}
	         Game2.insert(board, cpuPos, 'O');
			 Game2.display(board);
			 Game2.CheckWinner(s1, s2);
     }
     
	}
	// method to display the board
	
	public static void display(char[][] board) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			 {
				System.out.print(board[i][j]);
			}
				System.out.println();
		}
	}
		//method to insert position in the board

	 	static void insert (char[][] board, int pos, char ch)
	 	{
	 		if(ch=='X')// To check the position already taken
	 		{
	 			ArrayGame.allUserPos.add(pos);
	 		}
	 		else
	 		{
	 			ArrayGame.allCpuPos.add(pos);
	 		}
	 	switch(pos)
	 		 	{
	 	case 1: board[0][0]= ch;
	 	       break;
	 	case 2: board[0][2]= ch;
 	       break;
	 	case 3: board[0][4]= ch;
 	       break;
	 	case 4: board[2][0]= ch;
 	       break;
	 	case 5: board[2][2]= ch;
 	       break;
	 	case 6: board[2][4]= ch;
 	       break;
	 	case 7: board[4][0]= ch;
 	       break;
	 	case 8: board[4][2]= ch;
 	       break;
	 	case 9: board[4][4]= ch;
 	       break;
 	    default: System.out.println("Invalid position");
 	      
	 	}
	 	}
	 	// method to check winner
	 	static void CheckWinner(String s1, String s2)
		{
			List topRow = Arrays.asList(1,2,3);
			List midRow = Arrays.asList(4,5,6);
			List botRow = Arrays.asList(7,8,9);
			List leftCol = Arrays.asList(1,4,7);
			List midCol = Arrays.asList(2,5,8);
			List rightCol = Arrays.asList(3,6,9);
			List diag1 = Arrays.asList(1,5,9);
			List diag2 = Arrays.asList(3,5,7);
			
			//declare arraylist to store the list of winning condition
			List<List> WinCon = new ArrayList<List>();
			WinCon.add(topRow);
			WinCon.add(midRow);
			WinCon.add(botRow);
			WinCon.add(leftCol);
			WinCon.add(midCol);
			WinCon.add(rightCol);
			WinCon.add(diag1);
			WinCon.add(diag2);
			
			for(List l : WinCon)
			{
				if(ArrayGame.allUserPos.containsAll(l))
				{
					System.out.println(s1+ "is the winner");
					System.exit(0);
				}
				else if(ArrayGame.allCpuPos.containsAll(l))
				{
					System.out.println(s2+ "is the winner");
					System.exit(0);
				}	
				else if(ArrayGame.allUserPos.size()+ArrayGame.allCpuPos.size()==9)
				{ 
					System.out.println("Its a draw");
					System.exit(0);
				}
			}

	}
		
		
	}



