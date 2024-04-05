package com.learning.coreday1session2;


	import java.util.ArrayList;
	import java.util.List;

	public class CombinationFinder {
	    public static List<String> findCombinations(String array, int k) {
	        List<String> result = new ArrayList<>();
	        generateCombinations(array.toCharArray(), 0, new StringBuilder(), k, result);
	        return result;
	    }

	    private static void generateCombinations(char[] array, int index, StringBuilder current, int k, List<String> result) {
	        if (current.length() == k) {
	            result.add(current.toString());
	            return;
	        }
	        for (int i = index; i < array.length; i++) {
	            current.append(array[i]);
	            generateCombinations(array, i + 1, current, k, result);
	            current.deleteCharAt(current.length() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        String inputArray = "123";
	        int k = 2;
	        List<String> output = findCombinations(inputArray, k);
	        for (String combination : output) {
	            System.out.print(combination + ",");
	        }
	    }
}
