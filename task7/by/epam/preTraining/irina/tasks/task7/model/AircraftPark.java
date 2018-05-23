package by.epam.preTraining.irina.tasks.task7.model;

public class AircraftPark {
	public int numOfCrafts;
	public Aircraft[] crafts = new Aircraft[1];
	public Aircraft[] newCrafts;
	
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

	public Aircraft[] getNewCrafts() {
		return newCrafts;
	}

	public void setNewCrafts(Aircraft[] newCrafts) {
		this.newCrafts = newCrafts;
	}

	public Aircraft[] addCraftToPark(Aircraft craft){
		
		for (int i = 0; i < crafts.length; i++) {
			if(crafts[i] == null) {
				crafts[i] = craft;
				numOfCrafts++;
				return crafts;
			} 
		}
		
		if (numOfCrafts == crafts.length) {
			newCrafts = new Aircraft[crafts.length*2];
			System.arraycopy(crafts, 0, newCrafts, 0, crafts.length);
			newCrafts[crafts.length] = craft;
			numOfCrafts++;
		}
		return crafts = newCrafts;
	}
	
	public Aircraft[] addCraftsToPark(Aircraft[] newCrafts){
		Aircraft[] newCraftPark = new Aircraft[crafts.length + newCrafts.length];
		System.arraycopy(crafts, 0, newCraftPark, 0, crafts.length);
		System.arraycopy(newCrafts, 0, newCraftPark, crafts.length, newCrafts.length);
		return newCraftPark;
		
	}
	
	public int numberOfAircrafts (Aircraft[] craftPark) {
		for (int i = 0; i < craftPark.length; i++) {
			numOfCrafts++;
		}
		return numOfCrafts;
	}
	
	public boolean isParkEmpty(Aircraft[] craftPark) {
		for (int i = 0; i < craftPark.length; i++) {
			numOfCrafts++;
		}
		return numOfCrafts==0;
	}
	
	public Aircraft getCraftById(Aircraft[] craftPark, int id) {
		return craftPark[id];
	}
	
	public Aircraft deleteCraftById(Aircraft[] craftPark, int id) {
		return craftPark[id] = null;
	}
	
	public Aircraft[] deleteAllCraftsFromPark(Aircraft[] craftPark) {
		for (int i = 0; i < craftPark.length; i++) {
			craftPark[i] = null;
		}
		
		return craftPark;
	}
	
	public Aircraft[] deleteCraftFromPark(Aircraft[] crafts, Aircraft craft){
		for (int i = 0; i < crafts.length; i++) {
			if(crafts[i].equals(craft)) {
				crafts[i] = null;
			}
		}
		
		return crafts;
		
	}
	
	
	
	public Aircraft findTheFastestCraft (Aircraft[] allCrafts) {
		Aircraft theFasterstCraft = allCrafts[0];
		for (int i = 1; i < allCrafts.length; i++) {
			if (allCrafts[i].getMaxSpeed() > theFasterstCraft.getMaxSpeed()) {
				theFasterstCraft = allCrafts[i];
			}
		}
		return theFasterstCraft;
		
	}
}
