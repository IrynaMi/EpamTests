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
		super(craft);
		this.model = craft.model;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((model == null) ? 0 : model.hashCode());
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
		Aircraft other = (Aircraft) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Model: " + ((Aircraft) this).getModel() + " || Price: " + this.getPrice() + " || Max Speed: "
				+ this.getMaxSpeed() + " || Number of passengers: " + this.getNumberOfPassangers();
	}
	
	public void countHightOfFlight() {
		// doing somthing...
	}
}
