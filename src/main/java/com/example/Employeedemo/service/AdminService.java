package com.example.Employeedemo.service;

import java.util.List;

import com.example.Employeedemo.model.Admin;
import com.example.Employeedemo.model.Employee;

public interface AdminService 
{
	public List<Employee> viewAllEmployees();
	public Admin checkAdminLogin(String username , String password);
	public long employeecount();
	public String deleteEmployee(int id);
}
