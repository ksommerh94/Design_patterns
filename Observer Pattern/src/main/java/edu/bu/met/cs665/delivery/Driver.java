package edu.bu.met.cs665.delivery;

/**
 * Name: Karen Sommer Date: 10/01/2021 Course: CS-665 Assignment 2 Description:
 * CurrentDeliveryInfo is the concrete Observere in the observer pattern
 */
public class Driver implements SuscriberDriver {

	private String name;

	private Shop shops;

	private String latestDeliveryUpdate;

	/*
	 * Constructor
	 */
	public Driver(String name, Shop shops) {
		this.name = name;
		this.shops = shops;
		this.latestDeliveryUpdate = "";
		this.shops.register(this);
	}

	/*
	 * updateDriver: updates the latestDeliveryUpdate with the parameter sent
	 */
	public void updateDriver(String latestUpdate) {
		this.latestDeliveryUpdate = latestUpdate;

		System.out.println("New delivery! ready for pick up" + this.getName() + ": " + getMyLatestUpdate());

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
