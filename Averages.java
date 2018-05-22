package massives;

public class Averages {
	
	public static double averageArithmetical (int [] arr) {
		
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
	
	static double averageGeomethrical (int[] arr) {
		int mult = 1;
		for(int i = 0; i < arr.length; i++) {
			mult *= arr[i];
		}
		return Math.pow(mult, 1/arr.length);
	}
}
