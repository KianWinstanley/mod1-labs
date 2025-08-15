package lab15;

import java.io.*;

public class MyRunnable implements Runnable{
	private String fileName;
	private String message;
	
	public MyRunnable(String fileName, String message) {
		this.fileName = fileName;
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println("Thread running: " + Thread.currentThread().getName());
		writeMessage(message);
	}
	
	private synchronized void writeMessage(String message) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
			writer.write(message);
			writer.newLine();
		}
		catch (IOException e) {
			e.getMessage();
		}
	}
}
