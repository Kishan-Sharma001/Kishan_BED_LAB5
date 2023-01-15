package com.ems.Employee.Management.System.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ems.Employee.Management.System.model.Employee;
import com.ems.Employee.Management.System.service.EmpServiceImp;



@Controller
@RequestMapping("/employee")
class HomeController {
	@Autowired
	EmpServiceImp service;

	@ResponseBody

	@GetMapping("/home")

	public ModelAndView homepage() {
		var mav = new ModelAndView();
		List<Employee> emp = service.getAllEmployee();
		mav.addObject("EmployeeList", emp);

		mav.setViewName("home");

		return mav;
	}

	@GetMapping("/register")

	public ModelAndView registerpage(Employee emp) {
		return new ModelAndView("register.html");
	}

	@GetMapping("/update/id")

	public ModelAndView updateEmployee(Integer id) {
		var mav = new ModelAndView();
		Optional<Employee> emp = service.getEmployeeById(id);
		mav.addObject("employee", emp);

		mav.setViewName("update");

		return mav;
	}

	@PostMapping("/saveEmployee")

	// public String addEmployee(@ModelAttribute Employee employee) {
	// service.addemployee(employee);
	// return "redirect:/home.html";
//	}
	public ModelAndView addEmployee(@ModelAttribute Employee emp) {

		var mav = new ModelAndView();
		service.addemployee(emp);

		mav.setViewName("redirect:/employee/home");
		return mav;

	}

	@GetMapping("/delete/id")

	public ModelAndView removeEmployee(Integer id) {

		var mav = new ModelAndView();
		service.deleteEmployeeById(id);

		mav.setViewName("redirect:/employee/home");

		return mav;
	}
}