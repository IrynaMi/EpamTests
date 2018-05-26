package by.epam.preTraining.irina.tasks.task7.view;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;
import by.epam.preTraining.irina.tasks.task7.model.AircraftPark;

public class Viewer {
	
	public static void showAllCrafts(AircraftPark park) {
		Aircraft [] allCrafts = park.getCrafts();
		if(park.getNumOfCrafts() !=0) {
		for (int i = 0; i < allCrafts.length; i++) {
			if (allCrafts[i] != null) {
				System.out.println("Model: " + allCrafts[i].getModel() + " || Price: " + allCrafts[i].getPrice()
						+ " || Max Speed: " + allCrafts[i].getMaxSpeed());
			}
		}
		} else {
			System.out.println("Park is empty!");
		}
	}

	
	public static void showCraft (Aircraft craft) {
		if(craft != null) {
			System.out.println("Model: " + craft.getModel() + " || Price: " + craft.getPrice() + " || Max Speed: " + 
					craft.getMaxSpeed() + " || Number of passengers: " + craft.getNumberOfPassangers());
		} else {
			System.out.println("Aircraft noot found!");
		}
		 
	}
	
	

}
