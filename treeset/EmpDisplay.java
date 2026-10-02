package treeset;
import java.util.*;

public class EmpDisplay {
	public static void main(String[] args) {
		TreeSet<Employee> emps = new TreeSet<>();
		EmployeeDetails e1 = new EmployeeDetails(emps);
		
		
		e1.addEmployee(new Employee(101, "Rahul", 50000, "IT"));
		e1.addEmployee(new Employee(102, "Naresh", 60000, "IT"));
		e1.addEmployee(new Employee(103, "Shailesh", 70000, "IT"));
		e1.addEmployee(new Employee(104, "Ashish", 58000, "IT"));
		
		System.out.println("The employees sorted by names :");
		e1.displayEmployee();
		
		System.out.println("Searching for Naresh : ");
		Employee se = e1.searchEmployee("Naresh");
		if(se != null) {
			System.out.println(se);
		}else {
			System.out.println("Employee not found..");
		}
		
		System.out.println("Removing hemant  ");
		e1.removeEmployee("hemant");
		
		System.out.println("After removing..");
		e1.displayEmployee();
		
	}
}
