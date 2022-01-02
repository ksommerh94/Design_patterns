package edu.bu.met.cs665.restaurant;

/**
 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project
 * Description: CurrentDeliveryInfo is the concrete Observere in the observer
 * pattern
 */
public class Driver implements SuscriberDriver {

	private String name;

	private Order orders;

	private String latestDeliveryUpdate;

	/*
	 * Constructor
	 */
	public Driver(String name, Order order) {
		this.name = name;
		this.orders = order;
		this.latestDeliveryUpdate = "";
		this.orders.register(this);
	}

	/*
	 * updateDriver: updates the latestDeliveryUpdate with the parameter sent
	 */
	public void updateDriver(String latestUpdate) {
		this.latestDeliveryUpdate = latestUpdate;

		System.out.println(this.getName() + ": " + getMyLatestUpdate());

	}

	/*
	 * Getter of name attribute
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * Getter of MyLatestUpdate attribute
	 */
	public String getMyLatestUpdate() {
		return this.latestDeliveryUpdate;
	}

}
