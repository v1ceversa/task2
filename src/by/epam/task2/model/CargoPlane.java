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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((weightCapacity == null) ? 0 : weightCapacity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoPlane other = (CargoPlane) obj;
		if (weightCapacity == null) {
			if (other.weightCapacity != null)
				return false;
		} else if (!weightCapacity.equals(other.weightCapacity))
			return false;
		return true;
	}

	public Long getWeightCapacity() {
		return weightCapacity;
	}

	public void setWeightCapacity(Long weigthCapacity) {
		this.weightCapacity = weigthCapacity;
	}

	@Override
	public String toString() {
		
		return "====/PLANE\\====\n"
				+ CommonConstants.CARGO_PLANE
				+ "\nNAME: " + getName()
				+ "\nCOST: " + getCost()
				+ "\nCONSUMPTION: " + getConsumption()
				+ "\nWEIGHT CAPACITY: " + getWeightCapacity()
				+ "\n====\\PLANE/====";
	}



}
