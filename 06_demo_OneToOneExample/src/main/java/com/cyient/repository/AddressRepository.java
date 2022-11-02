package com.cyient.repository;

import org.springframework.data.repository.CrudRepository;

import com.cyient.entity.Address;

public interface AddressRepository extends CrudRepository<Address,Integer> {

}
