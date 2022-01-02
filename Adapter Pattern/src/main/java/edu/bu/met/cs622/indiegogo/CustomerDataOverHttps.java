package edu.bu.met.cs622.indiegogo;

/**
 * Name: Karen Sommer Date: 10/23/2021 Course: CS-665 Assignment 4 You task is
 * to implement a software system that can allow the interface of the old system
 * to be used as the new interface and is able to convert these two interfaces.
 * Interface:This is the adaptee interface, the "new" way .
 */
public interface CustomerDataOverHttps {
	String printHttpsCustomer(Customer c);

	String getCustomerWithHTTPSConnect(Customer c);
}
