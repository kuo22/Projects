package blackjack.deck;

import blackjack.deck.cards.Card;
import blackjack.deck.cards.Rank;
import blackjack.deck.cards.Suit;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck() {
		addCards();
		shuffle();
	}
	
	public void addCards() {
		for (Rank rank : Rank.values())
			for (Suit suit : Suit.values()) {
				Card card = new Card(rank, suit);
				cards.add(card);
			}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public ArrayList<Card> getCards() {
		return cards;
	}
}
