package com.learning.coewday2session1;


	import java.util.Scanner;
	public class D02P052 {
		

		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		       
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        
		        System.out.print("Enter the number of last 'n' vowels to count: ");
		        int n = sc.nextInt();

		   
		        int vowelCount = countLastNVowels(input, n);

		      
		        System.out.println("Count of last 'n' vowels: " + vowelCount);

		        if (vowelCount < 0) {
		            System.out.println("Mismatch in vowel count.");
		        }
		    }

		    // Function to count the last 'n' vowels in the string
		    public static int countLastNVowels(String str, int n) {
		        int count = 0;
		        int vowelCount = 0;
		        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
		            char ch = Character.toLowerCase(str.charAt(i));
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                vowelCount++;
		                count++;
		            }
		        }
		        if (count < n) {
		            return -1; // Indicates a mismatch in vowel count
		        }
		        return vowelCount;
		    }
		


	}


