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
	public String toString() {
		
		return "====/PLANE\\====\n"
				+ CommonConstants.AIRLINER
				+ "\nNAME: " + getName()
				+ "\nCOST: " + getCost()
				+ "\nCONSUMPTION: " + getConsumption()
				+ "\nCONVENIENCES: " + getConveniences()
				+ "\nSEAT CAPACITY: " + getSeatCapacity()
				+ "\n====\\PLANE/====";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((conveniences == null) ? 0 : conveniences.hashCode());
		result = prime * result + ((seatCapacity == null) ? 0 : seatCapacity.hashCode());
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
		Airliner other = (Airliner) obj;
		if (conveniences == null) {
			if (other.conveniences != null)
				return false;
		} else if (!conveniences.equals(other.conveniences))
			return false;
		if (seatCapacity == null) {
			if (other.seatCapacity != null)
				return false;
		} else if (!seatCapacity.equals(other.seatCapacity))
			return false;
		return true;
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
