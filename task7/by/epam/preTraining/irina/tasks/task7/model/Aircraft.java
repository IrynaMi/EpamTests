package by.epam.preTraining.irina.tasks.task7.model;

public class Aircraft extends Vehicle {
	
	private String model;
	
	public Aircraft(){
		
	}
	
	public Aircraft(double price, double maxSpeed, int numOfPassangers, String model){
		super(price, maxSpeed, numOfPassangers);
		this.model = model;
	}
	
	public Aircraft(Aircraft craft){
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void move (Vehicle craft) {
		System.out.println("Aircraft's " + ((Aircraft) craft).getModel() + " max speed is " + craft.getMaxSpeed());
		
	}
	
	

}
