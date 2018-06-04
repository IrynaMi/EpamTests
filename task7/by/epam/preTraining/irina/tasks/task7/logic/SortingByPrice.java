package by.epam.preTraining.irina.tasks.task7.logic;

import java.util.Arrays;

import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;
import util.CompareByPrice;

public class SortingByPrice {
	
	//sorted with Comparator
	public void sortByPrice(VehiclesPark park) {
		Arrays.sort(park.getVehicles(), new CompareByPrice());
	}
}
