package com.example.CustomerService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.CustomerService.model.Customers;

public interface CustomersRepository<CustomerService> extends JpaRepository<Customers,Integer>{
	@Query("select n from Customers n where n.cust_no=?1")
	public List<Customers>getByAccountno(int cust_no);
}
