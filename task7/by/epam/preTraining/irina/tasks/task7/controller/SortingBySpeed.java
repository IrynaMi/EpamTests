package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class SortingBySpeed {
	// sort by Max Speed
		public void sortByMaxSpeed (VehiclesPark park) {
			Vehicle[] vehicles = park.getVehicles();
			int numOfCrafts = park.getNumOfCrafts();
			if (!park.isParkEmpty()) {
				for (int i = 0; i < numOfCrafts; i++) {
					double minSpeed = vehicles[i].getMaxSpeed();

					for (int j = i + 1; j < numOfCrafts; j++) {
						if (vehicles[j].getMaxSpeed() < minSpeed) {
							Vehicle temp = vehicles[i];
							vehicles[i] = vehicles[j];
							vehicles[j] = temp;
						}

					}
				}
			}
		}

}
