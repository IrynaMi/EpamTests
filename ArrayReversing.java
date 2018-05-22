package massives;

public classArrayReversing {
	
	public static void reverse (int[] arr) {
		int temp = 0;
		int iterJ = arr.length-1;
		int interI = arr.length/2;
		for(int i = 0, j = iterJ; i < interI; i++, j--) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
}
