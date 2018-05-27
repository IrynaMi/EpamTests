package by.epam.preTraining.irina.tasks.task7.model;

public class VehiclesPark {
	private int numOfCrafts = 0;
	private Vehicle[] vehicles;
	private int peakOfStack;

	public VehiclesPark(int size) {
		vehicles = new Vehicle[size];
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

	// check if Park is empty
	public boolean isParkEmpty(VehiclesPark park) {
		return numOfCrafts == 0;
	}

	// push element to container
	public void addCraftToPark(Vehicle newVehicle) {
		Vehicle[] newVehicles;

		if (!isParkEmpty(this)) {
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

		if (!isParkEmpty(this) || id <= peakOfStack) {
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

	public void deleteAllVehiclesFromPark(VehiclesPark park) {
		if (!isParkEmpty(this)) {
			for (int i = 0; i <= peakOfStack; i++) {
				vehicles[i] = null;
				numOfCrafts = 0;
			}
		}
	}

	public boolean isVehicleInThePark(Vehicle craft) {
		if (!isParkEmpty(this)) {
			for (int i = 0; i < vehicles.length; i++) {
				if (vehicles[i].equals(craft)) {
					return true;
				}
			}
		}
		return false;
	}

	// find the Craft with max speed
	public Vehicle findTheFastestCraft(VehiclesPark park) {
		Vehicle theFasterstVehicle = null;
		if (!isParkEmpty(this)) {
			theFasterstVehicle = vehicles[0];
			for (int i = 1; i < numOfCrafts; i++) {
				if (vehicles[i].getMaxSpeed() > theFasterstVehicle.getMaxSpeed()) {
					theFasterstVehicle = vehicles[i];
				}
			}
		}
		return theFasterstVehicle;
	}

	// delete last element in Stack
	public Vehicle[] deleteLastInVehicle(VehiclesPark park) {

		if (!isParkEmpty(park)) {
			for (int i = peakOfStack; i >= 0; i--) {
				if (vehicles[i] != null) {
					vehicles[i] = null;
					numOfCrafts--;
					peakOfStack--;
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
			peakOfStack--;
		}
		if (!isParkEmpty(this)) {
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

	//sorted by MAx Speed
	public void sortVehiclesByMaxSpeed(VehiclesPark park) {
		if (!isParkEmpty(this)) {
			for (int i = 0; i < numOfCrafts; i++) {
				double minSpeed = vehicles[i].getMaxSpeed();

				for (int j = i + 1; j < numOfCrafts; j++) {
					if (vehicles[j].getMaxSpeed() < minSpeed) {
						Vehicle temp = vehicles[i];
						vehicles[i] = vehicles[j];
						vehicles[j] = temp;
					}

				}
			}
		}
	}

}
