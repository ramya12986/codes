package com.avensys.javaarrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MyHotel extends BasicHotel 

{
	ArrayList<HotelBill> array = new ArrayList <HotelBill>();
	String name,email,choice,itemName;
    int price, subtotal,  discount;
    float grandTotal;
	
	int ch,quan;
	
	char cho = 'Y';
    Scanner sc = new Scanner(System.in);
	
    
	@Override
	void dispMenu() {
		// TODO Auto-generated method stub

		System.out.println("*****************************************");
		System.out.println("                 Menu                  \n");
		System.out.println(" ****************************************");
		System.out.println("SlNo           ItemName           Price\n");
		System.out.println(" ****************************************");
		System.out.println(" ****************************************");
		System.out.println(" 1               Coffee                $5");
		System.out.println(" 2                Tea                  $4");
		System.out.println(" 3              Softdrink              $3");
		System.out.println(" 4              water                  $1");
		
	}
	
	@Override
	void getUserInput() {
		// TODO Auto-generated method stub
		while(cho=='Y')
		{
		         System.out.print("select the item of ur choice");
		         ch = sc.nextInt();
		         System.out.print("Enter the item quantity");
		         quan = sc.nextInt();
		         calculate();
		         
		         System.out.println("Do you want more? (Y/N)");  //
	             choice = sc.next();
	             choice = choice.toUpperCase();
	             cho = choice.charAt(0);
		}
		System.out.print("Input discount percent : ");
        discount = sc.nextInt();
        applyDiscount(discount);
	}
	

	void getUserDetails() {
		// TODO Auto-generated method stub
		           System.out.println("Enter the user name:");
		             name=sc.nextLine();
		           System.out.println("Enter the email");
		           email = sc.nextLine();
		
	}
	
	@Override
	void calculate() {
		// TODO Auto-generated method stub
		switch(ch)
		{
		case 1:
			itemName = "Coffee        ";
			price = 5;
			subtotal = quan*price;
			break;
		case 2:
			itemName = "Tea            ";
			price = 4;
			subtotal = quan*price;
			break;
		case 3:
			itemName = "SoftDrinks";
			price = 3;
			subtotal = quan*price;
			break;
		case 4:
			itemName = "Water";
			price = 1;
			subtotal = quan*price;
			break;
			default: System.out.println("Invalid input");
			
		}
		array.add(new HotelBill(itemName, price, quan, subtotal));
		grandTotal+=subtotal;
	
	}
	
	void applyDiscount(int discountPercent) {
		grandTotal = grandTotal - (grandTotal * discountPercent / 100);
	}
	
	@Override
	void print() {
		
//TODO Auto-generated method stub
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println("--------------------------------------------");
	System.out.println("                     Bill No:"+(new Random()).nextInt());
	System.out.println("                Customer Name:" +name);
	System.out.println("--------------------------------------------");
	System.out.println("ItemName       Price     Quantity   Subtotal");	
	System.out.println("----------------------------------------------");
	for(HotelBill b:array)
	{
		System.out.println(b.toString());
}
//	System.out.println(itemName+ "    "+price+"       "+quan+"         "+subtotal);
	System.out.println("--------------------------------------------");
	System.out.println("payable grandTotal is               "+grandTotal);
	System.out.println(grandTotal);	
	}
	
	}
	
	


