package massives;

public class FirstLocalMinimum {
	
	public static int findPositionOfMinimum (int[] arr) {
		int position = -1;
		for(int i = 1; i<arr.length-1; i++) {
			if(arr[i]<arr[i-1] & arr[i]<arr[i+1]) {
				position = i;
			}
		}
		
		return position;
	}
}
