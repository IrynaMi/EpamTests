package massives;

public class MinAndMax {
	
	public static int findMin (int [] arr) {
		int minIndex = -1;
		if (arr.length > 0) {
			int min = arr [0];
			minIndex = 0;
			for(int i = 1; i < arr.length; i++) {
				if(arr[i] < min) {
					min = arr[i];
					minIndex = i;
				}
			}
		}
		return minIndex;
	}
	
	
	public static int findMax (int [] arr) {
		int maxIndex = -1; 
		if (arr.length > 0) {
			int max = arr [0];
			maxIndex = 0;
			for(int i = 1; i <arr.length; i++) {
				if(arr[i] > max) {
					max = arr[i];
					maxIndex = i;
				}
			}
		}
		return maxIndex;
	}
}
