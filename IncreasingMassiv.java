package massives;

public class IncreasingMassiv {
	
	static boolean isIncreasing (int[] arr) {
	
		for (int i = 0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				continue;
			} 
			return false;
		}
		return true;
	}
}
