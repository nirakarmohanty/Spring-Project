package com.nirakar.spring.cache.dao;

import java.util.List;

import com.nirakar.spring.cache.data.Employee;

/** This is Service Layer implementation such as reading/writing/deleting operation
 * @author NIRAKAR
 *
 */
public interface EmployeeSearchFromCSV {
	
	public List<Employee> employeeListFromCSVfile();
	
	public boolean updateEployeeList(Employee obj);
}
