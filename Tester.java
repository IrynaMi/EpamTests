package task6;

public class Tester {
	public static void main(String[] args) {
		//double [][] array = {{4,3,7}, {8,1,3}};
		double array[][] = new double[5][3];
		ArrayInitializer.randomInit(array, 1, 10);
		
		//find Max Value in array
		System.out.println(MinAndMaxValue.findMaxValue(array));
		
		//find Min Value in array
		System.out.println(MinAndMaxValue.findMinValue(array));
		
		//find Average Arithmetical
		System.out.println(AverageValues.findAverageArithmetical(array));
		
		//find Position Of first Local Minimum
		int []position = LocalMinimum.findPositionOfMinimum(array);
		for (int i = 0; i < position.length; i++) {
				System.out.print(position[i] + " ");
		}
		
		// find transporting array
		double [][] reversedArray = TransposingArray.reverseMassiv(array);
		for (int i = 0; i < reversedArray.length; i++) {
			for (int j = 0; j < reversedArray[i].length; j++) {
				System.out.print(reversedArray[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// test of personal task
		System.out.println(PersonalTask.findQuantityOfLocalMinimums(array));
		double arr[] = PersonalTask.findArrayOfLocalMinimums(array);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n" + PersonalTask.findMinimum(arr));
	}
}
