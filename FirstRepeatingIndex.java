package com.learning.coreday1session2;


	import java.util.*;

	public class FirstRepeatingIndex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Enter the size of the array: ");
	        int N = scanner.nextInt();

	        // Input the array elements
	        System.out.println("Enter the array elements:");
	        int[] arr = new int[N];
	        for (int i = 0; i < N; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Map to store elements and their indices
	        Map<Integer, Integer> map = new HashMap<>();

	        // Variable to store the index of the first repeating element
	        int firstRepeatingIndex = -1;

	        // Iterate through the array to find the first repeating element
	        for (int i = 0; i < N; i++) {
	            int current = arr[i];
	            // If the element is already present in the map, update the index
	            if (map.containsKey(current)) {
	                firstRepeatingIndex = map.get(current);
	                break;
	            }
	            // Otherwise, add the element and its index to the map
	            else {
	                map.put(current, i);
	            }
	        }

	        // Display the index of the first repeating element
	        System.out.println("Index of first repeating element: " + firstRepeatingIndex);
	    }
	}


