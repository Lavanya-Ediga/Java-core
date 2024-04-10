package com.learning.coreday3session2;
	import java.util.HashMap;

	public class D03P081 {

		    public static void main(String[] args) 
		    {
		        HashMap<String, String> phoneBook = new HashMap<>();
		        phoneBook.put("Ram", "9959654355");
		        phoneBook.put("Kumar", "937845978");
		        phoneBook.put("Henry", "7730951566");
		        phoneBook.put("Rohit", "8886574562");
		        phoneBook.put("Jessy", "7744289411");
		        System.out.println("Phone Book Details:");
		        for (String name : phoneBook.keySet()) {
		            String phoneNumber = phoneBook.get(name);
		            System.out.println(name + " " + phoneNumber);
		        }

		       
		    }
		


	}
	


