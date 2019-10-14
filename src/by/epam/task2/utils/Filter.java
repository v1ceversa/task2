package by.epam.task2.utils;

import java.util.ArrayList;
import java.util.List;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class Filter {
	public static List<Airliner> getAirlinerList(List<Plane> planes) {
		List<Airliner> airliners = null;
		boolean isAirlinersInit = false;
		for (Plane plane : planes) {
			if (plane instanceof Airliner) {
				if (!isAirlinersInit) {
					airliners = new ArrayList<Airliner>();
					isAirlinersInit = true;
				}
				airliners.add((Airliner) plane);
			}
		}
		return airliners;
	}
	
	public static List<CargoPlane> getCargoPlaneList(List<Plane> planes) {
		List<CargoPlane> cargos = null;
		boolean isCargoPlanesInit = false;
		for (Plane plane : planes) {
			if (plane instanceof CargoPlane) {
				if (!isCargoPlanesInit) {
					cargos = new ArrayList<CargoPlane>();
					isCargoPlanesInit = true;
				}
				cargos.add((CargoPlane) plane);
			}
		}
		return cargos;
	}
}
