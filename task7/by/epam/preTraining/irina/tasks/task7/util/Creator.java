package util;
import by.epam.preTraining.irina.tasks.task7.model.Aircraft;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Creator {
	VehiclesPark park = new VehiclesPark(2);
	
	Aircraft craft1 = new Aircraft(1800, 1100, 230, "Як-130");
	Aircraft craft2 = new Aircraft(2300, 900, 230, "Boenig 777");
	Aircraft craft3 = new Aircraft(1000, 600, 150, "TU-134");
	Aircraft craft4 = new Aircraft(560, 770, 160, "TU-154");
	Aircraft craft5 = new Aircraft(400, 700, 160, "TU-154");
	
	public VehiclesPark createPark() {
		park.addVehicleToPark(craft1);
		park.addVehicleToPark(craft2);
		park.addVehicleToPark(craft3);
		park.addVehicleToPark(craft4);
		park.addVehicleToPark(craft5);
		return park;
	}
	
	
	

}
