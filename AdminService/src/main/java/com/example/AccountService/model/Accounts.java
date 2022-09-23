package com.example.AccountService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
public class Accounts {
	@Id
	int accountno;
	@Column
	String acc_status;
	@Column
	String acc_type;
	@Column
	int branch_id;
	@Column
	int cust_no;
	@Column
	int open_balance;
	
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getAcc_status() {
		return acc_status;
	}
	public void setAcc_status(String acc_status) {
		this.acc_status = acc_status;
	}
	public String getAcc_type() {
		return acc_type;
	}
	public void setAcc_type(String acc_type) {
		this.acc_type = acc_type;
	}
	public int getBranch_id() {
		return branch_id;
	}
	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}
	public int getCust_no() {
		return cust_no;
	}
	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}
	public int getApen_balance() {
		return open_balance;
	}
	public void setApen_balance(int apen_balance) {
		this.open_balance = apen_balance;
	}
	public Accounts(int accountno, String acc_status, String acc_type, int branch_id, int cust_no, int apen_balance) {
		super();
		this.accountno = accountno;
		this.acc_status = acc_status;
		this.acc_type = acc_type;
		this.branch_id = branch_id;
		this.cust_no = cust_no;
		this.open_balance = apen_balance;
	}
	public Accounts() {
		// TODO Auto-generated constructor stub
	}
}
