package com.nirakar.spring.cache.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nirakar.spring.cache.daoImpl.EmployeeDAOImpl;
import com.nirakar.spring.cache.daoImpl.EmployeeSearchFromCsvImpl;

public class ApplicationMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		EmployeeSearchFromCsvImpl e1 = (EmployeeSearchFromCsvImpl)ctx.getBean("csvEmployeeSearch");
		System.out.println(e1.employeeListFromCSVfile().size());
		EmployeeDAOImpl employeeDAOImplObj=(EmployeeDAOImpl)ctx.getBean("employeeDao");
		System.out.println(employeeDAOImplObj.getEmployeeById(3));
	}

}
