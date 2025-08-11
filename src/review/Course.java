package review;

import java.util.HashMap;

public class Course {
	private String courseName;
	private HashMap<Student, Integer> grades = new HashMap<>();
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(Student s, int grade) {
		if (grade > 100 || grade < 0) {
			System.out.println("Invalid grade");
			return;
		}
		
		if (grades.containsKey(s)) {
			System.out.println("Cannot enrol a student twice");
			return;
		}
		
		grades.put(s, grade);
	}
	
	public void removeStudent(Student s) {
		if (!grades.containsKey(s)) {
			System.out.println("Cannot find student");
			return;
		}
		
		grades.remove(s);
	}
	
	public String getCourseName() {
		return this.courseName;
	}
	
	public void printStudentList() {
		for (Student s : grades.keySet()) {
			s.getDetails();
			System.out.printf(String.format(" Grade: %d \n", grades.get(s)));
		}
	}
}
