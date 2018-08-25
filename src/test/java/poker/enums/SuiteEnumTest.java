package poker.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SuiteEnumTest {

	@Test
	public void findByValueOk() {
		SuitEnum suitValue = SuitEnum.findByValue(SuitEnum.DIAMONDS.getValue());

		assertEquals(SuitEnum.DIAMONDS, suitValue);

	}

	@Test
	public void findByValueNotFound() {
		SuitEnum suitValue = SuitEnum.findByValue(50);

		assertNull(suitValue);

	}

}
