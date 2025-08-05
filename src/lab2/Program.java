package lab2;

public class Program {

	public static void main(String[] args) {
		String[] students = {"Steve", "John", "Mary", "James", "Denise"};
		int[] marks = {103, 96, 64, 59, 32};
		
		for (int i = 0; i < students.length; i++) {
			var mark = getGrade(marks[i]);
			System.out.println(students[i] + " got " + mark);
		}
	}
	
	private static String getGrade(int score) {
		if ((score > 100 || score < 1)) {
			return "ERROR: marks must be between 1..100";
		}
		else if (score > 70) {
			return "Distinction";
		}
		else if (score > 60) {
			return "Merit";
		}
		else if (score >= 50) {
			return "Pass";
		}
		else {
			return "Fail";
		}
	}
}


