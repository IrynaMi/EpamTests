package by.epam.preTraining.irina.tasks.task7.controller;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class ParkManager {

	private String managerId;
	public VehiclesPark park;

	public ParkManager(String managerId, VehiclesPark park) {
		this.managerId = managerId;
		this.park = park;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public VehiclesPark getPark() {
		return park;
	}

	public void setPark(VehiclesPark park) {
		this.park = park;
	}
	
	// find the Craft with max speed
	public Vehicle findTheFastestCraft(VehiclesPark park) {
		MaxSpeedVehicle fastestVehicle = new MaxSpeedVehicle();
		Vehicle maxSpeedVehicle = fastestVehicle.findTheFastestCraft(park);
		return maxSpeedVehicle;
	}

	// sort by speed
	public void sortParkBySpeed(VehiclesPark park) {
		SortingBySpeed sort = new SortingBySpeed();
		sort.sortByMaxSpeed(park);
	}
	
	// sort by price
		public void sortParkByPrice(VehiclesPark park) {
			SortingByPrice sort = new SortingByPrice();
			sort.sortByPrice(park);
		}

	// delete last element from Park
	public Vehicle deleteLastInVehicle(VehiclesPark park) {
		Stack stack = new Stack();
		Vehicle deletedVehicle = stack.deleteLastInVehicle(park);
		return deletedVehicle;
	}

	// delete first element from Park
	public Vehicle deleteFirstInVehicle(VehiclesPark park) {
		Queue queue = new Queue();
		Vehicle deletedVehicle = queue.deleteFirstInVehicle(park);
		return deletedVehicle;
	}

}
