package lab06;

import java.io.*;

public class Program {

	public static void main(String[] args) {
		Account account = new Account(1, 100.00, "Kian");
		
		account.withdraw(50.00);
		System.out.println(account.getDetails());
		
		try {
			account.withdraw(60.00);
			System.out.println(account.getDetails());
		}
		catch (IllegalArgumentException e) {
			System.out.println("Cannot withdraw more than you have");
		}
		finally {
			account.close();
		}
		
		try {
			log("test log message.");
			System.out.println("Message logged");
		}
		catch (IOException e) {
			System.out.println("Cannot complete " + e.getMessage());
		}
	}
	
	private static void log(String msg) throws IOException{
		File file = new File("log.txt");
		FileWriter fr = new FileWriter(file, true);
		BufferedWriter br = new BufferedWriter(fr);
		br.write(msg + "\r\n");
		br.close();
		fr.close();
	}

}
