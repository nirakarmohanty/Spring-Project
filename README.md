# Spring-Project
=======================================
Following Implementation as part of this Project <br>
1. Ehcache Implementation - How to implement Ehcache using Spring and how to clear the Cache.Various aspects in cache. <br>
2. Annotation Implementation - Used various annotaion such as <i>@Cachable</i>,<i>@Component</i>,<i>@Repository</i> etc.<br>
3. Used Aspect oriented programming to implement Logger <br>

Some of below Annotation describes as below  

1. The @Component annotation marks a java class as a bean so the component-scanning mechanism of spring can pick it up and pull    it into the application context

 @Component("csvEmployeeSearch")
 public class EmployeeSearchFromCsvImpl implements EmployeeSearchFromCSV {

2. Although above use of @Component is good enough but you can use more suitable annotation that provides additional benefits     specifically for DAOs i.e. @Repository
 annotation. The @Repository annotation is a specialization of the @Component annotation with similar use and functionality.

 @Repository ("employeeDao")
 public class EmployeeDAOImpl implements EmployeeDAO {
