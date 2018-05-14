package task6;

public class TransposingArray {
	
	

	public static double[][] reverseMassiv (double[][] arr) {
		
		double[][] revArr = new double[arr[0].length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				revArr[j][i] = arr[i][j];
			}
		}	
		return revArr;
	}
}
