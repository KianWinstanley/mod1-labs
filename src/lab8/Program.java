package lab8;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Car> cars = new ArrayList<>();
		
		Car car1 = new Car("Ford", 0);
		Car car2 = new Car("Jaguar", 0);
		
		RacingCar rCar1 = new RacingCar("Ferrari", 0, "Steve", 5);
		RacingCar rCar2 = new RacingCar("Lambo", 0, "John", 10);
		
		cars.add(car1);
		cars.add(car2);
		cars.add(rCar1);
		cars.add(rCar2);
		
		processCars(cars);
		
		Manager manager1 = new Manager("Steve", "Manager");
		Employee emp1 = new Employee("John", "Employee");
		Employee emp2 = new Employee("Megan", "Employee");
		Employee emp3 = new Employee("Bob", "Employee");
		
		manager1.addEmployee(emp1);
		manager1.addEmployee(emp2);
		manager1.addEmployee(emp3);
		
		SkilledWorker sWorker = new SkilledWorker("Duncan", "Skilled Worker");
		sWorker.addSkill("Communication");
		sWorker.addSkill("Leadership");
		sWorker.addSkill("Programming");
		manager1.addEmployee(sWorker);
		
		SkilledWorker sWorker2 = new SkilledWorker("Kian", "Skilled Worker");
		sWorker2.addSkill("Team building");
		sWorker2.addSkill("Public speaking");
		manager1.addEmployee(sWorker2);
		
		System.out.println(manager1.getInfo());
	}
	
	public static void processCars(ArrayList<Car> cars) {
		for (Car car : cars) {
			car.getToSixty();
			if (car instanceof RacingCar) {
				((RacingCar) car).accelerate();
			}
			car.accelerate(2);
			
			System.out.printf("Model: " + car.getModel() + "\t Speed: " + car.getSpeed());
			if (car instanceof RacingCar) {
				System.out.printf("\t Driver: " + ((RacingCar) car).getDriver());
			}
			
			System.out.printf("\n");
		}
	}

}
