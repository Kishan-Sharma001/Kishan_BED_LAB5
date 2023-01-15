package com.ems.Employee.Management.System;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ems.Employee.Management.System.service.EmpServiceImp;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@Slf4j
public class EmployeeManagementSystemApplication implements CommandLineRunner {
	  private static final Logger log = LoggerFactory.getLogger(EmployeeManagementSystemApplication.class);
	
	@Autowired
	EmpServiceImp service;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(service.getAllEmployee());
		log.info("data ->{}" ,service.getAllEmployee());
	}

}
