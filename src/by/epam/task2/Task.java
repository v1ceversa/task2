package by.epam.task2;

import by.epam.task2.comparator.*;
import by.epam.task2.model.Airport;


public class Task {

	public static void main(String[] args) {
		String filepath = new String("resources\\planes.txt");
		Airport airport = new Airport(filepath);
		airport.sortBy(new WeightCapacityComparator().thenComparing(new NameComparator()));
	}

}
