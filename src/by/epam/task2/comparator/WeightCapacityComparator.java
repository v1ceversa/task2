package by.epam.task2.comparator;

import java.util.Comparator;

import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class WeightCapacityComparator implements Comparator<Plane> {


	@Override
	public int compare(Plane o1, Plane o2) {
		if (o1 instanceof CargoPlane) {
			if (o2 instanceof CargoPlane) {
				return ((CargoPlane) o1).getWeightCapacity().compareTo(((CargoPlane) o2).getWeightCapacity());
			}
			else {
				return 1;
			}
		}
		else if (o2 instanceof CargoPlane) {
			return -1;
		}
		return 0;
	}

}
