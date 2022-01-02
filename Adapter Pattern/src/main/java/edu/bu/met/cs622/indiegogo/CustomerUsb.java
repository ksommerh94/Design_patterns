package edu.bu.met.cs622.indiegogo;

/**
 * Name: Karen Sommer Date: 10/23/2021 Course: CS-665 Assignment 4 You task is
 * to implement a software system that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 * Class: This is the class that implements the methods of CustomerDataOverUsb
 */
public class CustomerUsb implements CustomerDataOverUsb {

	public int id;

	@Override
	public String printUsbCustomer(Customer c) {
		return("USB connection with customer id =>" + c.getId());

	}

	@Override
	public String getCustomerWithUSBConnect(Customer c) {
		return("USB! customer's name is:" + c.getName() + " with id: " + c.getId());

	}

}