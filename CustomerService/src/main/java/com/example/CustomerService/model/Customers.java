package com.example.CustomerService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	@Id
	int cust_no;
	@Column
	String firstname;
	@Column
	String middlename;
	@Column
	String lastname;
	@Column
	String cust_city;
	@Column
	int custcontactno;
	@Column
	String occupation;
	@Column
	String dob;
	public int getCust_no() {
		return cust_no;
	}
	public void setCust_no(int cust_no) {
		this.cust_no = cust_no;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCust_city() {
		return cust_city;
	}
	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}
	public int getCustcontactno() {
		return custcontactno;
	}
	public void setCustcontactno(int custcontactno) {
		this.custcontactno = custcontactno;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Customers(int cust_no, String firstname, String middlename, String lastname, String cust_city,
			int custcontactno, String occupation, String dob) {
		super();
		this.cust_no = cust_no;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.cust_city = cust_city;
		this.custcontactno = custcontactno;
		this.occupation = occupation;
		this.dob = dob;
	}
	
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}

}
