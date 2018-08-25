package poker.bean;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Test;

public class DeckTest {

	@Test
	public void shuffleOk() {

		List<Card> cards = new ArrayList<>();

		Deck deck = new Deck();

		deck.shuffle();
		for (int i = 0; i < 55; i++) {
			Card card = deck.dealOneCard();
			if (card != null) {
				cards.add(card);
			}
		}

		assertEquals(52, cards.size());

		Set<Card> set = cards.stream().collect(Collectors
				.toCollection(() -> new TreeSet<>(Comparator.comparing(Card::getSuit).thenComparing(Card::getValue))));

		assertEquals(52, set.size());

	}

}
