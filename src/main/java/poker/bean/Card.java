package poker.bean;

import poker.enums.FaceValueEnum;
import poker.enums.SuitEnum;

/**
 * Bean representation of a play card
 * 
 * @author Laurent Coiffard
 *
 */
public class Card {

	private SuitEnum suit;
	private FaceValueEnum value;

	public Card(SuitEnum suit, FaceValueEnum value) {
		this.suit = suit;
		this.value = value;
	}

	public String toString() {

		String retour = "";

		if (value != null && suit != null) {
			retour = value.getLabel() + " of " + suit.getLabel();
		}

		return retour;
	}

	public SuitEnum getSuit() {
		return suit;
	}

	public FaceValueEnum getValue() {
		return value;
	}

}
