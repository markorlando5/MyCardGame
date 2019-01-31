package ca.sheridnacollege.week4.softwarefundamentals.cardgame;

public class Card {

        private final Suit suit;
        private final Value value;
	
	

	public Value getValue() {
		return this.value;
	}

	

	public Suit getSuit() {
		return this.suit;
	}

	
	

	public Card(Suit givenSuit, Value givenValue) {
		suit = givenSuit;
                value = givenValue;
	}

	
	

}