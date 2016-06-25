package com.nirakar.spring.cache.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nirakar.spring.cache.dao.EmployeeDAO;
import com.nirakar.spring.cache.dao.EmployeeSearchFromCSV;
import com.nirakar.spring.cache.data.Employee;


@Component ("employeeDao")
@Service
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	EmployeeSearchFromCSV csvEmployeeSearch;
	
	//@Cacheable(value="employeeResultsByIds",key="#id" )
	@Cacheable("employeeResultsByIds")
	public Employee getEmployeeById(int id) {
		System.out.println("getEmployeeById ----- > executed");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		//System.out.println(listEmployee.get(id));
		return listEmployee.get(id);
	}

	public Employee getEmployeeByFirstName(String fname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByLastName(String lname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByCompanyName(String cname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByTechnology(String tname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmployeeByExperience(int exp) {
		// TODO Auto-generated method stub
		return null;
	}

}
