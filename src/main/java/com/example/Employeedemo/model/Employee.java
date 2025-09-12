package com.example.Employeedemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_table")
public class Employee 
{	
	@Id
	@Column(name = "emp_id")
	private int id;
	@Column(name = "emp_name",nullable = false,length = 50)
	private String name;
	@Column(name = "emp_role",nullable = false)
	private String role;
	@Column(name = "emp_mail",nullable = false,unique = true)
	private String email;
	@Column(name = "emp_pass",nullable = false,length = 15)
	private String password;
	@Column(name = "emp_contact",nullable = false,unique = true,length = 20)
	private String contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	

}
