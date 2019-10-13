package by.epam.task2.factory;

import static by.epam.task2.constant.CommonConstants.*;

import java.util.List;

import by.epam.task2.model.Airliner;
import by.epam.task2.model.CargoPlane;
import by.epam.task2.model.Plane;

public class PlaneFactory {
	
	public static Plane createPlane(List<String> params) {
		Plane plane = null;
		switch (params.get(0)) {
		case AIRLINER:
			plane = new Airliner();
			plane.setName(params.get(1));
			plane.setCost(Long.parseLong(params.get(2)));
			plane.setConsumption(Long.parseLong(params.get(3)));
			((Airliner) plane).setConveniences(params.get(4));
			((Airliner) plane).setSeatCapacity(Long.parseLong(params.get(5)));
			break;
		case CARGO_PLANE:
			plane = new CargoPlane();
			plane.setName(params.get(1));
			plane.setCost(Long.parseLong(params.get(2)));
			plane.setConsumption(Long.parseLong(params.get(3)));
			((CargoPlane) plane).setWeightCapacity(Long.parseLong(params.get(4)));
			break;
		}
		return plane;
	}
}
