package com.ust.app.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.app.customerapp.model.Customer;
import com.ust.app.customerapp.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.addCustomer(customer);
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return repo.getCustomer(id);
	}

	@Override
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		return repo.getCustomerByName(name);
	}
	
	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.updateCustomer(customer);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		repo.deleteCustomer(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.getAllCustomer();
	}
	
	

}
