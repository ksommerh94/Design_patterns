package edu.bu.met.cs622.indiegogo;

/**
 * Name: Karen Sommer Date: 10/23/2021 Course: CS-665 Assignment 4 You task is
 * to implement a software system that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 * Class: This is the Adapter interface, It follows the signature that we are
 * used to using: getCustomerWithUSBConnect() and printUsbCustomer(), but maps
 * it to the adaptee and handles it
 */

public class UsbToHttpsAdapter implements CustomerDataOverUsb {

	private CustomerDataOverHttps chttps;
	// private CigaretteLighterCharger carCigaretteLighter;

	public UsbToHttpsAdapter(CustomerDataOverHttps chttps) {
		this.chttps = chttps;
	}

	// This is where the magic happens. We are re-wiring the
	// getCustomerWithUSBConnect() to invoke the
	// chargeViaCartLighter() in the adaptee.
	@Override
	public String getCustomerWithUSBConnect(Customer c) {
		return chttps.getCustomerWithHTTPSConnect(c);
	}

	@Override
	public String printUsbCustomer(Customer c) {
		return chttps.printHttpsCustomer(c);

	}

}
