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
					"Airliner name: r1 cost: 15 consumption: 1 conveniences: ouups seat_capacity: 2" , true
			},
		};
	}
	
	
	@Test(dataProvider = "dValidator")
	public void isValidTest(String given,boolean supposedResult) {
		assertEquals(supposedResult,Validator.isValid(given));
	}
}
