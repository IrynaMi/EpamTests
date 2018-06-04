package by.epam.preTraining.irina.tasks.task7.logic;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Queue {
	
	// delete first element in Queue and shift all elements to the beginning
	public Vehicle deleteFirstInVehicle(VehiclesPark park) {
		int peakOfStack = park.getPeakOfStack();
		int numOfCrafts = park.getNumOfCrafts();
		Vehicle[] vehicles = park.getVehicles();
		Vehicle deletedVehicle = null;
		int start = 0;
		if (vehicles[start] != null) {
			deletedVehicle = vehicles[start]; 
			vehicles[start] = null;
			park.setNumOfCrafts(--numOfCrafts);
			park.setPeakOfStack(--peakOfStack);
		}
		if (!park.isParkEmpty()) {
			for (int i = 0; i <= numOfCrafts; i++) {
				for (int j = i + 1; j <= numOfCrafts;) {
					if (vehicles[i] == null) {
						vehicles[i] = vehicles[j];
						vehicles[j] = null;
					}
					break;
				}
			}
		}
		return deletedVehicle;

	}
}
