package by.epam.task2.validator;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidatorTest {
	@DataProvider
	public Object[][] dValidator()
	{
		return new Object[][] {
			new Object[] {
					"Airliner r1 15 1 ouups 2" , true
			},
			new Object[] {
					"Airliner r1 15d 1 ouups 2" , false
			},
		};
	}
	
	
	@Test(dataProvider = "dValidator")
	public void isValidTest(String given,boolean supposedResult) {
		assertEquals(supposedResult,Validator.isValid(given));
	}
}
