package by.epam.task2.model;

import java.util.List;


public class Airport {
	private List<Plane> planes;
	
	public Airport(List<Plane> planes) {
		this.setPlanes(planes);
	}

	public List<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}
	
	
}
