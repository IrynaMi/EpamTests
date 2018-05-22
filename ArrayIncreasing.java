public class ArrayIncreasing {
	
	static boolean isIncreasing (int[] arr) {
		final int iter = arr.length-1;
		for (int i = 0; i<iter; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			} 
		}
		return true;
	}
}
