package poker.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import poker.enums.FaceValueEnum;
import poker.enums.SuitEnum;

public class CardTest {

	@Test
	public void constructorOk() {
		Card card = new Card(SuitEnum.CLUBS, FaceValueEnum.ACE);
		assertEquals(SuitEnum.CLUBS, card.getSuit());
		assertEquals(FaceValueEnum.ACE, card.getValue());

	}

	@Test
	public void constructorOkWithNull() {
		Card card = new Card(null, null);
		assertEquals(null, card.getSuit());
		assertEquals(null, card.getValue());

	}

	@Test
	public void toStringOk() {
		Card card = new Card(SuitEnum.CLUBS, FaceValueEnum.ACE);
		assertEquals(FaceValueEnum.ACE.getLabel() + " of " + SuitEnum.CLUBS.getLabel(), card.toString());

	}

	@Test
	public void toStringOkWithSuitNull() {
		Card card = new Card(null, FaceValueEnum.ACE);
		assertEquals("", card.toString());

	}

	@Test
	public void toStringOkWithFaceNull() {
		Card card = new Card(SuitEnum.CLUBS, null);
		assertEquals("", card.toString());

	}

	@Test
	public void toStringOkWithAllNull() {
		Card card = new Card(null, null);
		assertEquals("", card.toString());

	}

}
