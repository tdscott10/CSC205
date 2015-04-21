package Project5;

//Program Name : BagTest
//Author : Aaron Stahley	
//Date Written: 3/1/2015
//Class : BagTest.java

public class BagTest {

	public static void main(String[] args) {

		 MyBag<String> bag = new MyBag<String>();
		 
		System.out.println("Is the bag Empty? " + bag.isEmpty()+ "\n");
		
		System.out.println("My bag includes..");
		
		// adding items to myBag 
		bag.add("Pens"); 
		bag.add("Pencils");
		bag.add("Hair brush");
		bag.add("Laptop");
		bag.add("Binder");
		
		// Prints out the items in my bag
		bag.printBag();
		
		// Gives an integer value of how many items are in my bag
		System.out.println("\nThere Are " + bag.size() + " Items are in my bag");
		
		// Checks to see if the bag is empty or not
		System.out.println("\nIs the bag Empty? " + bag.isEmpty()+ "\n");
		
		System.out.println("This is another way to print out my bag");
		
		// using the toString method to print out the items in the bag
		System.out.println(bag.toString());


				
	}

}

