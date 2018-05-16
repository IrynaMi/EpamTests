package task4;

import java.util.Random;

public class OrelAndReshka {
	
	static int orelAndReshkaCounter (int number) {
		int orelCounter = 0;
		Random random = new Random();
		
		for(int i=0; i<number; i++) {
			
			if (random.nextBoolean()) {
				orelCounter++;
			}
		}
		return orelCounter;
	}
}
