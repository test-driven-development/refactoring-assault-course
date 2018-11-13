package com.wil.pannell.codesmells.dataclasses;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerSummaryViewTests {

	@Test
	public void customerSummaryIncludesFullNameWithTitleAndCityPostCodeAndCountry() throws Exception {
		Customer customer = new Customer();
		customer.setFirstName("Jason");
		customer.setLastName("Gorman");
		customer.setTitle("Mr");
		Address address = new Address();
		address.setCity("London");
		address.setPostcode("SW23 9YY");
		address.setCountry("United Kingdom");
		customer.setAddress(address);
		CustomerSummaryView order = new CustomerSummaryView(customer);
		assertEquals("Mr Jason Gorman, London, SW23 9YY, United Kingdom", order.getCustomerSummary());
	}
}
