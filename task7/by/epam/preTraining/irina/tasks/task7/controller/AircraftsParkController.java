package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;
import by.epam.preTraining.irina.tasks.task7.view.Viewer;
import util.Creator;

public class AircraftsParkController {

	public static void main(String[] args) {
		Creator creator = new Creator();
		VehiclesPark park = creator.createPark();
		Viewer.showAllCrafts(park);
		System.out.println(park.getNumOfCrafts());
		System.out.println("After taken last craft: ");
		park.deleteLastInVehicle(park.getCrafts());
		Viewer.showAllCrafts(park);
		System.out.println(park.getNumOfCrafts());
		System.out.println("After taken first craft: ");
		park.deleteFirstInVehicle(park);
		Viewer.showAllCrafts(park);
		System.out.println("The fastest craft in the park: ");
		Viewer.showCraft(park.findTheFastestCraft());
		
		System.out.println("The folowing craft was deleted: ");
		Viewer.showCraft(park.deleteCraftById(1));
		
		System.out.println("Find Aircraft by ID: ");
		Viewer.showCraft(park.getCraftById(1));
		
		System.out.println("======");
		park.deleteAllCraftsFromPark();
		Viewer.showAllCrafts(park);
	}

}
