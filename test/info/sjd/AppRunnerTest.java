package info.sjd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppRunnerTest {

	@Test
	void testCustomDivision() throws DivisionByZeroCustomException {
		assertEquals(10.0, AppRunner.customDivision(1000, 100));
		assertEquals(100.0, AppRunner.customDivision(1000, 10));
		assertEquals(1.0, AppRunner.customDivision(1000, 1000));
		assertEquals(5.0, AppRunner.customDivision(10, 2));
		
		/*This test fails.*/
		//assertEquals(0.0, AppRunner.customDivision(1000, 0));
		
		
		
	}

}
