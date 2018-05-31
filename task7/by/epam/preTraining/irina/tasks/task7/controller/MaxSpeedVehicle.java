package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class MaxSpeedVehicle {
	
	// find the Craft with max speed
	public Vehicle findTheFastestCraft(VehiclesPark park) {
		Vehicle[] vehicles = park.getVehicles();
		Vehicle theFasterstVehicle = null;
		int numOfCrafts = park.getNumOfCrafts();
		if (!park.isParkEmpty()) {
			theFasterstVehicle = vehicles[0];
			for (int i = 1; i < numOfCrafts; i++) {
				if (vehicles[i].getMaxSpeed() > theFasterstVehicle.getMaxSpeed()) {
					theFasterstVehicle = vehicles[i];
				}
			}
			return theFasterstVehicle;
		}
		return null;
	}
}
