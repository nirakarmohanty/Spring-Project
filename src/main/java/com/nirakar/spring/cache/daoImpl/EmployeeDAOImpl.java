package com.nirakar.spring.cache.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.nirakar.spring.cache.dao.EmployeeDAO;
import com.nirakar.spring.cache.dao.EmployeeSearchFromCSV;
import com.nirakar.spring.cache.data.Employee;


/**This is a implementation class of EHCAHCE as individual method level
 * @author NIRAKAR
 *
 */
@Component ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	EmployeeSearchFromCSV csvEmployeeSearch;
	
	//@Cacheable(value="employeeResultsByIds",key="#id" )
	
	@Cacheable("employeeResultsByIds")
	public Employee getEmployeeById(int id) {
		System.out.println("******Cache Not executed*********");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		//System.out.println(listEmployee.get(id));
		for(Employee e:listEmployee){
			if(e.getId()==id){
				return e;
			}
		}
		return null;
		
		
	}
	@Cacheable("employeeResultsByFirstNames")
	public Employee getEmployeeByFirstName(String fname) {
		System.out.println("******Cache Not executed*********");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		for(Employee e:listEmployee){
			if(e.getFirstName().equalsIgnoreCase(fname)){
				return e;
			}
		}
		return null;
	}
	@Cacheable("employeeResultsByLastNames")
	public Employee getEmployeeByLastName(String lname) {
		System.out.println("******Cache Not executed*********");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		for(Employee e:listEmployee){
			if(e.getLastName().equalsIgnoreCase(lname)){
				return e;
			}
		}
		return null;
	}
	@Cacheable("employeeResultsByCompanyNames")
	public Employee getEmployeeByCompanyName(String cname) {
		System.out.println("******Cache Not executed*********");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		for(Employee e:listEmployee){
			if(e.getCompanyName().equalsIgnoreCase(cname)){
				return e;
			}
		}
		return null;
	}
	@Cacheable("employeeResultsByTechnologys")
	public Employee getEmployeeByTechnology(String tname) {
		System.out.println("******Cache Not executed*********");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		for(Employee e:listEmployee){
			if(e.getTechnology().equalsIgnoreCase(tname)){
				return e;
			}
		}
		return null;
	}
	@Cacheable("employeeResultsByExperiences")
	public Employee getEmployeeByExperience(int exp) {
		System.out.println("******Cache Not executed*********");
		List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		for(Employee e:listEmployee){
			if(e.getNoOfExp()==exp){
				return e;
			}
		}
		return null;
	}

}
