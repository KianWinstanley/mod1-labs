package lab4;

public class Program {

	public static void main(String[] args) {
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		
		System.out.println("the sum is " + findSum(numbers));
		System.out.println("the average is " + findAverage(numbers));
		System.out.println("the minimum is " + findMinimum(numbers));
		System.out.println("the maximum is " + findMaximum(numbers));
		System.out.println("the index of zero is " + findZero(numbers));
	}
	
	private static int findSum(int[] numbers) {
		int total = 0;
		
		for (int number : numbers) {
			total += number;
		}
		
		return total;
	}
	
	private static double findAverage(int[] numbers) {
		int average = 0;
		
		for (int number : numbers) {
			average += number;
		}
		
		average /= numbers.length;
		return average;
	}
	
	private static int findMinimum(int[] numbers) {
		int minimum = 0;
		
		for (int number : numbers) {
			if (number < minimum) {
				minimum = number;
			}
		}
		
		return minimum;
	}
	
	private static int findMaximum(int[] numbers) {
		int maximum = 0;
		
		for (int number : numbers) {
			if (number > maximum) {
				maximum = number;
			}
		}
		
		return maximum;
	}
	
	private static int findZero(int[] numbers) {
		int zeroIndex = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 0) {
				zeroIndex = i;
			}
		}
		
		return zeroIndex;
	}
}
