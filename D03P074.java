package com.learning.coreday3session1;
	import java.util.HashSet;
	import java.util.*;

	class Product2 {
	    private String productId;
	    private String productName;

	    public Product2(String productId, String productName) {
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
	        Product2 product = (Product2) obj;
	        return productId.equals(product.productId);
	    }
	}

	public class D03P074 {
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

	       
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the product ID to remove:");
	        String removeProductId = sc.next();

	       
	        boolean removed = false;
	        for (Product product : products) {
	            if (product.getProductId().equals(removeProductId)) {
	                products.remove(product);
	                removed = true;
	                break;
	            }
	        }
	        if (removed) {
	            System.out.println("Product with ID " + removeProductId + " removed successfully.");
	            System.out.println("Updated Product List:");
	            for (Product product : products) {
	                System.out.println(product);
	            }
	        } else {
	            System.out.println("Product with ID " + removeProductId + " not found.");
	        }

	        sc.close();
	    }
	}


