package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.bu.met.cs665.emailGeneration.*;

/**
 * Name: Karen Sommer Date: 10/13/2021 Course: CS-665 Assignment 3 Description:
 * Unit tests for the program
 */

public class TestEmail {

	public TestEmail() {
	}

	@Test
	public void testNewCustomer() {

		EmailCenter newCustomer = new NewEmailCenter();
		assertEquals("Template for New customers!", newCustomer.sendEmail("new").emailTo());

	}

	@Test
	public void testFrequentCustomer() {
		EmailCenter frequentCustomer = new FrequentEmailCenter();
		// age one year after is one
		assertEquals("Template for Frequent Customers!", frequentCustomer.sendEmail("frequent").emailTo());
	}

	@Test
	public void testBusinessCustomer() {

		EmailCenter businessCustomer = new BusinessEmailCenter();
		businessCustomer.sendEmail("business");
		assertEquals("business", businessCustomer.toString("business"));

	}

}
