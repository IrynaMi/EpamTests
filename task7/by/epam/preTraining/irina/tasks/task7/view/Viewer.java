package by.epam.preTraining.irina.tasks.task7.view;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Viewer {
	
	public static void showAllCrafts(VehiclesPark park) {
		System.out.println(park);
	}
	
	public static void showCraft (Vehicle vehicle) {
		System.out.println(vehicle);
	}
	
	public static void showNumOfVehicles(VehiclesPark park) {
		System.out.println("Total amount of vehicles: " + park.getNumOfCrafts() + "\n");
	}
}
