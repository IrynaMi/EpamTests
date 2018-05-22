package task6;

public class AverageValues {
public static double findAverageArithmetical (double [][] arr) {
		
		double sum = 0;
		int quantityOfElements = 0;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				quantityOfElements++;
			}
		}
		return sum / quantityOfElements;
	}
	
	static double findAverageGeomethrical (double[][] arr) {
		double mult = 1;
		int quantityOfElements = 0;
		for(int i = 0; i < arr[i].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				mult *= arr[i][j];
				quantityOfElements++;
			}
		}
		return Math.pow(mult, 1/quantityOfElements);
	}
}
