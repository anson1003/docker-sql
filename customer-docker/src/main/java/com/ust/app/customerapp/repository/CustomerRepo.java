package com.ust.app.customerapp.repository;

import java.util.*;

import com.ust.app.customerapp.model.Customer;


public interface CustomerRepo {
	public Customer addCustomer(Customer customer);
	public Customer getCustomer(int id);
	public Customer updateCustomer(Customer customer);
	public void deleteCustomer(int id);
	public List<Customer> getAllCustomer();
	public Customer getCustomerByName(String name);


}
