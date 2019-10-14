package by.epam.task2.comparator;

import java.util.Comparator;

import by.epam.task2.model.CargoPlane;


public class WeightCapacityComparator implements Comparator<CargoPlane> {


	@Override
	public int compare(CargoPlane o1, CargoPlane o2) {
		return o1.getWeightCapacity().compareTo(o2.getWeightCapacity());
	}

}
