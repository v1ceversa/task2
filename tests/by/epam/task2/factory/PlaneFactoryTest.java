package by.epam.task2.factory;

import org.testng.annotations.Test;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.Plane;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;

public class PlaneFactoryTest {

	public void f(Integer n, String s) {
	}

	@DataProvider
  public Object[][] dp() {
		return new Object[][] {
				new Object[] {
						new ArrayList<String>(Arrays.asList("Airliner", "r1", "15", "15", "d", "15"))
						, new Airliner("r1", 15L, 15L, "d", 15L)
				}
			    
		};
    
  }

	@Test(dataProvider = "dp")
	public void createPlaneTest(List<String> given, Plane result) {
		Plane pl = PlaneFactory.createPlane(given);
		assertEquals(pl, result);
	}
}
