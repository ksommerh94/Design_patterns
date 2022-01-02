package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.bu.met.cs665.delivery.Driver;
import edu.bu.met.cs665.delivery.Shop;

// Write some Unit tests for your program like the following.

public class TestDelivery {

	public TestDelivery() {
	}

	@Test
	public void testUpdateObserver() {

		Shop deliveryRequest = new Shop("Chipotle", "Chicken Bowl");

		for (int i = 1; i < 6; i++) {
			new Driver("Driver #" + i, deliveryRequest);
		}

		assertEquals("Food ready for pickup", deliveryRequest.getLatestDeliveryUpdate());

	}

	@Test
	public void testFoodShop() {

		Shop deliveryRequest = new Shop("Chipotle", "Chicken Bowl");

		for (int i = 1; i < 6; i++) {
			new Driver("Driver #" + i, deliveryRequest);
		}
		assertEquals("Chicken Bowl", deliveryRequest.getFood());
	}

	@Test
	public void sizeDriverList() {

		Shop deliveryRequest = new Shop("Chipotle", "Chicken Bowl");

		for (int i = 1; i < 6; i++) {
			new Driver("Driver #" + i, deliveryRequest);
		}

		assertEquals(5, deliveryRequest.getDriverList().size());

	}

}
