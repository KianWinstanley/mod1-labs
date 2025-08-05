package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class CardGame {
	
	public static void main(String[] args) {
		GetCards();
		
		int playerHandTotal = 0;
		int houseHandTotal = 0;
		
		System.out.println("The houses hand is: ");
		houseHandTotal = calculateHandTotal(houseHandQueue, houseHandTotal);
		System.out.println("The players hand is: ");
		playerHandTotal = calculateHandTotal(playerHandQueue, playerHandTotal);
		
		if (houseHandTotal > playerHandTotal) {
			System.out.println("The House has won with a total of " + houseHandTotal);
		}
		else if (houseHandTotal == 0 && playerHandTotal == 0) {
			System.out.println("Both have gone bust, nobody wins");
		}
		else {
			System.out.println("The Player has won with a total of " + playerHandTotal);
		}
	}
	
	public static void GetCards() {
		String[] cards = {"Ace Spades","2 Spades","3 Spades","4 Spades","5 Spades","6 Spades","7 Spades","8 Spades","9 Spades","10 Spades","Jack Spades","Queen Spades","King Spades","Ace Hearts","2 Hearts","3 Hearts","4 Hearts","5 Hearts","6 Hearts","7 Hearts","8 Hearts","9 Hearts","10 Hearts","Jack Hearts","Queen Hearts","King Hearts","Ace Clubs","2 Clubs","3 Clubs","4 Clubs","5 Clubs","6 Clubs","7 Clubs","8 Clubs","9 Clubs","10 Clubs","Jack Clubs","Queen Clubs","King Clubs","Ace Diamonds","2 Diamonds","3 Diamonds","4 Diamonds","5 Diamonds","6 Diamonds","7 Diamonds","8 Diamonds","9 Diamonds","10 Diamonds","Jack Diamonds","Queen Diamonds","King Diamonds"}; 
		
		shuffleArray(cards);
		
		Queue<String> playerHandQueue = new LinkedList<>();
		Queue<String> houseHandQueue = new LinkedList<>();
		
		calculateHand(cards, playerHandQueue);
		calculateHand(cards, houseHandQueue);
	}

	private static void calculateHand(String[] cards, Queue<String> handQueue) {
		int index = 0;
		for (int i = 0; i < 5; i++) {
			while (cards[index].equals("X")) {
				index = (int)(Math.random() * 52);
			}
			handQueue.offer(cards[index]);
			cards[index] = "X";
		}
	}

	private static int calculateHandTotal(Queue<String> handQueue, int handTotal) {
		int cardNumber;
		String answer = "Y";
		Scanner s = new Scanner(System.in);
		
		for (String card : handQueue) {
			try {
				if (card.substring(0,2).equals("10")) {
					cardNumber = 10;
					continue;
				}
				else {
					cardNumber = Integer.parseInt(card.substring(0,1));
					handTotal += cardNumber;
				}
			}
			catch (NumberFormatException nfe) {
				cardNumber = 10;	
				handTotal += cardNumber;
			}
				
			System.out.println("card: " + card + " value: " + cardNumber);
			
			if (handTotal > 21) {
				System.out.println("You have gone bust");
				handTotal = 0;
				break;
			}
			
			System.out.println("Would you like another card? (Y/N) ");
			answer = s.next();
			
			
			if (answer.toUpperCase().equals("Y")) {
				continue;
			}
			else {
				break;
			}
			
		}
		return handTotal;
	}
	
	public static void shuffleArray(String[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // random index from 0 to i


            // Swap array[i] with array[j]
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

