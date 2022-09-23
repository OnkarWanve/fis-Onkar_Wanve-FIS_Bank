package com.example.AccountService.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.AccountService.model.Accounts;

public interface AccountsRepository<AccountService> extends JpaRepository<Accounts,Integer> {

	@Query("select n from Accounts n where n.accountno=?1")
	public List<Accounts>getByAccountno(int accountno);
}
	