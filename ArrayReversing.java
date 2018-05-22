package massives;

public classArrayReversing {
	
	public static void reverseMassiv (int[] arr) {
		int temp = 0;
		for(int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
}
