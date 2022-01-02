package edu.bu.met.cs622.indiegogo;

/**
 * Name: Karen Sommer Date: 10/23/2021 Course: CS-665 Assignment 4 You task is
 * to implement a software system that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 * Class: Customer class that need to access the Data and to print the Customer.
 */
public class Customer {
	public int id;
	public String name;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String accesData() {

		// The adaptee, the new version of access the data
		CustomerDataOverHttps cHttps = new CustomerHttps();
		// The adapter, the old way to access the data
		CustomerDataOverUsb adapter = new UsbToHttpsAdapter(cHttps);
		// Calling in the adapter the "old" method
		return adapter.getCustomerWithUSBConnect(this);

	}

	public String printCustomer() {

		// The adaptee, the new version to print the customer
		CustomerDataOverHttps cHttps = new CustomerHttps();
		// The adapter, the old way to print the customer
		CustomerDataOverUsb adapter = new UsbToHttpsAdapter(cHttps);
		// Calling in the adapter the "old" method
		return adapter.printUsbCustomer(this);

	}

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
