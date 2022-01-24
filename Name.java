package com.avensys;


import java.util.Scanner;
import java.lang.String;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String nameStr = sc.nextLine();
		System.out.println("Enter the font size");
		int n = sc.nextInt();
		nameStr = nameStr.toUpperCase();

		for (int k = 0; k <= nameStr.length() - 1; k++) {
			char ch = nameStr.charAt(k);
			if (ch == 'A') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row == n / 2 || col == 1 && row >= n / 2 || col == n && row >= n / 2 || col == n / 2 && row == 1 || row + col == (n / 2) + 1 || col - row == n / 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'B') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row == 1 && col < (3 * n) / 4 || col == 1 || row == n / 2 && col != n || row == n && col != n || col == (3 * n) / 4 && row <= n / 2 && row != 1 || col == n && row > n / 2 && row != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'C') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if ((row > 1 && row < n && col == 1) || (row == 1 && col != 1) || (row == n && col != 1)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'D') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
//			  if (col==1 || row==1 && col!=1 && col!=n|| row==n && col!=1)
						if (col == 1 || row == 1 && col <= (3 * n) / 4 || row == n && col <= (3 * n) / 4 || col == n && row != 1 && row != n) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'E') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row == 1 || row == n || col == 1 || row == n / 2 && col <= n - 2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'F') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1 || col==1|| row==n/2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'G') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if(row==1 && col!=1|| row==n || col==1 || col==n && row>n/2 || row==n/2 && col>=n/2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'H') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 || col==n || row==n/2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'I') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1 || row==n || col==n/2) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'J') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1  || col==n/2 || row==n && col<=n/2 && col!=1) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'K') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if(col==1 || row==col && row>n/2 || row+col==n && row<n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'L') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 ||row==n){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'M') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 || col==n || row==col && col<=n/2 || row+col==n+1 && col>n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'N') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 || col==n || row==col ){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'O') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if(row==1 && col!=1 || row==1 && col!=n ||row==n && col!=1 || col==1 && row!=1 || col==n && row!=n){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'P') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 || row==1 && col!=n || row==n/2 && col!=n || col==n && row<n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'Q') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1 && col<=(3*n)/4 && col<=(3*n)/4 ||
								col==1 && row<=(3*n)/4 || col==(3*n)/4){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}  else if (ch == 'R') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 || row==1 && col!=n || row==n/2 ||col==n && row<=5 || row==n/2 && col!=n || row-col==(n/2)-3 && row>n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'S') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1 && col!=n || row==1 && col!=1 || row==n || col==1 && row<=n/2 ||row==n/2 && col!=n|| col==n && row>=n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'T') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1  || col==n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'U') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if(col==1 && row!=n || col==n && row!=n || row==n && col!=1 && col!=n){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'V') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if(col==1 && row<=n/2 || col==n && row<=n/2 || row-col==(n/2)-1 || row+col==n+5){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'W') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (col==1 || col==n || row==col && col>n/2 || row+col==n+1 && col<n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'X') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==col || row+col==n+1){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'Y') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if(row+col==n+1 || row==col && col<=n/2){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			} else if (ch == 'Z') {
				for (int row = 1; row <= n; row++) {
					for (int col = 1; col <= n; col++) {
						if (row==1 || row==n || row+col==n+1){
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}
			else {
					//donothing
				}
				System.out.println();
			}
		}
	}



