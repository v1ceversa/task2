package by.epam.task2;

import java.util.ArrayList;
import java.util.List;

import by.epam.task2.comparator.*;
import by.epam.task2.factory.PlaneFactory;
import by.epam.task2.model.Airport;
import by.epam.task2.model.Plane;
import by.epam.task2.parser.Parser;
import by.epam.task2.reader.Reader;


public class Task {

	public static void main(String[] args) {
		
		String filepath = new String("resources\\planes.txt");
		
		List<String> planesStr = Reader.getVallidStrings(filepath);
		if (planesStr == null) {
			return ;
		}
		List<Plane> planes = new ArrayList<Plane>();
		for (String plane : planesStr) {
			List<String> typeAndParams = Parser.parse(plane);
			planes.add(PlaneFactory.createPlane(typeAndParams));
		}
		
		Airport airport = new Airport(planes);
		airport.sortBy(new WeightCapacityComparator().thenComparing(new NameComparator()));
		airport.showPlanes();
	}

}
