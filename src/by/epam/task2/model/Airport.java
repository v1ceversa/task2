package by.epam.task2.model;

import java.util.Comparator;
import java.util.List;


public class Airport {
	private List<Plane> planes;
	
	public Airport(List<Plane> planes) {
		this.planes = planes;
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
