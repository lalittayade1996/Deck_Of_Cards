package com.bridglabz_cards;

import java.util.HashSet;
import java.util.Set;

public class DeckOfCards_Program {
	public static void main(String[] args) {
		String[][] cardCombo = new String[4][13];
		String[][] player = new String[4][9];
		Set<String> cards = new HashSet();
		int a = 0, b = 0, c = 0, d = 0, num = 1;

		String[] suits = { "Diamond", "Heart", "Spades", "Club" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardCombo[i][j] = suits[i] + rank[j];
			}
		}

		while (num <= 36) {
			int randomSuit = (int) Math.floor(Math.random() * 10) % 4;
			int randomRank = (int) Math.floor(Math.random() * 100) % 13;

			if (cards.add(cardCombo[randomSuit][randomRank])) {
				int option = num % 4;
				switch (option) {
				case 0:
					player[option][a++] = cardCombo[randomSuit][randomRank];
					break;
				case 1:
					player[option][b++] = cardCombo[randomSuit][randomRank];
					break;
				case 2:
					player[option][c++] = cardCombo[randomSuit][randomRank];
					break;
				case 3:
					player[option][d++] = cardCombo[randomSuit][randomRank];
					break;
				}
				num++;
			}
		}

		for (int i = 0; i < 4; i++) {
			System.out.print("Player " + (i + 1) + " : ");
			for (int j = 0; j < 9; j++) {
				System.out.print(player[i][j] + " ");
			}
			System.out.println();
		}
	}
}
