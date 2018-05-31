package by.epam.preTraining.irina.tasks.task7.model;

public class VehiclesPark {
	private int numOfCrafts = 0;
	private Vehicle[] vehicles;
	private int peakOfStack;

	public VehiclesPark(int size) {
		vehicles = new Vehicle[size];
		peakOfStack = -1;
	}

	public VehiclesPark(Vehicle[] vehicles) {
		peakOfStack = -1;
	}

	public VehiclesPark(VehiclesPark park) {
		this.numOfCrafts = park.numOfCrafts;
		this.peakOfStack = park.peakOfStack;
		this.vehicles = park.vehicles;
	}

	public int getNumOfCrafts() {
		return numOfCrafts;
	}

	public void setNumOfCrafts(int numOfCrafts) {
		this.numOfCrafts = numOfCrafts;
	}

	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public int getPeakOfStack() {
		return peakOfStack;
	}

	public void setPeakOfStack(int peakOfStack) {
		this.peakOfStack = peakOfStack;
	}

	@Override
	public String toString() {
		Vehicle[] allCrafts = this.getVehicles();
		StringBuilder result = new StringBuilder();
		if (!isParkEmpty()) {
			for (int i = 0; i < allCrafts.length; i++) {
				if (allCrafts[i] != null) {
					result = result.append("Model: " + ((Aircraft) allCrafts[i]).getModel() + " || Price: " + allCrafts[i].getPrice()
							+ " || Max Speed: " + allCrafts[i].getMaxSpeed() + "\n");
				}
			}
			return result.toString();
		}
		return "Park is empty!";

	}

	// check if Park is empty
	public boolean isParkEmpty() {
		return this.numOfCrafts == 0;
	}

	// find Vehicle by it's Index
	public Vehicle getVehicleById(int id) {
		if (vehicles[id] != null) {
			return vehicles[id];
		}
		return null;
	}

	// find vehicle in the park
	public boolean isVehicleInThePark(Vehicle craft) {

		if (!isParkEmpty()) {
			for (int i = 0; i < vehicles.length; i++) {
				if (vehicles[i].equals(craft)) {
					return true;
				}
			}
		}
		return false;
	}

	// add vehicle to park
	public void addVehicleToPark(Vehicle newVehicle) {
		Vehicle[] newVehicles;

		if (!isParkEmpty()) {
			newVehicles = new Vehicle[vehicles.length * 2];
			System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
			newVehicles[++peakOfStack] = newVehicle;
			numOfCrafts++;
			vehicles = newVehicles;
		} else {
			vehicles[++peakOfStack] = newVehicle;
			numOfCrafts++;
		}

	}

	// add some vehicles to park
	public void addCraftsToPark(VehiclesPark park, Vehicle[] newCrafts) {
		Vehicle[] newPark = new Vehicle[vehicles.length + newCrafts.length];
		System.arraycopy(vehicles, 0, newPark, 0, vehicles.length);
		System.arraycopy(newCrafts, 0, newPark, vehicles.length, newCrafts.length);
		vehicles = newPark;

	}

	// delete vehicle from park by its index
	public Vehicle deleteVehicleById(int id) {

		if (!isParkEmpty() && id <= peakOfStack && id >= 0) {
			Vehicle deletedVehicle = vehicles[id];
			vehicles[id] = null;
			for (int i = id; i <= peakOfStack; i++) {
				for (int j = i + 1; i <= peakOfStack;) {
					vehicles[i] = vehicles[j];
					vehicles[j] = null;
					break;
				}
			}
			peakOfStack--;
			return deletedVehicle;
		}
		return null;
	}

	// delete all vehicles from park
	public void deleteAllVehiclesFromPark(VehiclesPark park) {
		if (!isParkEmpty()) {
			for (int i = 0; i <= peakOfStack; i++) {
				vehicles[i] = null;
			}
			numOfCrafts = 0;
		}
	}
	
}
