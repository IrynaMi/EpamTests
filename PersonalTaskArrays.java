package massives;

public class PersonalTaskArrays {
	
	public static int findIndexOfMaxElement (double [] array) {
		double maxElement = array[0];
		int indexOfMaximum = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i] > maxElement) {
				maxElement = array[i];
				indexOfMaximum = i;
			}
		}
		return indexOfMaximum;
	}
	
	public static double multOfNegativeElements (double [] array) {
		double multOfNegative = 1;
		for (int i = 0; i < PersonalTaskArrays.findIndexOfMaxElement(array); i++) {
			if(array[i] < 0) {
				multOfNegative *=array[i];
			}
		}
		return multOfNegative;
	}
	
	public static double sumOfPositiveElements (double [] array) {
		double sumOfPositive = 0;
		for (int i = 0; i < PersonalTaskArrays.findIndexOfMaxElement(array); i++) {
			if(array[i] > 0) {
				sumOfPositive +=array[i];
			}
		}
		return sumOfPositive;
	}

}
