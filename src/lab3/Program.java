package lab3;

import java.util.Scanner;

public class Program {
	static Utils utils = new Utils();
	
	public static void main(String[] args) {
		System.out.println(utils.getInt("please input a number: "));
		System.out.println(utils.getString("please input a string: "));
		
		theLunchQueue();
		
		var pounds = utils.getInt("How much do you weigh in pounds? ");
		convertInputToStonesPounds(pounds);
		
		var weightInKg = utils.getInt("How much do you weigh in kg? ");
		convertKgsToStonesPounds(weightInKg);
	}
	
	public static void theLunchQueue() {
		var mainCourse = utils.getString("What main dish would you like(Fish, Burgers or veg)? ");
		var roastPotatoesAmount = utils.getInt("How many roast potatoes would you like? ");
		var brusselSproutAmount = utils.getInt("How many brussel sprouts would you like? ");
		
		System.out.println("Hello, your lunch is " + mainCourse + " with " + roastPotatoesAmount + " roast potatoes and " + brusselSproutAmount + " brussel sprouts.");
	}
	
	public static void convertInputToStonesPounds(int pounds) {
		var stone = pounds / 14;
		var pound = pounds % 14;
		
		System.out.println("You weigh " + stone + " stone and " + pound + " pounds");
	}
	
	public static void convertKgsToStonesPounds(int kg) {
		var weightInPounds = kg * 2.20462;
		convertInputToStonesPounds((int)weightInPounds);
	}
}
