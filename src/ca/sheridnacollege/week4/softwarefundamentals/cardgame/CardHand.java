/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridnacollege.week4.softwarefundamentals.cardgame;

/**
 * a class that models the Card Hand.
 * A Card hand has an array of cards. 
 * How can you change the size of the hand? how big is it right now?
 * @suthor dancye, 2019.
 */

public class CardHand {

        private int handSize = 52;
	public Card[] cards = new Card[handSize];

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Suit s: Suit.values())
                {
                    for(Value v: Value.values())
                    {
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method

}