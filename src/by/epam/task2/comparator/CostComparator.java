package by.epam.task2.comparator;

import java.util.Comparator;

import by.epam.task2.model.Plane;

public class CostComparator implements Comparator<Plane> {

	@Override
	public int compare(Plane o1, Plane o2) {
		return o1.getCost().compareTo(o2.getCost());
	}
	
}
