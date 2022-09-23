package com.example.CustomerService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.CustomerService.model.Customers;
import com.example.CustomerService.repo.CustomersRepository;

public class CustomersServiceImpl implements CustomersService{
	@Autowired 
	CustomersRepository<Customers> repo;
	@Override
	public List<Customers> getByAccountno(int cust_no) {
		// TODO Auto-generated method stub
		return repo.getByAccountno(cust_no);
	}

}
