package by.epam.task2.parser;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;

public class ParserTest {
	
	@DataProvider
	public Object[][] dp() {
		return new Object[][] { 
			new Object[] { 
					"Airliner abc 15 15 sfsgar 15"
					, new ArrayList<String>(Arrays.asList("Airliner", "abc", "15", "15", "sfsgar", "15"))
					
			}
			, new Object[] { 
					"CargoPlane abc 15 15 15"
					, new ArrayList<String>(Arrays.asList("Airliner", "abc", "15", "15", "15"))
					
			}, 
		};
	}

	@Test(dataProvider = "dp")
	public void parseTest(String given, List<String> result) {
		List<String> planeStr = Parser.parse(given);
		assertEquals(planeStr, given);
	}
}
