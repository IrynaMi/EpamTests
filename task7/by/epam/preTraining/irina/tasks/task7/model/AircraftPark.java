package by.epam.preTraining.irina.tasks.task7.model;

public class AircraftPark {
	private int numOfCrafts = 0;
	private Aircraft[] crafts;
	private int peakOftack;

	public AircraftPark(int size) {
		crafts = new Aircraft[size];
		peakOftack = -1;
	}

	public int getNumOfCrafts() {
		return numOfCrafts;
	}

	public void setNumOfCrafts(int numOfCrafts) {
		this.numOfCrafts = numOfCrafts;
	}

	public Aircraft[] getCrafts() {
		return crafts;
	}

	public void setCrafts(Aircraft[] crafts) {
		this.crafts = crafts;
	}

	// check if Park is empty
	public boolean isParkEmpty() {
		return peakOftack == crafts.length - 1;
	}

	// push element to container
	public void addCraftToPark(Aircraft craft) {
		Aircraft[] newCrafts;

		if (isParkEmpty()) {
			newCrafts = new Aircraft[crafts.length * 2];
			System.arraycopy(crafts, 0, newCrafts, 0, crafts.length);
			newCrafts[++peakOftack] = craft;
			numOfCrafts++;
			crafts = newCrafts;
		} else {
			crafts[++peakOftack] = craft;
			numOfCrafts++;
		}

	}

	// Add some aircrafts to park
	public void addCraftsToPark(Aircraft[] newCrafts) {
		Aircraft[] newCraftPark = new Aircraft[crafts.length + newCrafts.length];
		System.arraycopy(crafts, 0, newCraftPark, 0, crafts.length);
		System.arraycopy(newCrafts, 0, newCraftPark, crafts.length, newCrafts.length);
		crafts = newCraftPark;

	}

	// find Aircraft by its Index
	public Aircraft getCraftById(int id) {
		if (crafts[id] != null) {
			return crafts[id];
		} else {
			return null;
		}

	}

	// delete Aircraft from park by its index
	public Aircraft deleteCraftById(int id) {

		if (!isParkEmpty() || id <= peakOftack) {
			Aircraft deletedCraft = crafts[id];
			crafts[id] = null;
			for (int i = id; i <= peakOftack; i++) {
				for (int j = i + 1; i <= peakOftack;) {
					crafts[i] = crafts[j];
					crafts[j] = null;
					break;
				}
			}
			peakOftack--;
			return deletedCraft;
		}
		return null;
	}

	public void deleteAllCraftsFromPark() {
		for (int i = 0; i <= peakOftack; i++) {
			crafts[i] = null;
			numOfCrafts = 0;
		}
	}

	public boolean isCraftInThePark(Aircraft craft) {
		if (!isParkEmpty()) {
			for (int i = 0; i < crafts.length; i++) {
				if (crafts[i].equals(craft)) {
					return true;
				}
			}
		}
		return false;
	}

	// find the Craft with max speed
	public Aircraft findTheFastestCraft() {
		Aircraft theFasterstCraft = crafts[0];
		for (int i = 1; i < numOfCrafts - 1; i++) {
			if (crafts[i].getMaxSpeed() > theFasterstCraft.getMaxSpeed()) {
				theFasterstCraft = crafts[i];
			}
		}
		return theFasterstCraft;
	}

	// delete last element in Stack
	public Aircraft[] deleteLastInAircraft(Aircraft[] crafts) {

		if (!isParkEmpty()) {
			for (int i = peakOftack; i >= 0; i--) {
				if (crafts[i] != null) {
					crafts[i] = null;
					numOfCrafts--;
					peakOftack--;
					break;
				}
			}
		}
		return crafts;
	}

	// delete first element in Queue and shift all elements to the beginning
	public Aircraft[] deleteFirstInAircraft(AircraftPark park) {
		Aircraft[] crafts = park.getCrafts();
		int start = 0;

		if (crafts[start] != null) {
			crafts[start] = null;
			numOfCrafts--;
			peakOftack--;
		}
		if (!isParkEmpty()) {
			for (int i = 0; i <= numOfCrafts; i++) {
				for (int j = i + 1; j <= numOfCrafts;) {
					if (crafts[i] == null) {
						crafts[i] = crafts[j];
						crafts[j] = null;
					}
					break;
				}
			}
		}
		return crafts;
	}

}
