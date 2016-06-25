/**
 * 
 */
package com.nirakar.spring.cache.data;

/**
 * @author NIRAKAR
 * 
 */
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private String companyName;
	private String technology;
	private int noOfExp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public int getNoOfExp() {
		return noOfExp;
	}

	public void setNoOfExp(int noOfExp) {
		this.noOfExp = noOfExp;
	}

	@Override
	public String toString() {

		return "Employee [ "+"id: " + id + " | " + "First Name: " + firstName + " | "
				+ "Last Name: " + lastName + " | " + "Company Name: "
				+ companyName + " | " + "Technology: " + technology + " | "
				+ "Experince: " + noOfExp + "]";

	}

}
