package task6;

public class AverageValues {
public static double findAverageArithmetical (double [][] arr) {
		
		double sum = 0;
		int quantityOfelements = 0;
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				quantityOfelements++;
			}
		}
		return sum / quantityOfelements;
	}
	
	static double findAverageGeomethrical (double[][] arr) {
		double mult = 1;
		int quantityOfelements = 0;
		for(int i = 0; i < arr[i].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				mult *= arr[i][j];
				quantityOfelements++;
			}
		}
		return Math.pow(mult, 1/quantityOfelements);
	}
}
