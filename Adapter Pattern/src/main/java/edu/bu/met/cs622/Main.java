package edu.bu.met.cs622;

import edu.bu.met.cs622.indiegogo.*;

public class Main {

	/**
	 * A main method to run examples.
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {

		// Creation of customer and calling the methods
		Customer customer = new Customer(2, "Juliana");
		System.out.println(customer.accesData());
		System.out.println(customer.printCustomer());
		
		
		Customer customer2 = new Customer(32,"Sarah");
		System.out.println(customer2.accesData());
		System.out.println(customer2.printCustomer());

	}

}
