package treeset;

import java.util.*;

public class EmployeeDetails {
	
	 TreeSet<Employee> emps ;
	
	 EmployeeDetails(TreeSet<Employee> emps){
		 this.emps = emps;
	 }
	
	 public void addEmployee(Employee emp) {
		 emps.add(emp);
	 }
	 
	 public Employee searchEmployee(String name) {
		 for(Employee emp : emps) {
			 if(emp.getName().equalsIgnoreCase(name)) {
			 return emp;
			 }
		 }
		 return null;
	 }
	 
	 public void removeEmployee(String name) {
		 Employee emp = searchEmployee(name);
		 if(emp != null) {
			 emps.remove(emp);
			 System.out.println("Employee removed successfully");
		 }else {
			 System.out.println("Employee not found...");
		 }
	 }
	 
	 public void displayEmployee() {
		 for(Employee emp : emps) {
			 System.out.println(emp);
		 }
	 }
	
	
	
}
