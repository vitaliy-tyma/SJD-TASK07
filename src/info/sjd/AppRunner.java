package info.sjd;

import java.util.logging.Logger;

/**
 * SJD-TASK07
 * Exception processing
 * Division by 0
 * */

public class AppRunner {

	
	public static float customDivision(int divisible, int divisor)
			throws DivisionByZeroCustomException{
		
		float result = 0;
		
		if (divisor == 0) {
			throw new DivisionByZeroCustomException();
		}
		else {
		result = divisible / divisor;
		}
		
		return result;
		
		
	}
	
	
/*MAIN****************************************/	
	public static void main(String[] args) throws DivisionByZeroCustomException {
		
		Logger logger = Logger.getLogger(AppRunner.class.getName());
		
		int divisible = 1000;
		int divisor = 0;
		float result = Float.NaN;
		
		
		try {
			result = customDivision(divisible, divisor);
		} 
		catch (DivisionByZeroCustomException ex) {
        	logger.info("DivisionByZeroCustomException - division is not possible!");
		}
		finally {
			logger.info("We are out.");
		}
		
		logger.info("Result = " + result);
		
	}

}
