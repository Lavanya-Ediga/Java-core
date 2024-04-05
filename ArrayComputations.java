package com.learning.coreday1session2;


	import java.util.Arrays;

	public class ArrayComputations {
	    public static void main(String[] args) {
	        // Given array A
	        int[] A = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

	        int sum = 0;
	        for (int i = 0; i < 15; i++) {
	            sum += A[i];
	        }
	        A[15] = sum;

	        
	        double average = (double) sum / 15; // Only considering the first 15 elements
	        A[16] = (int) average;

	      
	        int min = Arrays.stream(A).min().getAsInt();
	        A[17] = min;

	        
	        System.out.println("Updated array:");
	        for (int i = 0; i < A.length; i++) {
	            System.out.print(A[i] + " ");
	        }
	    }
	}


