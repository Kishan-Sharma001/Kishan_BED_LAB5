package com.ems.Employee.Management.System.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.Employee.Management.System.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{

	

}
