package by.epam.task2.comparator;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class NameComparatorTest {
	@DataProvider
	public Object[][] dName() {
		return new Object[][] {
				new Object[] { 
						new Plane[] { 
								new Airliner("1", 2L, 1L, "1", 2L)
								, new CargoPlane("2", 1L, 3L, 2L)
								, new Airliner("3", 2L, 2L, "1", 2L) 
						}
						,new Plane[] { 
								new Airliner("1", 2L, 1L, "1", 2L)
								, new CargoPlane("2", 1L, 3L, 2L)
								, new Airliner("3", 2L, 2L, "1", 2L) 
						} 
				},
				new Object[] {
						new Plane[] {
								new Airliner("2", 2L, 516L, "1", 2L)
								, new Airliner("3", 2L, 651L, "1", 2L)
								, new CargoPlane("1", 1L, 15L, 2L)
						}
						,new Plane[] {
								new CargoPlane("1", 1L, 15L, 2L)
								, new Airliner("2", 2L, 516L, "1", 2L)
								, new Airliner("3", 2L, 651L, "1", 2L)
						}
						 
				}, 
		};
	}

	@Test(dataProvider = "dName")
	public void nameCompareTest(Plane[] planes, Plane[] result) {
		List<Plane> pl = Arrays.asList(planes);
		List<Plane> res = Arrays.asList(result);
		assertEquals(res, pl);
	}
}
