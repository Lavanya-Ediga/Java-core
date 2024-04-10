package com.learning.coreday3session2;
	import java.util.TreeMap;

	public class D03P088 {
	    public static void main(String[] args) 
	    {
	    	
	        TreeMap<Car3, Double> carMap = new TreeMap<>();

	        Car3 bugatti = new Car3("Bugatti", 80050.0);
	        Car3 swift = new Car3("Swift", 305000.0);
	        Car3 audi = new Car3("Audi", 600100.0);
	        Car3 benz = new Car3("Benz", 900000.0);

	        carMap.put(bugatti, bugatti.getPrice());
	        carMap.put(swift, swift.getPrice());
	        carMap.put(audi, audi.getPrice());
	        carMap.put(benz, benz.getPrice());
	        System.out.println("TreeMap before removal:");
	        for (Car3 car : carMap.keySet()) {
	            System.out.println(car.getName() + " " + carMap.get(car));
	        }

	        Car3 greatestKey = carMap.lastKey();
	        carMap.remove(greatestKey);
	        System.out.println("\nKey-value mapping associated with the greatest key:");
	        System.out.println(greatestKey.getName() + " " + carMap.get(greatestKey));
	        System.out.println("\nTreeMap after removal:");
	        for (Car3 car : carMap.keySet()) {
	            System.out.println(car.getName() + " " + carMap.get(car));
	        }
	    }
	}

	class Car3 implements Comparable<Car3> {
	    private String name;
	    private double price;

	    public Car3(String name, double price) {
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
	    public int compareTo(Car3 other) {
	        return Double.compare(this.price, other.price);
	    }

	    @Override
	    public String toString() {
	        return name;
	    }

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        long temp;
	        temp = Double.doubleToLongBits(price);
	        result = prime * result + (int) (temp ^ (temp >>> 32));
	        result = prime * result + ((name == null) ? 0 : name.hashCode());
	        return result;
	    }
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Car3 other = (Car3) obj;
	        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
	            return false;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	    }

	}


