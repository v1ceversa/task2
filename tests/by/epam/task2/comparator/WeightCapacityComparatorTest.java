package by.epam.task2.comparator;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.task2.model.CargoPlane;

public class WeightCapacityComparatorTest {
	@DataProvider
	public Object[][] dWeightCapacity() {
		return new Object[][] {
				new Object[] { 
						new CargoPlane[] {
								new CargoPlane("1", 1L, 3L, 2L)
								, new CargoPlane("2", 1L, 3L, 4L)
								, new CargoPlane("3", 1L, 3L, 3L)
						}
						,new CargoPlane[] {
								new CargoPlane("1", 1L, 3L, 2L)
								, new CargoPlane("3", 1L, 3L, 3L)
								, new CargoPlane("2", 1L, 3L, 4L)
								
						} 
				},
				new Object[] {
						new CargoPlane[] {
								new CargoPlane("1", 1L, 3L, 2L)
								, new CargoPlane("2", 1L, 15L, 3L)
								, new CargoPlane("3", 1L, 15L, 1L) 
						}
						,new CargoPlane[] {
								 new CargoPlane("3", 1L, 15L, 1L)
								,new CargoPlane("1", 1L, 3L, 2L)
								, new CargoPlane("2", 1L, 15L, 3L)
						}
				}, 
		};
	}

	@Test(dataProvider = "dWeightCapacity")
	public void consumpitonCompareTest(CargoPlane[] cargos, CargoPlane[] result) {
		List<CargoPlane> pl = Arrays.asList(cargos);
		List<CargoPlane> res = Arrays.asList(result);
		pl.sort(new WeightCapacityComparator());
		assertEquals(pl, res);
	}
}
