package com.luv2code.eccomerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.eccomerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Customer findByEmail(String theEmail);
}
