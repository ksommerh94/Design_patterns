package edu.bu.met.cs665.emailGeneration;

/**
 * Name: Karen Sommer Date: 10/13/2021 Course: CS-665 Assignment 3 Description:
 * NewCustomer is the concrete product that implements the Customer interface
 */

public class NewCustomer implements Customer {
	@Override
	/**
	 * String with the email template information
	 */
	public String emailTo() {
		return ("Template for New customers!");
	}
}