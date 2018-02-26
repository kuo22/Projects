package blackjack.players;

import blackjack.deck.cards.Card;
import blackjack.deck.cards.Rank;
import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Cards>();
    }

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int getPoints() {
        int points = 0;
        for (Card card : cards)
            points += card.getRank.getValue();
        return points;
    }

    public boolean bust() {
        return getPoints() > 21;
    }
}
