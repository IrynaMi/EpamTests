 package by.epam.preTraining.irina.tasks.task7.logic;


import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Stack {
	int peakOfStack;
	int numOfCrafts;
	Vehicle[] vehicles;
	
	//add vehicle to the end of the stack
	public void push(VehiclesPark park, Vehicle newVehicle) {
		Vehicle[] newVehicles;

		if (!park.isParkEmpty()) {
			newVehicles = new Vehicle[vehicles.length * 2];
			System.arraycopy(vehicles, 0, newVehicles, 0, vehicles.length);
			newVehicles[++peakOfStack] = newVehicle;
			numOfCrafts++;
			vehicles = newVehicles;
		} else {
			vehicles[++peakOfStack] = newVehicle;
			numOfCrafts++;
		}

	}
	
	// delete last element in Stack
		public Vehicle pop(VehiclesPark park) {
			peakOfStack = park.getPeakOfStack();
			numOfCrafts = park.getNumOfCrafts();
			vehicles = park.getVehicles();
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
		
		// get element from the top of the stack
		public Vehicle peek(VehiclesPark park) {
			try {
				peakOfStack = park.getPeakOfStack();
				vehicles = park.getVehicles();
				return vehicles[peakOfStack];
			} catch (NullPointerException e) {
				System.out.println("Queue is empty!");
				return null;
			}
		}

		// quantity of elements in stack
		public int getSize(VehiclesPark park) {
			try {
				return park.getVehicles().length;
			} catch (NullPointerException e) {
				System.out.println("Queue is empty!");
				return 0;
			}
		}
		
		// is stack empty
		public boolean isStackEmpty(VehiclesPark park) {
			return park.getNumOfCrafts()==0;
		}
		
		// is stack full
		public boolean isStackFull(VehiclesPark park) {
			return park.getVehicles().length-1 == park.getNumOfCrafts();
		}

}
