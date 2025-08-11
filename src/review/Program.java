package review;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<>();
		Course course1 = new Course("Java");
		Course course2 = new Course("Python");
		
		courses.add(course1);
		courses.add(course2);
		
		Student student1 = new Student("Steve", "steve@hotmail.com", "1");
		Student student2 = new Student("John", "john@hotmail.com", "2");
		Student student3 = new Student("Debra", "debra@hotmail.com", "3");
		
		course1.addStudent(student1,  50);
		course1.addStudent(student3, 70);
		course2.addStudent(student3, 80);
		course2.addStudent(student2, 60);
		
		for (Course course : courses) {
			System.out.println(course.getCourseName() + ": ");
			course.printStudentList();
		}
		
		course1.addStudent(student1, 60);
		course2.addStudent(student1, 105);
		
		course1.removeStudent(student3);
		course1.printStudentList();
	}

}
