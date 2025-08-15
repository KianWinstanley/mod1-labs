package lab15;

import java.io.FileWriter;
import java.io.IOException;

public class Program {
	private static String fileName = "shared_file.txt";
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable(fileName, "Thread 1 message"));
		Thread t2 = new Thread(new MyRunnable(fileName, "Thread 2 message"));
		Thread t3 = new Thread(new MyRunnable(fileName, "Thread 3 message"));
		
		t1.start();
		t2.start();
		t3.start();
		
		Thread t4 = new Thread( () -> {
			for (int i = 0; i < 16; i++) {
				try (FileWriter fw = new FileWriter(fileName, true)) {
					fw.write(Thread.currentThread().getName().charAt(i));
				}
				catch (IOException e) {
					e.getMessage();
				}
			}
		}, "Thread 4 message");
			
		Thread t5 = new Thread( () -> {
			for (int i = 0; i < 16; i++) {
				try (FileWriter fw = new FileWriter(fileName, true)) {
					fw.write(Thread.currentThread().getName().charAt(i));
				}
				catch (IOException e) {
					e.getMessage();
				}
			}
		}, "Thread 5 message");
		
		t4.start();
		t5.start();
		
		raceConditions(t4, t5);
	}

	private synchronized static void raceConditions(Thread t4, Thread t5) {
		try {
			t4.join();
			t5.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
