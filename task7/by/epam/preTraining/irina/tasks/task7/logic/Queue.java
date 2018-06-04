package by.epam.preTraining.irina.tasks.task7.logic;

import by.epam.preTraining.irina.tasks.task7.model.Vehicle;
import by.epam.preTraining.irina.tasks.task7.model.VehiclesPark;

public class Queue {
	int peakOfStack;
	int numOfCrafts;
	Vehicle[] vehicles;
	
	//add vehicle to the end of the queue
		public void enqueue(VehiclesPark park, Vehicle newVehicle) {
			peakOfStack = park.getPeakOfStack();
			numOfCrafts = park.getNumOfCrafts();
			vehicles = park.getVehicles();
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
	
	// delete first element in Queue and shift all elements to the beginning
	public Vehicle dequeue(VehiclesPark park) {
		peakOfStack = park.getPeakOfStack();
		numOfCrafts = park.getNumOfCrafts();
		vehicles = park.getVehicles();
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
	
	// get first element from the queue
	public Vehicle peek(VehiclesPark park) {
		try {
			vehicles = park.getVehicles();
			return vehicles[0];
		} catch (NullPointerException e) {
			System.out.println("Queue is empty!");
			return null;
		}
		
	}
			
	// quantity of elements in queue
	public int getSize(VehiclesPark park) {
		try {
			return (park.getVehicles()).length;
		} catch (NullPointerException e) {
			System.out.println("Queue is empty!");
			return 0;
		}	
	}
	
	// is queue empty
	public boolean isQueueEmpty(VehiclesPark park) {
		return park.getNumOfCrafts() == 0;
	}

	// is queue full
	public boolean isQueueFull(VehiclesPark park) {
		return park.getVehicles().length - 1 == park.getNumOfCrafts();
	}
}
