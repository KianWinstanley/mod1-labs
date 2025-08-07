package lab05;

import java.util.HashMap;

public class Zoo {
	
	HashMap<String, Integer> animalMap;
	String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
	String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	
	public Zoo() {
		animalMap = new HashMap<String, Integer>();
		addAnimals(originalAnimals);
		addAnimals(newAnimals);
		displayAnimalData();
	}
	
	public void addAnimals(String[] animals) {
		for (String animal : animals) {
			if (animalMap.containsKey(animal)) {
				int count = animalMap.get(animal);
				animalMap.put(animal, count + 1);
			}
			else {
				animalMap.put(animal, 1);
			}
		}
	}
	
	public void displayAnimalData() {
		for (String animal : animalMap.keySet()) {
			System.out.println(animal + "\t" + animalMap.get(animal));
		}

	}
}
