package com.nirakar.spring.cache.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nirakar.spring.cache.dao.EmployeeDAO;

public class ApplicationMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		//EmployeeSearchFromCsvImpl e1 = (EmployeeSearchFromCsvImpl)ctx.getBean("csvEmployeeSearch");
		//System.out.println(e1.employeeListFromCSVfile().size());
		EmployeeDAO employeeDAOImplObj=(EmployeeDAO)ctx.getBean("employeeDao");
		
		System.out.println(employeeDAOImplObj.getEmployeeById(2));		
		System.out.println(employeeDAOImplObj.getEmployeeById(2));		
		System.out.println(employeeDAOImplObj.getEmployeeById(3));		
		System.out.println(employeeDAOImplObj.getEmployeeById(2));
		
		System.out.println(employeeDAOImplObj.getEmployeeByFirstName("Nirakar"));		
		System.out.println(employeeDAOImplObj.getEmployeeByFirstName("Nirakar"));
		System.out.println(employeeDAOImplObj.getEmployeeByFirstName("Nirakar"));
		System.out.println(employeeDAOImplObj.getEmployeeByFirstName("Nirakar"));
		
		System.out.println(employeeDAOImplObj.getEmployeeByLastName("Mohanty"));
		System.out.println(employeeDAOImplObj.getEmployeeByLastName("Mohanty"));
		System.out.println(employeeDAOImplObj.getEmployeeByLastName("Mohanty"));
		System.out.println(employeeDAOImplObj.getEmployeeByLastName("Mohanty"));
		
		System.out.println(employeeDAOImplObj.getEmployeeByCompanyName("Tcs"));		
		System.out.println(employeeDAOImplObj.getEmployeeByCompanyName("Tcs"));	
		System.out.println(employeeDAOImplObj.getEmployeeByCompanyName("Tcs"));	
		System.out.println(employeeDAOImplObj.getEmployeeByCompanyName("Tcs"));	
		
		
		System.out.println(employeeDAOImplObj.getEmployeeByTechnology("SAP"));		
		System.out.println(employeeDAOImplObj.getEmployeeByTechnology("SAP"));
		System.out.println(employeeDAOImplObj.getEmployeeByTechnology("SAP"));
		System.out.println(employeeDAOImplObj.getEmployeeByTechnology("SAP"));
		
		System.out.println(employeeDAOImplObj.getEmployeeByExperience(12));
		System.out.println(employeeDAOImplObj.getEmployeeByExperience(12));
		System.out.println(employeeDAOImplObj.getEmployeeByExperience(12));
		System.out.println(employeeDAOImplObj.getEmployeeByExperience(12));
	}

}
