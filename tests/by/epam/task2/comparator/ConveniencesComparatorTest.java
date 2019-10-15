package by.epam.task2.comparator;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.task2.model.Airliner;

public class ConveniencesComparatorTest {
	
	@DataProvider
	public Object[][] dConveniences() {
		return new Object[][] {
				new Object[] { 
						new Airliner[] { 
								new Airliner("1", 2L, 1L, "1", 2L)
								, new Airliner("3", 2L, 2L, "2", 2L) 
						}
						,new Airliner[] { 
								new Airliner("1", 2L, 1L, "1", 2L)
								, new Airliner("3", 2L, 2L, "2", 2L) 
						} 
				},
				new Object[] {
						new Airliner[] {
								new Airliner("1", 2L, 516L, "3", 2L)
								, new Airliner("3", 2L, 651L, "1", 2L) 
						}
						,new Airliner[] {
								new Airliner("3", 2L, 651L, "1", 2L)
								, new Airliner("1", 2L, 516L, "3", 2L)
						} 
				}, 
		};
	}

	@Test(dataProvider = "dConveniences")
	public void conveniencesCompareTest(Airliner[] airliners, Airliner[] result) {
		List<Airliner> pl = Arrays.asList(airliners);
		List<Airliner> res = Arrays.asList(result);
		pl.sort(new ConveniencesComparator());
		assertEquals(res, pl);
	}
}
