package com.nirakar.spring.cache.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nirakar.spring.cache.dao.EmployeeDAO;
import com.nirakar.spring.cache.dao.EmployeeSearchFromCSV;
import com.nirakar.spring.cache.data.Employee;


@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	EmployeeSearchFromCSV csvEmployeeSearch;

	public Employee getEmployeeById(int id) {
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
