package com.example.AccountService.service;

import java.util.List;

import com.example.AccountService.model.Accounts;

public interface AccountsService {

	public List<Accounts> findAll();
	public List<Accounts>getByAccountno(int accountno);
	public Accounts createBankDetails(Accounts account);
	public String deleteBankDetails(int accountno);
	//public Accounts createAccount(Customer customer)
	//public Accounts createMasterAccount(Customer customer)
}
