package lab12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class Program {

	public static void main(String[] args) throws IOException {
		String[] courses = readCSV("course.txt");
		String[] trainers = readCSV("trainer.txt");
		
		File file = new File("trainersAndCourses.txt");
		BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
		out.write(String.join(",", courses));
		out.newLine();
		out.write(String.join(",", trainers));
		out.newLine();
		
		out.close();
		
		System.out.println("Data written");
		
		Gson gson = new Gson();
		
		String fileName = "C:\\labs\\mod1-labs\\src\\customers.json";
		
		String content = new String(Files.readAllBytes(Paths.get(fileName)));
		
		Customer[] customers = gson.fromJson(content, Customer[].class);
		
		System.out.println(customers[0].CustomerID);
		
		int[] nos = {1,3,5,7,9};
		String res = gson.toJson(nos);
		System.out.println(res);
		
		String[] names = {"Bob", "Fred", "Wilma"};
		res = gson.toJson(names);
		System.out.println(res);
		
		Student[] students = {
				new Student("Bob", 21),
				new Student("Fred", 32),
				new Student("Wilma", 26)
		};
		
		res = gson.toJson(students);
		System.out.println(res);
		
	}
	
	private static String[] readCSV(String inFile) throws IOException {
		File file = new File(inFile);
		BufferedReader br = new BufferedReader(new FileReader(inFile));
		
		String line = br.readLine();
		if (line != null) {
			return line.split(",");
		}
		
		return null;
	}
}
