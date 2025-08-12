package lab9;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		Fish fish = new Fish("Goldfish");
		Duck duck = new Duck("Mallard");
		Penguin penguin = new Penguin("Emperor");
		Frog frog = new Frog("Green");
		Axolotl axolotl = new Axolotl("Pink");
		animals.add(fish);
		animals.add(duck);
		animals.add(penguin);
		animals.add(frog);
		animals.add(axolotl);
		
		for (Animal animal : animals) {
			System.out.println(animal.getName());
			if (animal instanceof Bird) {
				 ((Bird) animal).makeNest();
			}
			else if (animal instanceof Amphibian) {
				((Amphibian) animal).Speak();
			}
			
			if (animal instanceof Flyable) {
				((Flyable) animal).fly();
			}
			
			if (animal instanceof Swimmable) {
				((Swimmable) animal).swim();
			}
			
			if (animal instanceof Movable) {
				animal.move();
			}
		}
	}

}
