package massives;

import java.util.Random;

public class ArrayInitializer {
	
	public static void randomInit(int [] array, int max, int min) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(max - min + 1) + min;
		}
	}

}
