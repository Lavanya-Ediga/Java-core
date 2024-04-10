package com.learning.coreday3session1;
	import java.util.HashSet;
	import java.util.*;

	class Product1 {
	    private String productId;
	    private String productName;

	    public Product1(String productId, String productName) {
	        this.productId = productId;
	        this.productName = productName;
	    }

	    public String getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    @Override
	    public String toString() {
	        return productId + " " + productName;
	    }

	    @Override
	    public int hashCode() {
	        return productId.hashCode();
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Product1 product = (Product1) obj;
	        return productId.equals(product.productId);
	    }
	}

	public class D03P073 {
	    public static void main(String[] args) {
	        HashSet<Product> products = new HashSet<>();
	        Product product1 = new Product("P001", "Maruti 800");
	        Product product2 = new Product("P002", "Maruti Zen");
	        Product product3 = new Product("P003", "Maruti Dezire");
	        Product product4 = new Product("P004", "Maruti Alto");

	        products.add(product1);
	        products.add(product2);
	        products.add(product3);
	        products.add(product4);
	      
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter the product ID to search:");
	        String searchProductId = sc.next();
	        boolean found = false;
	        for (Product product : products) {
	            if (product.getProductId().equals(searchProductId)) {
	                found = true;
	                System.out.println("Found: " + product);
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Product with ID " + searchProductId + " not found.");
	        }

	        sc.close();
	    }
	}


