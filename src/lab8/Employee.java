package lab8;

public class Employee {
	private int id;
	protected static int idCount;
	private String jobTitle;
	private String name;
	
	public Employee(String name, String jobTitle) {
		setId(++Employee.idCount * 10);
		setName(name);
		setJobTitle(jobTitle);
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getInfo() {
		String info = "\n**** ****\n";
		info += "Name: " + getName() + "\n";
		info += "Job Title: " + getJobTitle() + "\n";
		info += "Employee ID: " + getId() + "\n";
		return info;
	}
	
}
