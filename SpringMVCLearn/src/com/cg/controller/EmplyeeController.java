package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.dao.EmployeeDao;
import com.cg.entity.Employee;

@Controller
public class EmplyeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView modelAndView(@ModelAttribute Employee register){
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("welcomeMsg","Welcome to SignUp");
		
		return modelAndView;
	}
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView insertData(@ModelAttribute Employee register)
	{
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(register);
		employeeDao.create(register);
		
		modelAndView.addObject("data", "successfully registered");
		
		return modelAndView;
	}
	
}

