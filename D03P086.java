package com.learning.coreday3session2;


	import java.util.TreeMap;

	public class D03P086 {
	    public static void main(String[] args) {
	        TreeMap<Car1, Double> carMap = new TreeMap<>();
	        Car1 bugatti = new Car1("Bugatti", 80050.0);
	        Car1 swift = new Car1("Swift", 305000.0);
	        Car1 audi = new Car1("Audi", 600100.0);
	        Car1 benz = new Car1("Benz", 900000.0);

	        carMap.put(bugatti, bugatti.getPrice());
	        carMap.put(swift, swift.getPrice());
	        carMap.put(audi, audi.getPrice());
	        carMap.put(benz, benz.getPrice());

	        // Print the prices of the cars in reverse order
	        System.out.println("Car Prices in Reverse Order:");
	        for (Car1 car : carMap.descendingKeySet()) {
	            System.out.println(carMap.get(car));
	        }
	    }
	}

	class Car1 implements Comparable<Car1> {
	    private String name;
	    private double price; 
	    public Car1(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public int compareTo(Car1 other) {
	        return Double.compare(this.price, other.price);
	    }
	    @Override
	    public String toString() {
	        return name;
	    }
	}


	 

