

public class FirstLocalMinimum {
	
	public static int findPositionOfMinimum (int[] arr) {
		int position = -1;
		final int iter = arr.length-1;
		if(arr.length > 2) {
			for(int i = 1; i<iter; i++) {
				if(arr[i]<arr[i-1] && arr[i]<arr[i+1]) {
					position = i;
				}
			}
		}
		return position;
	}
}
