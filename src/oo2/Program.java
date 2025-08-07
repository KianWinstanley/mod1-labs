package oo2;

public class Program {

	public static void main(String[] args) {
		Game game = new Game();
		
		String name = "Kian";
		String surname = " Winstanley";

		System.out.println(name.toLowerCase().charAt(2));
		System.out.println(name.toUpperCase().charAt(2));
		
		for (char character : name.toCharArray()) {
			System.out.printf(character + "\t");
		}
		System.out.println();
		
		System.out.println("Does name start with K: " + name.startsWith("K"));
		System.out.println("Does name end with X: " + name.endsWith("X"));
		System.out.println("The index of i is: " + name.indexOf('i'));
		
		String fullName = name.concat(surname);
		System.out.println(fullName);
		
		StringBuilder sb = new StringBuilder("Bruce Springsteen ");
		sb.append("is the artist ever");
		System.out.println(sb.toString());
		
		sb.insert(25, "greatest ");
		System.out.println(sb.toString());
		
		sb.replace(34, 40, "rock singer");
		System.out.println(sb.toString());
	}
	

}
