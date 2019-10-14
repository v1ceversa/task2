package by.epam.task2.comparator;

import java.util.Comparator;

import by.epam.task2.model.Airliner;


public class SeatCapacityComparator implements Comparator<Airliner>{

	@Override
	public int compare(Airliner o1, Airliner o2) {
		return o1.getSeatCapacity().compareTo(o2.getSeatCapacity());
	}
	
}
