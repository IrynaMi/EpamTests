package task4;

public class NaturalNumber {
	
	static final int DIGIT = 10;
	
	static int findMaxDigit(int number) {
		int maxInt = number%DIGIT;
		
		while(number > 0) {
			
			if(number%DIGIT > maxInt) {
				maxInt = number%DIGIT;
			}
			number /= DIGIT;
		}
		return maxInt;
	}
	
	
	
	static boolean isPalindrome(int number){
		int next = 0;
		int palindrom = number;
		while (palindrom != 0){
			next = (next * DIGIT) + (palindrom % DIGIT);
			palindrom /= DIGIT;
		}
		return number == next;
	}
	
	
	
	
	static boolean isNumberSimple (int number) {
		int iterator = Math.sqrt(number);
		for (int i = 3; i<=iterator; i++) {
			if (number % 2 == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
	static StringBuilder findSimpleDividersOfNumber  (int number) {
		StringBuilder result = new StringBuilder();
		for (int i = 1; i<=number; i++) {
			if (number%i==0) {
				int counter = 0;
				int j;
				for(j=1; j<=i; j++) {
					if(i%j==0) {
						counter++;
					}
				}
				if (counter == 2) {
					result.append((j-1)+" ");
				}
			}
		}
		return result;
	}
	
	static int findNumOfUniqueDigits(int number) {
        int digits = 0;
        int count = 0;
        for (int digit = number % DIGIT; number != DIGIT; number /= DIGIT, digit = number % DIGIT) {
            int digitBit = 1 << digit;
            if ((digits & digitBit) == 0) {
                digits |= digitBit;
                count++;
            } 
        }
        return count;
    }

	
	
	
	public static int findNod(int a, int b) {
		int t;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	public static int findNok(int a, int b) {
		int nod = NaturalNumbers.findNok(a,b);
		return a*b / nod;
	}

}
