package com.example.AccountService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AccountService.model.Accounts;
import com.example.AccountService.repo.AccountsRepository;
@Service
public class AccountsServiceImpl implements AccountsService{
	@Autowired 
	AccountsRepository<Accounts> repo;
	@Override
	public List<Accounts> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public Accounts createBankDetails(Accounts account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}

	@Override
	public String deleteBankDetails(int accountno) {
		// TODO Auto-generated method stub
		repo.deleteById(accountno);
		return "Bank Details Deleted";
	}


	@Override
	public List<Accounts> getByAccountno(int accountno) {
		// TODO Auto-generated method stub
		return repo.getByAccountno(accountno);
	}
	
	
	

	
}
