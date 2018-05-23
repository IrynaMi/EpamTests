package util;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;
import by.epam.preTraining.irina.tasks.task7.model.AircraftPark;
import by.epam.preTraining.irina.tasks.task7.view.Viewer;

public class Creator {
	AircraftPark park1 = new AircraftPark();
	
	Aircraft craft1 = new Aircraft(12345, 1100, 230, "Boenig 737");
	Aircraft craft2 = new Aircraft(12345, 900, 230, "Boenig 777");
	Aircraft craft3 = new Aircraft(120_456_990, 600, 150, "TU-134");
	Aircraft craft4 = new Aircraft(30_543_345, 770, 160, "TU-154");
	Aircraft craft5 = new Aircraft(43543, 700, 160, "TU-154");
	
	public AircraftPark createPark() {
		park1.addCraftToPark(craft5);
		park1.addCraftToPark(craft4);
		park1.addCraftToPark(craft1);
		park1.addCraftToPark(craft3);
		park1.addCraftToPark(craft2);
		return park1;
	}
	
	

}
