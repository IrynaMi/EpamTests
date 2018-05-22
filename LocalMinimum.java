package task6;

public class LocalMinimum {
	public static int[] findPositionOfLocalMinimum (double[][] arr) {
		int []position = {-1, -1};
		if (arr.length > 0 && arr[0].length > 2) {
			for(int i = 0; i < arr.length; i++) {
				int iter = arr[i].length-1;
				for (int j = 1; j < iter; j++) {
					if(arr[i][j] < arr[i][j-1] && arr[i][j] < arr[i][j+1]) {
						position[0] = i;
						position[1] = j;
					}
				}
			}
		}
		return position;
	}
}
