package by.epam.task2.comparator;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.Plane;

public class SeatCapacityComparatorTest {
	@DataProvider
	public Object[][] dSeatCapacity() {
		return new Object[][] {
				new Object[] { 
						new Airliner[] { 
								new Airliner("1", 2L, 1L, "1", 2L)
								, new Airliner("3", 2L, 2L, "1", 3L) 
						}
						, "13" 
				},
				new Object[] {
						new Airliner[] {
								new Airliner("1", 2L, 516L, "1", 2L)
								, new Airliner("3", 2L, 651L, "1", 1L) 
						}
						, "31" 
				}, 
		};
	}

	@Test(dataProvider = "dSeatCapacity")
	public void seatCapacityCompareTest(Airliner[] airliners, String result) {
		List<Airliner> pl = Arrays.asList(airliners);
		pl.sort(new SeatCapacityComparator());
		String answer = "";
		for (Plane plane: pl) {
			answer += plane.getName();
		}
		assertEquals(result, answer);
	}
}
