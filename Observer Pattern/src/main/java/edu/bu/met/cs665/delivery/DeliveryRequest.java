package edu.bu.met.cs665.delivery;

/**
 * Name: Karen Sommer Date: 10/01/2021 Course: CS-665 Assignment 2 Description:
 * DeliveryRequest interface is the Observable or Subject in the observer
 * pattern
 */
public interface DeliveryRequest {

	public void register(SuscriberDriver d);

	public void remove(SuscriberDriver d);

	public void notifySuscribers();

}
