package com.learning.coewday2session1;


	import java.util.*;
	public class D02P055 {
		
		
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter the number of strings: ");
		        int n = sc.nextInt();
		        sc.nextLine(); 

		        
		        System.out.println("Enter the strings:");
		        String[] strings = new String[n];
		        for (int i = 0; i < n; i++) {
		            strings[i] = sc.next();
		        }

		       
		        boolean result = canFormCircle(strings);

		        
		        if (result) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }

		   
		    public static boolean canFormCircle(String[] strings) {
		        return canFormCircleHelper(strings, new HashSet<>(), strings[0], 1);
		    }

		   
		    private static boolean canFormCircleHelper(String[] strings, Set<Integer> visited, String currentString, int count) {
		        if (count == strings.length) {
		            return currentString.charAt(currentString.length() - 1) == strings[0].charAt(0);
		        }
		        for (int i = 1; i < strings.length; i++) {
		            if (!visited.contains(i) && currentString.charAt(currentString.length() - 1) == strings[i].charAt(0)) {
		                visited.add(i);
		                if (canFormCircleHelper(strings, visited, strings[i], count + 1)) {
		                    return true;
		                }
		                visited.remove(i);
		            }
		        }
		        return false;
		    }
		}


