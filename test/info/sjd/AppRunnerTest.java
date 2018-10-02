package info.sjd;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

class AppRunnerTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	void testCustomDivision() throws DivisionByZeroCustomException {

		assertEquals(10.0, AppRunner.customDivision(1000, 100));
		assertEquals(100.0, AppRunner.customDivision(1000, 10));
		assertEquals(1.0, AppRunner.customDivision(1000, 1000));
		assertEquals(5.0, AppRunner.customDivision(10, 2));

		/** This test fails. 
		assertEquals(Float.NaN, AppRunner.customDivision(1000, 0));*/

		try {
			AppRunner.customDivision(1000, 0);
			fail("Test Failed - Expected DivisionByZeroCustomException");
		} catch (DivisionByZeroCustomException ex) {
			assertThat(ex.toString(), CoreMatchers.containsString("DivisionByZeroCustomException"));
		}

	}

}
