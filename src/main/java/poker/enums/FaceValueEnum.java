package poker.enums;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exhaustive values of face value for a play card
 * 
 * @author Laurent Coiffard
 *
 */
public enum FaceValueEnum {

	ACE(1, "Ace"), TWO(2, "2"), THREE(3, "3"), FOUR(4, "4"), FIVE(5, "5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8, "8"),
	NINE(9, "9"), TEN(10, "10"), JACK(11, "Jack"), QUEEN(12, "Queen"), KING(13, "King");

	private Integer value;
	private String label;

	FaceValueEnum(Integer value, String label) {
		this.value = value;
		this.label = label;
	}

	static Logger logger = LoggerFactory.getLogger(FaceValueEnum.class);

	/**
	 * Find a Face by its value
	 * 
	 * @param value
	 * @return the face enum found
	 */
	public static FaceValueEnum findByValue(Integer value) {
		FaceValueEnum faceValuefound = null;

		try {
			faceValuefound = Stream.of(FaceValueEnum.values()).filter(d -> d.getValue().equals(value)).findFirst()
					.get();
		} catch (NoSuchElementException e) {
			logger.warn("FaceValueEnum : value " + value + " not found.");
		}

		return faceValuefound;
	}

	public Integer getValue() {
		return value;
	}

	public String getLabel() {
		return label;
	}
}
