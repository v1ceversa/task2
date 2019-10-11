package by.epam.task2.comparator;

import java.util.Comparator;

import by.epam.task2.model.Plane;

public class NameComparator implements Comparator<Plane> {

	@Override
	public int compare(Plane arg0, Plane arg1) {
		return arg0.getName().compareTo(arg1.getName());
	}
	
}
