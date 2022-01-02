package edu.bu.met.cs665.emailGeneration;

/**
 * Name: Karen Sommer Date: 10/13/2021 Course: CS-665 Assignment 3 Description:
 * Email center is the Creator class with the factory method : createEmail
 */

public abstract class EmailCenter {
	abstract Customer createEmail(String type); // This is the factory method!

	public Customer sendEmail(String type) {
		Customer typeCustomer = createEmail(type);
		typeCustomer.emailTo();
		return typeCustomer;
	}

	public String toString(String type) {
		return type;
	}
}