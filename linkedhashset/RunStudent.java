package linkedhashset;

import java.util.LinkedHashSet;

public class RunStudent {

	public static void main(String[] args) {
		LinkedHashSet<Student> students = new LinkedHashSet<Student>();
		StudentData std = new StudentData(students);
		
		std.addStudent(new Student(101,"Funksuk vagdu",'D'));
		std.addStudent(new Student(103,"Ved Sharma",'B'));
		std.addStudent(new Student(102,"Sarthak joshi",'C'));
		std.addStudent(new Student(104,"hardy sandhu",'A'));
		
		System.out.println("All students with respect to insertion order : ");
		std.display();
		
		System.out.println("Removing the 103 roll no student : ");
		std.removeStudent(103);
		
		System.out.println("The list after removing student is : ");
		std.display();
	}

}
