package by.epam.preTraining.irina.tasks.task7.model;

public abstract class Vehicle {
	private double price;
	private double maxSpeed;
	private int numberOfPassangers;
	
	Vehicle(){
		
	}
	
	Vehicle(Vehicle v){
		this.price = v.price;
		this.maxSpeed = v.maxSpeed;
		this.numberOfPassangers = v.numberOfPassangers;
	}
	
	Vehicle(double price, double maxSpeed, int numOfPassangers){
		this.maxSpeed = maxSpeed;
		this.price = price;
		this.numberOfPassangers = numOfPassangers;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberOfPassangers() {
		return numberOfPassangers;
	}

	public void setNumberOfPassangers(int numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}

	public abstract void move(Vehicle v);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(maxSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfPassangers;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (Double.doubleToLongBits(maxSpeed) != Double.doubleToLongBits(other.maxSpeed))
			return false;
		if (numberOfPassangers != other.numberOfPassangers)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
}
