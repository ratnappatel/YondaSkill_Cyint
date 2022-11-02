package com.cyient.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyient.entity.Customer;
import com.cyient.repository.CustomerRepository;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repository;
	public Customer addCustomer(Customer c)
	{
		Customer c1=repository.save(c);
		return c1;
	}
}
