package com.ems.Employee.Management.System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.Employee.Management.System.model.Employee;
import com.ems.Employee.Management.System.repo.EmployeeRepo;

@Service

public class EmpServiceImp  {

	@Autowired 
	EmployeeRepo repo;
	
	public   List<Employee> getAllEmployee() {
		return repo.findAll();
	}
	public void addemployee( Employee employee) {
		 repo.save(employee);
		// repo.flush();
	}

	public Optional<Employee> getEmployeeById( Integer id) {
		return repo.findById(id);
	}
	
	public void deleteEmployeeById( Integer id) {
	 repo.deleteById(id);
	}
	 
	
}

