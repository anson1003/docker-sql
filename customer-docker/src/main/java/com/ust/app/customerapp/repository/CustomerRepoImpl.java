package com.ust.app.customerapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ust.app.customerapp.model.Customer;


@Repository
public class CustomerRepoImpl implements CustomerRepo {

	List<Customer> customers=new ArrayList<>();
	@Override
	public Customer addCustomer(Customer customer) {
		customers.add(customer);
		return customer;
	}

	@Override
	public Customer getCustomer(int id) {
		
		for(Customer c:customers) {
			if(c.getId()==id) {
				return c;
			}
		}
		
		return null;
	}
	
	
	@Override
	public Customer getCustomerByName(String name) {
		for(Customer c:customers) {
			if(c.getCustomerName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		return null;
	}
	
	
	@Override
	public Customer updateCustomer(Customer customer) {
		
      int id=customer.getId();
      Customer customer1=getCustomer(id);
      
     customer1.setId(customer.getId());
     customer1.setCustomerName(customer.getCustomerName());
     customer1.setEmail(customer.getEmail());
     customer1.setDob(customer.getDob());
      customers.add(customer1);
      customers.remove(customer);
      return customer1;
	}

	@Override
	public void deleteCustomer(int id) {
		Customer c=getCustomer(id);
		customers.remove(c);
		
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}
	

}
