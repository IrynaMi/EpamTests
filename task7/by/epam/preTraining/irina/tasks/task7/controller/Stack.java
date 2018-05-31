package by.epam.preTraining.irina.tasks.task7.controller;


import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Stack {
	
	// delete last element in Stack
		public Vehicle deleteLastInVehicle(VehiclesPark park) {
			int peakOfStack = park.getPeakOfStack();
			int numOfCrafts = park.getNumOfCrafts();
			Vehicle[] vehicles = park.getVehicles();
			Vehicle deletedVehicle = null;
			if (!park.isParkEmpty()) {
				for (int i = peakOfStack; i >= 0; i--) {
					if (vehicles[i] != null) {
						deletedVehicle = vehicles[i];
						vehicles[i] = null;
						park.setNumOfCrafts(--numOfCrafts);
						park.setPeakOfStack(--peakOfStack);
						break;
					}
				}
			}
			return deletedVehicle;
		}

		

}
