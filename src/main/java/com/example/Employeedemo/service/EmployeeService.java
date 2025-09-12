package com.example.Employeedemo.service;

import com.example.Employeedemo.model.Employee;

public interface EmployeeService 
{
	public String EmployeeRegistration(Employee employee);
	public Employee checkEmployeeLogin(String email , String password);
	public String updateEmployee(Employee employee);

}
