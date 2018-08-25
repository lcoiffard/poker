package poker.enums;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exhaustive values of suits for a play card
 * 
 * @author Laurent Coiffard
 *
 */
public enum SuitEnum {

	SPADES(0, "Spades"), HEARTS(1, "Hearts"), DIAMONDS(2, "Diamonds"), CLUBS(3, "Clubs");

	private Integer value;
	private String label;

	SuitEnum(Integer value, String label) {
		this.value = value;
		this.label = label;
	}

	public Integer getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}

	static Logger logger = LoggerFactory.getLogger(SuitEnum.class);

	/**
	 * Find a Suit by its value
	 * 
	 * @param value
	 * @return the suit enum found
	 */
	public static SuitEnum findByValue(Integer value) {

		SuitEnum suitfound = null;

		try {
			suitfound = Stream.of(SuitEnum.values()).filter(d -> d.getValue().equals(value)).findFirst().get();
		} catch (NoSuchElementException e) {
			logger.warn("SuitEnum : value " + value + " not found.");
		}

		return suitfound;

	}
}
