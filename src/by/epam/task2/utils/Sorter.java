package by.epam.task2.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.task2.filter.Filter;
import by.epam.task2.model.Airliner;
import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class Sorter {
	public static void sortPlanes(List<Plane> planes, Comparator<Plane> comp) {
		planes.sort(comp);
	}

	public static List<CargoPlane> sortCargos(List<Plane> planes, Comparator<CargoPlane> comp) {
		List<CargoPlane> cargos = Filter.getCargoPlaneList(planes);
		if (cargos != null) {
			cargos.sort(comp);
		}
		return cargos;
	}

	public static List<Airliner> sortAirliner(List<Plane> planes, Comparator<Airliner> comp) {
		List<Airliner> airliners = Filter.getAirlinerList(planes);
		if (airliners != null) {
			airliners.sort(comp);
		}
		return airliners;
	}

	public List<Plane> getCertainPlane(List<Plane> planes, Long consumptionLower, Long consumptionUpper) {
		List<Plane> planes2 = null;
		boolean isInited = false;
		for (Plane plane : planes) {
			if (plane.getConsumption() > consumptionLower && plane.getConsumption() < consumptionUpper) {
				if (!isInited) {
					isInited = true;
					planes2 = new ArrayList<Plane>();
				}
				planes2.add(plane);
			}
		}
		return planes2;
	}
}
