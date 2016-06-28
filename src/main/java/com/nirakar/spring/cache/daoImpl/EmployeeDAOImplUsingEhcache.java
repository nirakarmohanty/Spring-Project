package com.nirakar.spring.cache.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.nirakar.spring.cache.dao.EmployeeDAO;
import com.nirakar.spring.cache.dao.EmployeeSearchDAO;
import com.nirakar.spring.cache.data.Employee;


/**This is an implementation class of EHCAHCE as individual method level
 * In the PostConstruct method , it initialize the List object by invoking 
 * CSV File reading/updating. The same List Object are used in various methods
 * 
 * @author NIRAKAR
 *
 */
@Component ("employeeDao")
public class EmployeeDAOImplUsingEhcache implements EmployeeDAO {
	
	@Autowired
	EmployeeSearchDAO csvEmployeeSearch;
    //@Autowired
	List<Employee> listEmployee=new ArrayList<Employee>();

	@PostConstruct
	public void init(){
		System.out.println("******* init method got called*************"  );
		System.out.println("Value of listEmployee befor CSV file search : " + listEmployee);
		listEmployee =csvEmployeeSearch.getEmployeeList();
		System.out.println("Value of listEmployee after CSV file search : " + listEmployee.size());
	}
	//@Cacheable(value="employeeResultsByIds",key="#id" )
	
	/** (non-Javadoc)
	 * This method will return an Employee Object by looking up the Employee Id.
	 * If the Object present in Cache it will look up through that cache otherwise it
	 * will look up through List Of Employee Object
	 */
	@Cacheable("employeeResultsByIds")
	public Employee getEmployeeById(int id) {
		System.out.println("******Not retrieved from Cache*********");
		//List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
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
		//List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
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
		//List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
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
		//List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
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
		//List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
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
		//List<Employee> listEmployee =csvEmployeeSearch.employeeListFromCSVfile();
		for(Employee e:listEmployee){
			if(e.getNoOfExp()==exp){
				return e;
			}
		}
		return null;
	}

}
