package by.epam.task2.model;

import by.epam.task2.constant.CommonConstants;

public class CargoPlane extends Plane {
	private Long weightCapacity;
	
	public CargoPlane() {
		
	}
	
	public CargoPlane(String name,Long cost, Long consumption, Long weightCapacity) {
		super(name,cost,consumption);
		this.weightCapacity = weightCapacity;
	}
	
	@Override
	public void show() {
		System.out.println("====/PLANE\\====");
		System.out.println(CommonConstants.CARGO_PLANE);
		System.out.println("NAME: " + getName());
		System.out.println("COST: " + getCost());
		System.out.println("CONSUMPTION: " + getConsumption());
		System.out.println("SEAT CAPACITY: " + getWeightCapacity());
		System.out.println("====\\PLANE/====");
	}
	
	public Long getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(Long weigthCapacity) {
		this.weightCapacity = weigthCapacity;
	}



}
