package blackjack;

public class Card {
	private String suit;//모양
	private String character;//기호
	public Card(String suit, String character) {
		super();
		this.suit = suit;
		this.character = character;
	}
	
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	@Override
	public String toString() {
		return "Card [모양=" + suit + ", 기호=" + character + "]";
	}
	
}