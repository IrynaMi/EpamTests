package task6;

public class MinAndMaxValue {
	public static int [] findMinValue (double [][] arr) {
		int [] minIndex  = {-1, -1};
		if (arr.length > 0 && arr[0].length > 0) {
			double min = arr [0][0];
			minIndex[0] = 0;
			minIndex[1] = 0;
			for(int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] < min) {
						min = arr[i][j];
						minIndex[0] = i;
						minIndex[1] = j;
					}
				}
			}
		}
		return minIndex;
	}
	
	
	
	public static int [] findMaxValue (double [][] arr) {
		int [] maxIndex  = {-1, -1};
		if (arr.length > 0 && arr[0].length > 0) {
			double max = arr [0][0];
			maxIndex[0] = 0;
			maxIndex[1] = 0;
			for(int i = 0; i <arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if(arr[i][j] > max) {
						max = arr[i][j];
						maxIndex[0] = i;
						maxIndex[1] = j;
					}
				}
			}
		}
		return maxIndex;
	}

}

