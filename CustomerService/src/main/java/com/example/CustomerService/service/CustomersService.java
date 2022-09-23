package com.example.CustomerService.service;

import java.util.List;

import com.example.CustomerService.model.Customers;



public interface CustomersService {
	public List<Customers>getByAccountno(int accountno);
}
