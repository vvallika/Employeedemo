package com.example.Employeedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employeedemo.model.Admin;
import com.example.Employeedemo.model.Employee;
import com.example.Employeedemo.repository.AdminRepository;
import com.example.Employeedemo.repository.EmployeeRepository;

@Service
public class AdminServiceImpl implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> viewAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Admin checkAdminLogin(String uname, String pwd) {
		// TODO Auto-generated method stub
		return adminRepository.checkAdminLogin(uname, pwd);
	}

	@Override
	public long employeecount() {
		return employeeRepository.count();
		
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted successfully" ;
	}
}
