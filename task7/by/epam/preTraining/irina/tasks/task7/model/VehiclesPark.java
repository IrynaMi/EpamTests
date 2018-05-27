package by.epam.preTraining.irina.tasks.task7.model;

public class VehiclesPark {
	private int numOfCrafts = 0;
	private Vehicle[] vehicles;
	private int peakOftack;

	public VehiclesPark(int size) {
		vehicles = new Vehicle[size];
		peakOftack = -1;
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

	// check if Park is empty
	public boolean isParkEmpty() {
		return peakOftack == vehicles.length - 1;
	}

	// push element to container
	public void addCraftToPark(Vehicle newVehicle) {
		Vehicle[] newVehicles;

		if (isParkEmpty()) {
			newVehicles = new Vehicle[vehicles.length * 2];
			System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
			newVehicles[++peakOftack] = newVehicle;
			numOfCrafts++;
			vehicles = newVehicles;
		} else {
			vehicles[++peakOftack] = newVehicle;
			numOfCrafts++;
		}

	}

	// Add some aircrafts to park
	public void addCraftsToPark(Vehicle[] newCrafts) {
		Vehicle[] newPark = new Vehicle[vehicles.length + newCrafts.length];
		System.arraycopy(vehicles, 0, newPark, 0, vehicles.length);
		System.arraycopy(newCrafts, 0, newPark, vehicles.length, newCrafts.length);
		vehicles = newPark;

	}

	// find Aircraft by its Index
	public Vehicle getVehicleById(int id) {
		if (vehicles[id] != null) {
			return vehicles[id];
		} else {
			return null;
		}

	}

	// delete Aircraft from park by its index
	public Vehicle deleteVehicleById(int id) {

		if (!isParkEmpty() || id <= peakOftack) {
			Vehicle deletedVehicle = vehicles[id];
			vehicles[id] = null;
			for (int i = id; i <= peakOftack; i++) {
				for (int j = i + 1; i <= peakOftack;) {
					vehicles[i] = vehicles[j];
					vehicles[j] = null;
					break;
				}
			}
			peakOftack--;
			return deletedVehicle;
		}
		return null;
	}

	public void deleteAllVehiclesFromPark() {
		for (int i = 0; i <= peakOftack; i++) {
			vehicles[i] = null;
			numOfCrafts = 0;
		}
	}

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

	// find the Craft with max speed
	public Vehicle findTheFastestCraft() {
		Vehicle theFasterstVehicle = vehicles[0];
		for (int i = 1; i < numOfCrafts - 1; i++) {
			if (vehicles[i].getMaxSpeed() > theFasterstVehicle.getMaxSpeed()) {
				theFasterstVehicle = vehicles[i];
			}
		}
		return theFasterstVehicle;
	}

	// delete last element in Stack
	public Vehicle[] deleteLastInVehicle(Vehicle[] vehicles) {

		if (!isParkEmpty()) {
			for (int i = peakOftack; i >= 0; i--) {
				if (vehicles[i] != null) {
					vehicles[i] = null;
					numOfCrafts--;
					peakOftack--;
					break;
				}
			}
		}
		return vehicles;
	}

	// delete first element in Queue and shift all elements to the beginning
	public Vehicle[] deleteFirstInVehicle(VehiclesPark park) {
		int start = 0;
		if (vehicles[start] != null) {
			vehicles[start] = null;
			numOfCrafts--;
			peakOftack--;
		}
		if (!isParkEmpty()) {
			for (int i = 0; i <= numOfCrafts; i++) {
				for (int j = i + 1; j <= numOfCrafts;) {
					if (vehicles[i] == null) {
						vehicles[i] = vehicles[j];
						vehicles[j] = null;
					}
					break;
				}
			}
		}
		return vehicles;
	}

}
