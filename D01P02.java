package com.learning.coreday1session1;

	interface MedicineInfo {
	 void displayLabel();
	}

	
	class Tablet implements MedicineInfo {
	 @Override
	 public void displayLabel() {
	     System.out.println("Store Tablets in a cool dry place.");
	 }
	}

	
	class Syrup implements MedicineInfo {
	 @Override
	 public void displayLabel() {
	     System.out.println("Syrup is consumable only on prescription.");
	 }
	}

	
	class Ointment implements MedicineInfo {
	 @Override
	 public void displayLabel() {
	     System.out.println("Ointment is for external use only.");
	 }
	}

	
	public class D01P02 {
	 public static void main(String[] args) {
	     // Declare Medicine instances
	     MedicineInfo medicine1 = new Tablet();
	     MedicineInfo medicine2 = new Syrup();
	     MedicineInfo medicine3 = new Ointment();
	     
	     // Check the polymorphic behavior of displayLabel() method
	     medicine1.displayLabel();
	     medicine2.displayLabel();
	     medicine3.displayLabel();
	 }
	}

