package edu.bu.met.cs665.delivery;

import java.util.ArrayList;

/**
 * Name: Karen Sommer Date: 10/01/2021 Course: CS-665 Assignment 2 Description:
 * Shop class is the concrete class from the DeliveryRequest interface.
 * Implements the Subject interface
 */

public class Shop implements DeliveryRequest {

	private String name;
	private String food;
	private String latestDeliveryUpdate;

	private ArrayList<SuscriberDriver> DriverList = new ArrayList<SuscriberDriver>();

	/*
	 * Constructor
	 */
	public Shop(String name, String food) {
		this.name = name;
		this.food = food;
		this.setLatestDeliveryUpdate("Food ready for pickup");
	}

	/*
	 * getter of name attribute
	 */
	public String getName() {
		return this.name;
	}

	/*
	 * setter of name attribute
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * getter of name Driver list
	 */
	public ArrayList<SuscriberDriver> getDriverList() {
		return DriverList;
	}

	/*
	 * setter of name Driver list
	 */
	public void setDriverList(ArrayList<SuscriberDriver> driverList) {
		DriverList = driverList;
	}

	/*
	 * getter of food attribute
	 */
	public String getFood() {
		return this.food;
	}

	/*
	 * setter of food attribute
	 */
	public void setFood(String food) {
		this.food = food;
	}

	/*
	 * setter of LatestDeliveryUpdate attribute
	 */
	public void setLatestDeliveryUpdate(String latestDeliveryUpdate) {
		this.latestDeliveryUpdate = latestDeliveryUpdate;
		this.notifySuscribers();
	}

	/*
	 * setter of LatestDeliveryUpdate attribute
	 */
	public String getLatestDeliveryUpdate() {
		return this.latestDeliveryUpdate;
	}

	/*
	 * Add suscriber driver to the Arraylist of subscribers
	 */
	public void register(SuscriberDriver sd) {
		DriverList.add(sd);
	}

	/*
	 * Remove suscriber driver to the Arraylist of subscribers
	 */
	public void remove(SuscriberDriver sd) {
		DriverList.remove(sd);
	}

	/*
	 * Call the update() on each subscriber when the data changes
	 */
	public void notifySuscribers() {
		for (SuscriberDriver sd : DriverList) {
			sd.updateDriver(this.latestDeliveryUpdate);
		}
	}

}
