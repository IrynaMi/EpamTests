package task6;

public class MinAndMaxValue {
	public static double findMinValue (double [][] arr) {
		double min = arr [0][0];
		for(int i = 1; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		return min;
	}
	
	public static double findMaxValue (double [][] arr) {
		double max = arr [0][0];
		for(int i = 1; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

}
