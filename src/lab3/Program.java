package lab3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println(getInt("please input a number: "));
		System.out.println(getString("please input a string: "));
	}
	
	public static int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextInt();
	}
	
	public static String getString(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		return s.nextLine();
	}
}
