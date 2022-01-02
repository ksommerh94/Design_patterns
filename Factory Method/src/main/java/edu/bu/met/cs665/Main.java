package edu.bu.met.cs665;

import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

import edu.bu.met.cs665.emailGeneration.*;

/**
 * Name: Karen Sommer Date: 10/13/2021 Course: CS-665 Assignment 3 Description:
 * Send customer specific emails to their customers. They would need to have an
 * application that generates emails from a base template for different types of
 * customers.
 */

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);
	EmailCenter newCustomer = new NewEmailCenter();
	EmailCenter vipCustomer = new VipEmailCenter();
	EmailCenter businessCustomer = new BusinessEmailCenter();
	EmailCenter returningCustomer = new ReturningEmailCenter();
	EmailCenter frequentCustomer = new FrequentEmailCenter();

	/**
	 * A main method to run examples.
	 *
	 * @param args not used
	 */
	public static void main(String[] args) {

		// This configuration is for setting up the log4j properties file.
		// It is better to set this using java program arguments.
		// PropertyConfigurator.configure("log4j.properties");

		// Let us create an object of the Main class

		Main franchise = new Main();
		franchise.newCustomer.sendEmail("new");
		franchise.vipCustomer.sendEmail("vip");
		franchise.businessCustomer.sendEmail("business");
		franchise.returningCustomer.sendEmail("returning");
		franchise.frequentCustomer.sendEmail("frequent");
		// franchise.vipCustomer.orderPizza("cheese");
		System.out.println();

		logger.trace(
				"This is a Trace Message for illustration purpose only! This is the highest level which prints all trace, debug, info, warn, error and fatal logs.");
		logger.debug(
				"This is a Debug Message for illustration purpose only! This log level prints debug, info, warn, error and fatal logs.");
		logger.info(
				"This is a Info Message for illustration purpose only! This log level prints info, warn, error and fatal logs.");
		logger.warn(
				"This is a Warn Message for illustration purpose only! This log level prints warn, error and fatal logs.");
		logger.error(
				"This is a Error Message for illustration purpose only! This log level prints error and fatal logs.");
		logger.fatal(
				"This is a Fatal Message for illustration purpose only! This log level is the loweest level, and prints only fatal logs.");

	}

}
