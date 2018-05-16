package task4;

public class PerfectNumber {
	
	public static boolean isNumberPerfect (int number) {
		
		int sum = 0;
		for(int i = 1; i < number; i++) {
			if(number%i == 0) {
				sum +=i;
			}
		}
		return sum == number;
	}
}
