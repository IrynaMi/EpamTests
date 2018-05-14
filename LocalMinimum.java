package task6;

public class LocalMinimum {
	public static int[] findPositionOfMinimum (double[][] arr) {
		int []position = {-1, -1};
		for(int i = 0; i<arr.length; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				if(arr[i][j] < arr[i][j-1] & arr[i][j] < arr[i][j+1]) {
					position[0] = i;
					position[1] = j;
				}
			}
		}
		return position;
	}
}
