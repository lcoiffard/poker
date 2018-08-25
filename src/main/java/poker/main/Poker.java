package poker.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import poker.bean.Card;
import poker.bean.Deck;

/**
 * Main class launch at run who create a new deck with shuffled cards, and deal
 * all the card one by one
 * 
 * @author Laurent Coiffard
 *
 */
@Component
public class Poker implements CommandLineRunner {

	@Autowired
	private Deck deck;

	@Override
	public void run(String... args) {
		deck.shuffle();

		int nbDeal = 1;

		Card card = deck.dealOneCard();
		while (card != null) {
			System.out.println("Deal number " + nbDeal + " : " + card.toString());
			card = deck.dealOneCard();
			nbDeal++;
		}
		System.out.println("No more card to deal.");

	}
}
