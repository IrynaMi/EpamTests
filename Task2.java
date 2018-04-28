

public class Task2 {
	public static void main(String[] args) {
		Task2.weightToTons(234);
		Task2.weightToGramm(234);
		Task2.weightToMg(234);
		Task2.ringSquare(40, 32);
		Task2.changeVar(24, 18);
		Task2.isNumberAscending(3471);
		Task2.multiplicationOfNum(12321);
		Task2.averageGeometical(123456);
		Task2.reverseNumber(1234567);
	}
	
	static int weightToTons(int mKg) {
		int mT = mKg / 1000;
		System.out.println(mKg + " Kgs = " + mT + " Tonns");
		return mT;
	}
	
	static int weightToGramm(int mKg) {
		int mGr = mKg * 1000;
		System.out.println(mKg + " Kgs = " + mGr + " Gramms");
		return mGr;
	}
	
	static int weightToMg(int mKg) {
		int mGr = mKg * 1000000;
		System.out.println(mKg + " Kgs = " + mGr + " MilliGramms");
		return mGr;
	}
	
	static double ringSquare (double r1, double r2) {
		double s = Math.PI*r1*r1 + Math.PI*r2*r2;
		System.out.println("S = " + s);
		return s;
	}
	
	static void changeVar (int a, int b) {
		a = a+b;
		b = a - b;
		a = a-b;
		System.out.println("a = " + a + ", b = "+ b);
	}
	
	static void isNumberAscending (int n) {
		boolean result = false;
		int th = n/1000;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		System.out.println(th + " "+ hund+ " "+ doz+ " "+  units);
		if (th < hund) {
			if (hund < doz) {
				if (doz < units){
					result = true;
					System.out.println(result);
				} else {
					System.out.println(result);
				}
			} else {
				System.out.println(result);
			}
		}else {
			System.out.println(result);
		}
	}
	
	static long multiplicationOfNum(int n) {
		int tenTh = n/10000;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		long mult = tenTh*th*hund*doz*units;
		System.out.println("Mult = " + mult);
		return mult;
	}
	
	static long sumOfNum(int n) {
		int tenTh = n/10000;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		long sum = tenTh+th+hund+doz+units;
		System.out.println("Sum = " + sum);
		return sum;
	}
	
	static double averageArifmetical (int n) {
		int hundTh = n/100000;
		int tenTh = (n/10000)%10;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		double ar = (hundTh*tenTh*th*hund*doz*units)/6;
		System.out.println("Average arithmetical of " + n + " = "+ ar);
		return ar;
		
	}
	
	static double averageGeometical (int n) {
		int hundTh = n/100000;
		int tenTh = (n/10000)%10;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		double gm = Math.pow(hundTh*tenTh*th*hund*doz*units, 1/6.);
		System.out.println("Average geometrical of " + n + " = "+ gm);
		return gm;
	}
	
	static int reverseNumber (int n) {
		int thTh = n/1000000;
		int hundTh = (n/100000)%10;
		int tenTh = (n/10000)%10;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		int revNum = units * 1000000 +
				+ doz*100000 +
				+ hund * 10000 + 
				+ th * 1000 + tenTh * 100 +
				+ hundTh * 10 + thTh;
		System.out.println("Reverse of number " + n + " = "+ revNum);
		return revNum;
		
	}

}
