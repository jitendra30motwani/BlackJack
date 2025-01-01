/**
 * 
 */
package design.lld.BlackJack;

import java.util.List;

/**
 * @author 91978
 *
 *Design LLD BlackJack and Deck Of Cards
 *
 *Requirements
 *1) There should be deck of 52 cards
 *2) We can have multiple deck of cards that is called shoe
 *3) Card with face value and suit(2-10)
 *4) BlackJackCard consists of J/K/Q(10) & A(1/11) 
 *5) Player and Dealer as a base player of the game
 *6) The one who scores the 21 points first will be the winner
 *7) The one who has points more than 21 will be the loser
 *8) The player has two option two choose between stand and hit
 *9) Dealer has an option to hit until the points less than 17
 *10) Player will initially put a bet 
 *11) If at the beginning the player gets the BlackJack cards then he will get 3:2 amount of the bet else he gets amount equal to the bet if player wins
 *
 *References Taken - https://github.com/tssovi/grokking-the-object-oriented-design-interview/blob/master/object-oriented-design-case-studies/design-blackjack-and-a-deck-of-cards.md#system-requirements
 *https://leetcode.com/discuss/interview-question/object-oriented-design/159168/design-blackjack-game
 *
 */
public class BlackJackLldExample {

	/**
	 * 
	 */
	public BlackJackLldExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	

}


enum Suit{
	
	DIAMOND,HEART,SPADE,CLUB;
	
}

class Card{
	
	int faceValue;
	Suit suit;
	
	public int getFaceValue(){
		return faceValue;
	}
	
}

class BlackJackCard extends Card{
	
	int points;
	
	public int getTotalPoints() {
		return points;
	}
	
}


class Deck{
	List<BlackJackCard> blackJackCards;
	public List<BlackJackCard> getBlackJackCards(){
		return blackJackCards;
	}
}

class Shoe{
	int decks;
	
	public void addDeck() {
		
	}
	
	public void shuffle() {
		
	}
}

class Person{
	String name;
	String email;
	String password;
}

enum AccountStatus{
	ACTIVE,BLOCKED,CANCELLED;
}

class Hand{
	
	List<BlackJackCard> cards;
	
}

class BasePlayer extends Person{
	
	AccountStatus accountStatus;
	Hand hand;
	Move move;
}

class Player extends BasePlayer{
	
	int bet;
}

class Move{
	
	public void hit() {}
	public void stand() {}
	
}

class Dealer extends BasePlayer{
	Shoe shoe;
	int amount;
	
}

class Game{
	Player player;
	Dealer dealer;
	
	public void startGame() {}
}

class GameController{
	
	Game game;
	
}

