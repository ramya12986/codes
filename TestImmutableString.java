package com.avensys.javastrings;

public class TestImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ramya";
		s.concat("Palaniappan"); //concat() method append the string at the end
        System.out.println(s); // will print Ramya because strings are immutable objects.
        s=s.concat("palaniappan");
        System.out.println(s);// here new object s refers to s.concat("palaniappan") so it ll print Ramyapalaniappan
	}

}
