package com.learning.coreday1session2;


	import java.util.Scanner;

	public class BingoChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter two numbers in the range from 1 to 40: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
            int[] array = {7, 25, 5, 19, 30};
	        boolean foundNum1 = false;
	        boolean foundNum2 = false;
	        for (int i = 0; i < array.length; i++) {
	            if (num1 == array[i]) {
	                foundNum1 = true;
	            }
	            if (num2 == array[i]) {
	                foundNum2 = true;
	            }
	        }

	      
	        if (foundNum1 && foundNum2) {
	            System.out.println("Its Bingo");
	        } else {
	            System.out.println("Not Found");
	        }
	    }

}
