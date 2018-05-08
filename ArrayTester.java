package massives;

public class ArrayTester {

	public static void main(String[] args) {
		int size = 5;
		int [] arr = new int[size];
		ArrayInitializer.randomInit(arr, 14, -3);
		System.out.println(IncreasingMassiv.isIncreasing(arr));
		int [] reversedArr = Reverse.reverseMassiv(arr);
		for (int i : reversedArr) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println(Averages.averageArithmetical(arr));
		
		System.out.println("====Personal Task====");
		double [] array = {-2.3, 0, 4.6, -5.5, 10.0, 4.};
		System.out.println(PersonalTaskArrays.findIndexOfMaxElement(array));
		System.out.println(PersonalTaskArrays.multOfNegativeElements(array));
		System.out.println(PersonalTaskArrays.sumOfPositiveElements(array));

	}

}
