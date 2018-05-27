package util;

import java.util.Comparator;
import by.epam.preTraining.irina.tasks.task7.model.Vehicle;

public class CompareByPrice implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		if (o1 == null && o2 == null) {
			return 0;
		} else if (o1 == null) {
			return 1;
		} else if (o2 == null) {
			return -1;
		} else {
			return (int) (o1.getPrice() - o2.getPrice());
		}
		
	}
}

