package com.cyient.repository;

import org.springframework.data.repository.CrudRepository;

import com.cyient.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
