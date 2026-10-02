package linkedhashset;

public class Student {
	private int rollNo;
	private String name;
	private char grade;
	
	Student(int rollNo,String name,char grade){
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	public int getRollNo() {
		return rollNo;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student student = (Student) obj;
		return rollNo == student.rollNo;
	}
	@Override
	public String toString() {
		return rollNo+" "+name+" "+grade; 
	}
	@Override
	public int hashCode() {
		return Integer.hashCode(rollNo);
	}
}
