package com.example.CustomerService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.CustomerService.model.Customers;
import com.example.CustomerService.service.CustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	
	@Autowired
	CustomersService service;
	@GetMapping("/getByAccountno/{accountno}")
	public List<Customers>getByAccountsno(@PathVariable("cust_no") int accountno){
		return service.getByAccountno(accountno);
}
	
}
