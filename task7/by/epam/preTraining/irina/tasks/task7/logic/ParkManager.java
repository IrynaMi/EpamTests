package by.epam.preTraining.irina.tasks.task7.logic;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class ParkManager {

	private String managerId;
	public VehiclesPark park;
	Stack stack = new Stack();

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
	public Vehicle deleteLastInStack(VehiclesPark park) {
		
		Vehicle deletedVehicle = stack.pop(park);
		return deletedVehicle;
	}
	
	// get last element in Stack
	public Vehicle getPeekOfStack(VehiclesPark park) {
		Vehicle peekVehucle = stack.peek(park);
		return peekVehucle;
	}
	
	// get size of stack
	public int getSizeOfStack(VehiclesPark park) {
		return stack.getSize(park);
		
	}
	
	// is Stack empty
	public boolean isStackEmpty(VehiclesPark park) {
		return stack.isStackEmpty(park);
	}
	
	// is Stack full
	public boolean isStackFull(VehiclesPark park) {
		return stack.isStackFull(park);
	}

	// delete first element from Park
	public Vehicle deleteFirstInVehicle(VehiclesPark park) {
		Queue queue = new Queue();
		Vehicle deletedVehicle = queue.deleteFirstInVehicle(park);
		return deletedVehicle;
	}

}
