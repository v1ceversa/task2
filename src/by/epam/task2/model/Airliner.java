package by.epam.task2.model;

import by.epam.task2.constant.CommonConstants;

public class Airliner extends Plane {
	
	private String conveniences;
	private Long seatCapacity;
	
	public Airliner() {
		
	}
	
	public Airliner(String name,Long cost, Long consumption, String conveniences, Long seatCapacity) {
		super(name,cost,consumption);
		this.conveniences = conveniences;
		this.seatCapacity = seatCapacity;
	}
	
	@Override
	public void show() {
		System.out.println("====/PLANE\\====");
		System.out.println(CommonConstants.AIRLINER);
		System.out.println("NAME: " + getName());
		System.out.println("COST: " + getCost());
		System.out.println("CONSUMPTION: " + getConsumption());
		System.out.println("CONVENIENCES: " + getConveniences());
		System.out.println("SEAT CAPACITY: " + getSeatCapacity());
		System.out.println("====\\PLANE/====");
	}

	public String getConveniences() {
		return conveniences;
	}

	public void setConveniences(String conveniences) {
		this.conveniences = conveniences;
	}

	public Long getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(Long seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	
}
