/**
* Name: Karen Sommer
* Date: 10/01/2021
* Course: CS-665
* Assignment 2
* Description: main method to run examples
*/

package edu.bu.met.cs665;

// import org.apache.log4j.PropertyConfigurator;

import edu.bu.met.cs665.delivery.*;


public class Main {


	public static void main(String[] args) {

		// The shop announces that there is a new food for delivery
		Shop deliveryRequest = new Shop("Chipotle", "Chicken Bowl");

		// Create 5 Drivers instances that are going to receive the notification of the
		// food.
		for (int i = 1; i < 6; i++) {
			new Driver("Driver #" + i, deliveryRequest);
		}

		// Drivers know there is a new food pickup!
		deliveryRequest.setLatestDeliveryUpdate("Food ready!");

	}
}
