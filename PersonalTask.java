package task6;

public class PersonalTask {
	
	public static int findQuantityOfLocalMinimums (double[][] arr) {
		
		int quantityOfElements = 0;
		for(int i = 0; i<arr.length; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				if(arr[i][j] < arr[i][j-1] & arr[i][j] < arr[i][j+1]) {
					quantityOfElements++;
				}
			}
		}
		return quantityOfElements;
	}
	
	
	public static double[] findArrayOfLocalMinimums (double[][] arr) {
		double[] arrayOfMinElements = new double[PersonalTask.findQuantityOfLocalMinimums(arr)];
		for(int i = 0, k = 0; i<arr.length; i++, k++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				if(arr[i][j] < arr[i][j-1] & arr[i][j] < arr[i][j+1]) {
					arrayOfMinElements[k] = arr[i][j];
				}
			}
		}
		return arrayOfMinElements;
	}
	
	public static double findMinimum (double []arr) {
		
		double min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
	return min;
		
	}
}
