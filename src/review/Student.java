package review;

public class Student extends Person{
	private String studentId;
	
	public Student(String name, String email, String studentId) {
		super(name, email);
		this.studentId = studentId;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.printf(String.format(" StudentID: %s", studentId));
	}
	
}
