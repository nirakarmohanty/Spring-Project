package com.nirakar.spring.cache.dao;

import com.nirakar.spring.cache.data.Employee;

/**
 * This interface exposes below methods to get the Employee Object 
 * @author NIRAKAR
 *
 */
public interface EmployeeDAO {
	public Employee getEmployeeById(int id);
	public Employee getEmployeeByFirstName(String fname);
	public Employee getEmployeeByLastName(String lname);
	public Employee getEmployeeByCompanyName(String cname);
	public Employee getEmployeeByTechnology(String tname);
	public Employee getEmployeeByExperience(int exp);

}
