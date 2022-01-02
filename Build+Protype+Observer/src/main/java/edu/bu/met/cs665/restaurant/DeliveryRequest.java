package edu.bu.met.cs665.restaurant;

/**
 * Name: Karen Sommer Date: 11/010/2021 Course: CS-665 Final project
 * Description: DeliveryRequest interface is the Observable or Subject in the
 * observer pattern
 */
public interface DeliveryRequest {

	public void register(SuscriberDriver d);

	public void remove(SuscriberDriver d);

	public void notifyDriver();

}
