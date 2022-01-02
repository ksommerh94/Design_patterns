package edu.bu.met.cs665.emailGeneration;

/**
 * Name: Karen Sommer Date: 10/13/2021 Course: CS-665 Assignment 3 Description:
 * Create creator for new customers, extends from email center
 */

public class BusinessEmailCenter extends EmailCenter {
	@Override
	/**
	 * Factory method! implementation of method, creates the concrete customer
	 */
	Customer createEmail(String type) {
		System.out.print("creates email for business customer \n");

		if (type.equals("business")) {
			return new BusinessCustomer();
		} else
			return null;

	}

}