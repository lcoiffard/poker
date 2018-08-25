package poker.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class FaceValueEnumTest {

	@Test
	public void findByValueOk() {
		FaceValueEnum faceValue = FaceValueEnum.findByValue(FaceValueEnum.FIVE.getValue());

		assertEquals(FaceValueEnum.FIVE, faceValue);

	}

	@Test
	public void findByValueNotFound() {
		FaceValueEnum faceValue = FaceValueEnum.findByValue(50);

		assertNull(faceValue);

	}

}
