package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import edu.bu.met.cs622.Main;
import edu.bu.met.cs622.indiegogo.Customer;

// Write some Unit tests for your program like the following.

public class TestAccess {

	public TestAccess() {
	}

	@Test
	public void testAccessData() {
		Customer customer = new Customer(2, "Juliana");
		assertEquals("HTTPS connection with customer id =>2", customer.accesData());

	}

	@Test
	public void testPrintUser() {
		Customer customer = new Customer(2, "Juliana");
		assertEquals("HTTPS! customer's name is:Juliana with id: 2", customer.printCustomer());
	}

	@Test
	public void testGetName() {

		Customer customer = new Customer(3, "Karen");
		assertEquals("Karen", customer.getName());

	}

	@Test
	public void testGetId() {

		Customer customer = new Customer(3, "Karen");
		assertEquals(3, customer.getId());

	}

	@Test
	public void testPrintUser2() {

		Customer customer = new Customer(32, "Sarah");
		assertEquals("HTTPS! customer's name is:Sarah with id: 32", customer.printCustomer());

	}

	@Test
	public void testMain() {

		String[] args = { "one", "two", "three" };
		Main.main(args);
	}

}
