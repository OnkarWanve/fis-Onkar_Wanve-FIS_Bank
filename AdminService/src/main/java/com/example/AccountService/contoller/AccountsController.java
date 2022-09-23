package com.example.AccountService.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AccountService.model.Accounts;
import com.example.AccountService.service.AccountsService;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

	@Autowired
	AccountsService service;
	
	@GetMapping("/all")
	public List<Accounts>findAll(){
		return service.findAll();
	}
	@GetMapping("/getByAccountno/{accountno}")
	public List<Accounts>getByAccountsno(@PathVariable("accountno") int accountno){
		return service.getByAccountno(accountno);
	}
	@PostMapping("/createBankDetails")
	public Accounts createBankDetails(@RequestBody Accounts accounts) {
		return service.createBankDetails(accounts);
	}
	
	@DeleteMapping("/delete/{accountno}")
	public String deleteBankDetails(@PathVariable("accountno") int accountno) {
		return service.deleteBankDetails(accountno);
		}
}
