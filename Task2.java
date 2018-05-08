package javaCoreTests;

public class Task2 {
	public static void main(String[] args) {
		Task2.weightToTons(234);
		Task2.weightToGrams(234);
		Task2.weightToMg(234);
		Task2.ringSquare(40, 32);
		Task2.changeVar(24, 18);
		Task2.isNumberAscending(3471);
		Task2.multiplicationOfNum(12321);
		Task2.averageGeometical(123456);
		Task2.reverseNumber(1234567);
	}
	
	final static double KG_TO_TONS = 0.001;
	final static int KG_TO_GRAMS = 1000;
	final static int KG_TO_MGRAMS = 1_000_000;
	
	public static double weightToTons(int mKg) {
		return mKg * KG_TO_TONS;
	}
	
	public static int weightToGrams(int mKg) {
		return mKg * KG_TO_GRAMS;
	}
	
	public static int weightToMg(int mKg) {
		return mKg * KG_TO_MGRAMS;
	}
	
	public static double ringSquare (double r1, double r2) {
		return Math.PI*r1*r1 + Math.PI*r2*r2;
	}
	
	public static void changeVar (int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
	}
	
	public static boolean isNumberAscending (int n) {
		int th = n/1000;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		return (th - hund - doz - units) > 0;
		
	}
	
	public static long multiplicationOfNum(int n) {
		int tenTh = n/10000;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		return tenTh*th*hund*doz*units;
	}
	
	public static long sumOfNum(int n) {
		int tenTh = n/10000;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		return tenTh+th+hund+doz+units;
	}
	
	final static int DIGITS_OF_NUMBER = 6;
	public static double averageArifmetical (int n) {
		int hundTh = n/100000;
		int tenTh = (n/10000)%10;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		return (hundTh*tenTh*th*hund*doz*units)/DIGITS_OF_NUMBER;
		
	}
	
	public static double averageGeometical (int n) {
		int hundTh = n/100000;
		int tenTh = (n/10000)%10;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		return Math.pow(hundTh*tenTh*th*hund*doz*units, 1/DIGITS_OF_NUMBER);
	}
	
	public static int reverseNumber (int n) {
		int thTh = n/1000000;
		int hundTh = (n/100000)%10;
		int tenTh = (n/10000)%10;
		int th = (n/1000)%10;
		int hund = (n/100)%10;
		int doz = (n/10)%10;
		int units = n%10;
		return units * 1000000 +
				+ doz*100000 +
				+ hund * 10000 + 
				+ th * 1000 + tenTh * 100 +
				+ hundTh * 10 + thTh;
		
	}

}
