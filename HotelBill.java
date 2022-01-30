package com.avensys.javaarrays;

public class HotelBill {

	String itemName;
	int price, quan, subtotal,grandTotal;
	HotelBill(String itemName, int price, int quan, int subtotal)
	{
		this.itemName = itemName;
		this.price = price;
		this.quan = quan;
		this.subtotal = subtotal;
	}
	public String toString() {
		return(itemName+"     "+price+"       "+quan+"        "+subtotal);
	}
}
