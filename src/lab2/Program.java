package lab2;

public class Program {

	public static void main(String[] args) {
		int score = 73;
		
		if ((score > 100 || score < 1)) {
			throw new IllegalArgumentException("marks must be between 1..100");
		}
		else if (score > 70) {
			System.out.println("Distinction");
		}
		else if (score > 60) {
			System.out.println("Merit");
		}
		else if (score >= 50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}


