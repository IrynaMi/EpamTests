package massives;

public class Reverse {
	
	public static int[] reverseMassiv (int[] arr) {
		
		int [] reversedArray = new int[arr.length];
		for(int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
			reversedArray[j] = arr[i];
		}
		return reversedArray;
	}
}
