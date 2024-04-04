package com.learning.coreday1session1;

	class Book {
	    private String book_title;
	    private double book_price;

	    public String getBook_title() {
	        return book_title;
	    }

	    public void setBook_title(String book_title) {
	        this.book_title = book_title;
	    }

	    public double getBook_price() {
	        return book_price;
	    }

	    public void setBook_price(double book_price) {
	        this.book_price = book_price;
	    }
	     
	    public void createBooks() {
	    System.out.println("create book");
	        
	    }

	    public void showBooks() {
	       System.out.println("show book");
	    }
	  } 
	      class Main {
	    public static void main(String[] args) {
	        Book book = new Book();
	        book.setBook_title("Java Programming");
	        book.setBook_price(350.00);
	     
	        System.out.println(" Book title: " + book.getBook_title() + " price " + book.getBook_price());
	   } 
	

}
