package by.epam.preTraining.irina.tasks.task7.model;

public abcrtact class Vehicle {
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


	
	

}
