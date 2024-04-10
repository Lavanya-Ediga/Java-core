package com.learning.coreday3session1;


	
	import java.util.ArrayList;
	import java.util.Scanner;

	public class D03P071 {
			
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		        
		        ArrayList<String> studentNames = new ArrayList<>();

		       
		        System.out.println("Enter student names separated by spaces:");
		        String input = sc.nextLine();
		        String[] names = input.split(" ");

		        
		        for (String name : names) {
		            studentNames.add(name);
		        }

		        System.out.println("Enter the name to search:");
		        String searchName = sc.nextLine();

		        
		        boolean found = studentNames.contains(searchName);

		       
		        if (found) {
		            System.out.println("Found");
		        } else {
		            System.out.println("Not Found");
		        }

		        sc.close();
		    }
		

	}



