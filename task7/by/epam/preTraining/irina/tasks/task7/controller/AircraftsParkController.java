package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;
import by.epam.preTraining.irina.tasks.task7.model.AircraftPark;

public class AircraftsParkController {

	public static void main(String[] args) {
		
		Creator creator = new Creator();
		AircraftPark park = creator.createPark();
		Viewer.showAllCrafts(park);
		System.out.println(park.numOfCrafts);
	}

}

