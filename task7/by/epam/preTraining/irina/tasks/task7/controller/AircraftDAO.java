package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;

public class AircraftDAO {
	
	public Aircraft[] addCraftToPark(Aircraft craft){
		Aircraft[] crafts = new Aircraft[10];
		int counter = 0;
		for (int i = 0; i < crafts.length; i++) {
			if(crafts[i] == null) {
				crafts[i] = craft;
				return crafts;
			} else {
				counter++;
			}
		}
		Aircraft[] newCrafts = new Aircraft[crafts.length*2];
		if (counter == crafts.length) {
			System.arraycopy(crafts, 0, newCrafts, 0, crafts.length);
			newCrafts[crafts.length] = craft;
		}
		return newCrafts;
	}
}
