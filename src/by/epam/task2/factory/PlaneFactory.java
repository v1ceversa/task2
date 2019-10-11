package by.epam.task2.factory;

import static by.epam.task2.constant.CommonConstants.*;

import java.util.List;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class PlaneFactory {
	
	public static Plane createPlane(String type, List<String> params) {
		Plane plane = null;
		switch (type) {
		case AIRLINER:
			plane = new Airliner();
			plane.setName(params.get(0));
			plane.setCost(Long.getLong(params.get(1)));
			plane.setConsumption(Long.getLong(params.get(2)));
			((Airliner) plane).setConveniences(params.get(3));
			((Airliner) plane).setSeatCapacity(Long.getLong(params.get(4)));
			break;
		case CARGO_PLANE:
			plane = new CargoPlane();
			plane.setName(params.get(0));
			plane.setCost(Long.getLong(params.get(1)));
			plane.setConsumption(Long.getLong(params.get(2)));
			((CargoPlane) plane).setWeightCapacity(Long.getLong(params.get(3)));
			break;
		}
		return plane;
	}
}
