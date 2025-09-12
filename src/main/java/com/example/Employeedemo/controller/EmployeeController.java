package com.example.Employeedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Employeedemo.model.Employee;
import com.example.Employeedemo.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController
{
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("empreg")
	public ModelAndView empreg()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empreg");
		return mv;
	}
	
	@GetMapping("emplogin")
	public ModelAndView emplogin()
	{
		ModelAndView mv = new ModelAndView("emplogin");
		return mv;
	}
	
	@PostMapping("insertemployee")
	public ModelAndView insertemployee(HttpServletRequest request)
	{
		int id = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("ename");
		String role = request.getParameter("erole");
		String email = request.getParameter("eemail");
		String password = request.getParameter("epwd");
		String contact = request.getParameter("econtact");
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setRole(role);
		employee.setEmail(email);
		employee.setPassword(password);
		employee.setContact(contact);
		
	    String message =  employeeService.EmployeeRegistration(employee);
	     
		ModelAndView mv = new ModelAndView("regsuccess");
		mv.addObject("message",message);
		return mv;
		
	}
	
	@PostMapping("checkemployeelogin")
	public ModelAndView checkemployeelogin(HttpServletRequest request)
	{
		ModelAndView mv =  new ModelAndView();
		String username = request.getParameter("ename");
		String password = request.getParameter("epwd");
		Employee employee = employeeService.checkEmployeeLogin(username, password);
		if(employee != null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("employee",employee);
			mv.setViewName("emphome");	
		}
		else 
		{
			mv.setViewName("emplogin");
			mv.addObject("message", "Login Failed");
		}
		
		return mv;
	}
	
	@GetMapping("emphome")
	public ModelAndView emphome()
	{
		ModelAndView mv = new ModelAndView("emphome");
		return mv;
	}
	
	@GetMapping("empprofile")
	public ModelAndView empprofile()
	{
		ModelAndView mv = new ModelAndView("empprofile");
		return mv;
	}
	
	@GetMapping("updateprofile")
	public ModelAndView updateprofile()
	{
		ModelAndView mv = new ModelAndView("updateprofile");
		return mv;
	}
	
	@PostMapping("update")
	public ModelAndView update(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		int id = Integer.parseInt(request.getParameter("eid"));
		String name = request.getParameter("ename");
		String role = request.getParameter("erole");
		
		String password = request.getParameter("epwd");
		String contact = request.getParameter("econtact");
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setRole(role);
		employee.setPassword(password);
		employee.setContact(contact);
		 employeeService.updateEmployee(employee);
	     
		
		
		 mv.setViewName("emplogin");
		 return mv;
		
	}
}
