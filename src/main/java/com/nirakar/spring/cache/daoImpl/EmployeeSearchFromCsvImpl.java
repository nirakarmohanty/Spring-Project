package com.nirakar.spring.cache.daoImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.nirakar.spring.cache.dao.EmployeeSearchFromCSV;
import com.nirakar.spring.cache.data.Employee;

/** This class implements {@link EmployeeSearchFromCSV} interface to implement Employee search 
 * by reading csv file through File Reader Operation. This layer can be marked as Service layer.
 * @author NIRAKAR
 *
 */ 
@Component("csvEmployeeSearch")
public class EmployeeSearchFromCsvImpl implements EmployeeSearchFromCSV {
	List<Employee> listEmployee = new ArrayList<Employee>();

	@PostConstruct
	public void init() {
		
		run();
	}

	public List<Employee> employeeListFromCSVfile() {

		return listEmployee;
	}

	private void run() {
		System.out.println("Run method started");
		String csvFile = "D:/Java_Study/Spring-Project/src/main/resources/employee.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				Employee employee = new Employee();
				// use comma as separator
				String[] employeearray = line.split(cvsSplitBy);
				employee.setId(Integer.parseInt(employeearray[0]));
				employee.setFirstName(employeearray[1]);
				employee.setLastName(employeearray[2]);
				employee.setCompanyName(employeearray[3]);
				employee.setTechnology(employeearray[4]);
				employee.setNoOfExp(Integer.parseInt(employeearray[5]));
				// System.out.println("Country [code= " + country[4] +
				// " , name=" + country[5] + "]");
				listEmployee.add(employee);
				//System.out.println(employee);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println(listEmployee.size());
	}

	public boolean updateEployeeList(Employee obj) {
		// TODO Auto-generated method stub
		return false;
	}

}
