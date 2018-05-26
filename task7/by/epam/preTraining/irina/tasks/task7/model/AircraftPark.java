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
	
	//check if Park is empty
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
	

	public Aircraft[] addCraftsToPark(Aircraft[] newCrafts) {
		Aircraft[] newCraftPark = new Aircraft[crafts.length + newCrafts.length];
		System.arraycopy(crafts, 0, newCraftPark, 0, crafts.length);
		System.arraycopy(newCrafts, 0, newCraftPark, crafts.length, newCrafts.length);
		return newCraftPark;

	}
	

	public Aircraft getCraftById(Aircraft[] craftPark, int id) {
		if (!isParkEmpty()) {
			return craftPark[id];
		}
		return null;
	}

	public Aircraft deleteCraftById(Aircraft[] craftPark, int id) {
		if (!isParkEmpty()) {
		craftPark[id] = null;
		}
		return craftPark[id];
	}

	public void deleteAllCraftsFromPark(Aircraft[] craftPark) {
		for (int i = 0; i < craftPark.length; i++) {
			craftPark[i] = null;
		}
	}

	public Aircraft[] deleteCraftFromPark(AircraftPark park, Aircraft craft) {
		Aircraft[] crafts = park.getCrafts();
		
		if (!isParkEmpty()) {
			for (int i = 0; i < crafts.length; i++) {
				if (crafts[i].equals(craft)) {
					crafts[i] = null;
				}
			}
		}
		return crafts;
	}

	public Aircraft findTheFastestCraft(Aircraft[] allCrafts) {
		 
		Aircraft theFasterstCraft = allCrafts[0];
		for (int i = 1; i < allCrafts.length; i++) {
			if (allCrafts[i].getMaxSpeed() > theFasterstCraft.getMaxSpeed()) {
				theFasterstCraft = allCrafts[i];
			}
		}
		return theFasterstCraft;
	}
	
	
	
	//delete last element in Stack
	public Aircraft[] deleteLastInAircraft(Aircraft[] crafts) {
		int topOfStack = crafts.length-1;
		if(!isParkEmpty()) {
			for (int i = topOfStack; i >= 0; i--) {
				if (crafts[i] != null) {
					crafts[i] = null;
					numOfCrafts--;
					break;
				}
			}
		}
		return crafts;
	}
	
	//delete first element in Queue and shift all elements to the beginning
	public Aircraft[] deleteFirstInAircraft(AircraftPark park) {
		Aircraft [] crafts = park.getCrafts();
		int start = 0;
		
		int elementsInQueue = park.getNumOfCrafts();
		
			if(crafts[start] != null) {
				crafts[start] = null;
				elementsInQueue--;
			}
		if(!isParkEmpty()) {	
			for (int i = 0; i <= elementsInQueue; i++) {
				for (int j = i+1; j <= elementsInQueue;) {
					if(crafts[i]==null) {
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
