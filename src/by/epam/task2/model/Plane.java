package by.epam.task2.model;

abstract public class Plane {
	
	private String name;
	private Long cost;
	private Long consumption;
	
	public Plane() {
		
	}
	
	public Plane(String name, Long cost, Long consumption) {
		this.name = name;
		this.cost = cost;
		this.consumption = consumption;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCost() {
		return cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	public Long getConsumption() {
		return consumption;
	}

	public void setConsumption(Long consumption) {
		this.consumption = consumption;
	}
	
	public abstract void show();
	
}
