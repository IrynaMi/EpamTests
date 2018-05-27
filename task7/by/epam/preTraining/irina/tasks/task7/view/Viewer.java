package by.epam.preTraining.irina.tasks.task7.view;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;
import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Viewer {
	
	public static void showAllCrafts(VehiclesPark park) {
		Vehicle [] allCrafts = park.getVehicles();
		if(park.getNumOfCrafts() !=0) {
		for (int i = 0; i < allCrafts.length; i++) {
			if (allCrafts[i] != null) {
				System.out.println("Model: " + ((Aircraft) allCrafts[i]).getModel() + " || Price: " + allCrafts[i].getPrice()
						+ " || Max Speed: " + allCrafts[i].getMaxSpeed());
			}
		}
		} else {
			System.out.println("Park is empty!");
		}
	}

	
	public static void showCraft (Vehicle vehicle) {
		if(vehicle != null) {
			System.out.println("Model: " + ((Aircraft) vehicle).getModel() + " || Price: " + vehicle.getPrice() + " || Max Speed: " + 
					vehicle.getMaxSpeed() + " || Number of passengers: " + vehicle.getNumberOfPassangers());
		} else {
			System.out.println("Aircraft not found!");
		}
	}

}
