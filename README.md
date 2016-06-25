# Spring-Project

This project implements couple of Annotaion provided by Spring 

1. The @Component annotation marks a java class as a bean so the component-scanning mechanism of spring can pick it up and pull it into the application context

@Component("csvEmployeeSearch")
public class EmployeeSearchFromCsvImpl implements EmployeeSearchFromCSV {

2. Although above use of @Component is good enough but you can use more suitable annotation that provides additional benefits specifically for DAOs i.e. @Repository
 annotation. The @Repository annotation is a specialization of the @Component annotation with similar use and functionality.

@Repository ("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
