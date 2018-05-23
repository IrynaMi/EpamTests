package by.epam.preTraining.irina.tasks.task7.view;

import by.epam.preTraining.irina.tasks.task7.model.Aircraft;

public class Viewer {
public static void showAllCrafts (Aircraft[] allCrafts) {
		
		for (int i = 0; i < allCrafts.length; i++) {
			if(allCrafts[i]!= null) {
      
				System.out.println("Model: " + allCrafts[i].getModel() + " || Price: " + allCrafts[i].getPrice() + " || Max Speed: " 
			+ allCrafts[i].getMaxSpeed());
      
			} 
		}
	}

}
