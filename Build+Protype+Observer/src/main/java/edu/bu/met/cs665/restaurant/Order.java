package edu.bu.met.cs665.restaurant;

import java.util.ArrayList;

/**
 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project
 * Description: Order class is the concrete class from the DeliveryRequest
 * interface and has a reference to MealBuilder Implements the Subject interface
 */

public class Order implements DeliveryRequest {

	private MealBuilder food;
	private String latestDeliveryUpdate;

	private ArrayList<SuscriberDriver> DriverList = new ArrayList<SuscriberDriver>();

	/*
	 * Constructor
	 */
	public Order(MealBuilder food) {
		this.food = food;
		this.setLatestDeliveryUpdate("Food ready for pickup");
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
	public MealBuilder getFood() {
		return this.food;
	}

	/*
	 * setter of food attribute
	 */
	public void setFood(MealBuilder food) {
		this.food = food;
	}

	/*
	 * setter of LatestDeliveryUpdate attribute
	 */
	public void setLatestDeliveryUpdate(String latestDeliveryUpdate) {
		this.latestDeliveryUpdate = latestDeliveryUpdate;
		this.notifyDriver();
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
	public void notifyDriver() {
		for (SuscriberDriver sd : DriverList) {
			sd.updateDriver(this.latestDeliveryUpdate);
		}
	}

}
