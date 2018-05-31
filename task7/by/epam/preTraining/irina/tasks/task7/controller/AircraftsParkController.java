package by.epam.preTraining.irina.tasks.task7.controller;

import java.util.Arrays;

import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;
import by.epam.preTraining.irina.tasks.task7.view.Viewer;
import util.Creator;
import util.CompareByPrice;

public class AircraftsParkController {

	public static void main(String[] args) {
		Creator creator = new Creator();
		VehiclesPark park = creator.createPark();
		ParkManager manager = new ParkManager("1", park);
		Viewer.showAllCrafts(park);
		Viewer.showNumOfVehicles(park);
		
		System.out.println("=========");
		System.out.println("Sorted by Price: ");
		VehiclesPark temporaryPark = new VehiclesPark(park);
		Arrays.sort(temporaryPark.getVehicles(), new CompareByPrice());
		Viewer.showAllCrafts(temporaryPark);
		
		System.out.println("=========");
		System.out.println("Sorted by Speed: ");
		manager.sortParkBySpeed(park);
		Viewer.showAllCrafts(park);
		
		System.out.println("=========");
		System.out.println("After taken last craft: ");
		manager.deleteLastInVehicle(park);
		Viewer.showAllCrafts(park);
		Viewer.showNumOfVehicles(park);
		
		System.out.println("=========");
		System.out.println("After taken first craft: ");
		manager.deleteFirstInVehicle(park);
		Viewer.showAllCrafts(park);
		Viewer.showNumOfVehicles(park);
		
		System.out.println("=========");
		System.out.println("The fastest craft in the park: ");
		Viewer.showCraft(manager.findTheFastestCraft(park));
		
		System.out.println("=========");
		System.out.println("The folowing craft was deleted: ");
		Viewer.showCraft(park.deleteVehicleById(1));
		
		System.out.println("=========");
		System.out.println("Find Aircraft by ID: ");
		Viewer.showCraft(park.getVehicleById(1));
		
		System.out.println("======");
		park.deleteAllVehiclesFromPark(park);
		Viewer.showAllCrafts(park);
	}

}
