package task6;

import java.util.Random;

public class ArrayInitializer {
	public static void randomInit(double [][] array, double min, double max) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = min + (max - min) * rand.nextDouble();
			}
			
		}
	}
}
