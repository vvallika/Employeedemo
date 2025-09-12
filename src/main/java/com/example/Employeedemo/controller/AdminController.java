package com.example.Employeedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Employeedemo.model.Admin;
import com.example.Employeedemo.model.Employee;
import com.example.Employeedemo.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;

@Controller

public class AdminController
{
	@Autowired
	AdminService adminService;
	
	@GetMapping("adminlogin")
	public ModelAndView adminlogin()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminlogin");
		return mv;
	}
	
	@PostMapping("checkadminlogin")
	public ModelAndView checkadminlogin(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		String uname = request.getParameter("auname");
		String pwd= request.getParameter("apwd");
		Admin admin =   adminService.checkAdminLogin(uname,pwd);
		
		if(admin != null)
		{
			mv.setViewName("adminhome");
			long count = adminService.employeecount();
			mv.addObject("count",count);
		}
		else 
		{
			mv.setViewName("adminloginfail");
			mv.addObject("message","Login Failed");
		}
		return mv;
	}
	
	@GetMapping("adminhome")
	public ModelAndView adminhome()
	{
			
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adminhome");
		return mv;
	}
	
	@GetMapping("viewallemployee")
	public ModelAndView viewallemployee()
	{
		
		List<Employee> employee = adminService.viewAllEmployees();
		ModelAndView mv = new ModelAndView("viewallemployee");
		mv.addObject("employeelist", employee);
		long count = adminService.employeecount();
		mv.addObject("count",count);
		return mv;
		
	}
	
	@GetMapping("deleteemployee")
	public ModelAndView deleteemployee()
	{
		
		
		ModelAndView mv = new ModelAndView("deleteemployee");
		List<Employee> employee = adminService.viewAllEmployees();
		mv.addObject("employeelist", employee);
		
		return mv;
		
	}
	@GetMapping("delete")
	public String delete(@RequestParam int id)
	{
		adminService.deleteEmployee(id);
		return "redirect:/deleteemployee";
	}
	
}
