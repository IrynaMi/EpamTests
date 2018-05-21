package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;
import by.epam.preTraining.irina.tasks.task7.model.AircraftPark;

public class AircraftsParkController {

	public static void main(String[] args) {
		
		AircraftPark park1 = new AircraftPark();
		
		Aircraft craft1 = new Aircraft(12345, 1800, 230, "Boenig 737");
		Aircraft[] allCrafts = park1.addCraftToPark(craft1);
		
		Aircraft craft2 = new Aircraft(12345, 900, 230, "Boenig 777");
		allCrafts = park1.addCraftToPark(craft2);
	
		park1.showAllCrafts(allCrafts);
		System.out.println(park1.numOfCrafts);
		
		
		Aircraft[] newCr = park1.addCraftsToPark(allCrafts);
		System.out.println(newCr.length);
	}

}

