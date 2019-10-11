package by.epam.task2.comparator;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class SeatCapacityComparatorTest {
	@DataProvider
	public Object[][] dSeatCapacity() {
		return new Object[][] {
				new Object[] { 
						new Plane[] { 
								new Airliner("1", 2L, 1L, "1", 2L)
								, new CargoPlane("2", 1L, 3L, 2L)
								, new Airliner("3", 2L, 2L, "1", 3L) 
						}
						, "213" 
				},
				new Object[] {
						new Plane[] {
								new Airliner("1", 2L, 516L, "1", 2L)
								, new CargoPlane("2", 1L, 15L, 2L)
								, new Airliner("3", 2L, 651L, "1", 1L) 
						}
						, "231" 
				}, 
		};
	}

	@Test(dataProvider = "dSeatCapacity")
	public void seatCapacityCompareTest(Plane[] planes, String result) {
		List<Plane> pl = Arrays.asList(planes);
		pl.sort(new SeatCapacityComparator());
		String answer = "";
		for (Plane plane: pl) {
			answer += plane.getName();
		}
		assertEquals(result, answer);
	}
}
