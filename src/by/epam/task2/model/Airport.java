package by.epam.task2.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.task2.factory.PlaneFactory;
import by.epam.task2.parser.Parser;
import by.epam.task2.reader.Reader;

public class Airport {
	private List<Plane> planes;
	
	private Airport() {
		planes = new ArrayList<Plane>();
	}
	
	public Airport(String filePath)  {
		this();
		setPlanes(filePath);
	}
	
	public void setPlanes(String filePath) {
		if(planes.get(0) == null)
			throw new RuntimeException("file is empty");
		Reader reader = new Reader();
		List<String> planesStr = reader.getVallidStrings(filePath);
		List<Plane> planes = new ArrayList<Plane>();
		for (String planeStr : planesStr) {
			String type = Parser.getType(planeStr);
			List<String> params = Parser.getParamList(planeStr);
			planes.add(PlaneFactory.createPlane(type, params));
		}
	}
	
	public void showPlanes() {
		System.out.println("====/PLANES\\====");
		for (Plane plane: planes) {
			plane.show();
		}
		System.out.println("====\\PLANES/====");
		System.out.println();
	}
	
	public Plane getCertainPlane(Long consumptionLower, Long consumptionUpper) {
		for (Plane plane : planes) {
			if (plane.getConsumption() > consumptionLower && plane.getConsumption() < consumptionUpper) {
				return plane;
			}
		}
		return null;
	}
	
	public void sortBy(Comparator<Plane> comp)
	{
		planes.sort(comp);
	}
	
}
