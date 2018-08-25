package poker.bean;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import poker.enums.FaceValueEnum;
import poker.enums.SuitEnum;

/**
 * Singleton bean which contains a set of cards that can be shuffle and dealed
 * one by one
 * 
 * @author Laurent Coiffard
 *
 */
@Component
public class Deck {

	static Logger logger = LoggerFactory.getLogger(Deck.class);

	private List<Card> cards = new ArrayList<>();

	/**
	 * Fill the deck with a new set of cards
	 */
	private void fillDeck() {
		logger.debug("Begin fillDeck");
		this.cards = new ArrayList<>();
		for (int suit = 0; suit <= 3; suit++) {
			for (int value = 1; value <= 13; value++) {
				this.cards.add(new Card(SuitEnum.findByValue(suit), FaceValueEnum.findByValue(value)));
			}
		}
		logger.debug("End fillDeck");
	}

	/**
	 * Shuffle cards int the deck
	 */
	public void shuffle() {
		logger.debug("Begin shuffle");
		fillDeck();
		for (int i = this.cards.size() - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));
			Card temp = this.cards.get(i);
			this.cards.set(i, this.cards.get(rand));
			this.cards.set(rand, temp);
		}
		logger.debug("End shuffle");
	}

	/**
	 * Take one card from the deck
	 * 
	 * @return the card removed from the deck
	 */
	public Card dealOneCard() {
		logger.debug("Begin dealOneCard");
		Card cardDealed = null;

		if (!CollectionUtils.isEmpty(this.cards)) {
			cardDealed = this.cards.get(0);
			this.cards.remove(cardDealed);
		}
		logger.debug("End dealOneCard");
		return cardDealed;

	}

}
