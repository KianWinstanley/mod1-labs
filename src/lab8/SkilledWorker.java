package lab8;

import java.util.ArrayList;

public class SkilledWorker extends Employee{
	private ArrayList<String> skills = new ArrayList<>();
	
	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
	}
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
	
	public ArrayList<String> getSkills() {
		return this.skills;
	}
	
	public String getInfo() {
		String info = super.getInfo();
		info += getSkills() + "\n";
		
		return info;
	}
}
