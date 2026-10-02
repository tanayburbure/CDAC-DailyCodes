package treeset;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private double salary;
	private String dept;
	
	public Employee(int id,String name,double salary,String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return id+" "+name+" "+salary+" "+dept;
	}

	@Override
	public int compareTo(Employee e) {
		return this.name.compareToIgnoreCase(e.name);
	}
	
}
