package com.example.Employeedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employeedemo.model.Employee;
import com.example.Employeedemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{	
	@Autowired
	public EmployeeRepository employeeRepository;

	@Override
	public String EmployeeRegistration(Employee employee)
	{
		employeeRepository.save(employee);
		return "Employee registered succesfully";
	}

	@Override
	public Employee checkEmployeeLogin(String email, String password) {
		// TODO Auto-generated method stub
		return employeeRepository.checkEmployeeLogin(email, password);
	}

	@Override
	public String updateEmployee(Employee employee) {
	Employee e = 	employeeRepository.findById(employee.getId()).get();
	e.setName(employee.getName());
	e.setRole(employee.getRole());
	e.setPassword(employee.getPassword());
	e.setContact(employee.getContact());
	employeeRepository.save(e);
	return "employee updates successfully !!";
	}

}
 