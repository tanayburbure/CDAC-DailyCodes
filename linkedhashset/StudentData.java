package linkedhashset;

import java.util.*;

public class StudentData {
	
	LinkedHashSet<Student> students;
	
	StudentData(LinkedHashSet<Student> students){
		this.students = students;
	}
	
	
	public void addStudent(Student std) {
		students.add(std);
	}
	
	public void removeStudent(int rollNo) {
		Student rmStudent = null;
		
		for(Student std : students) {
			if(std.getRollNo() == rollNo) {
				rmStudent = std ;
				break;
			}
		}
		if(rmStudent != null) {
			students.remove(rmStudent);
			System.out.println("Student removed....");
		}else {
			System.out.println("Student not found...!");
		}

	}
	
	public void display() {
		for(Student std: students) {
			System.out.println(std);
		}
	}
}
