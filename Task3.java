

import java.util.Random;

public class Task3 {
	
	public static void main(String[] args) {
		Task3.isTriangle(4, 1, 4, 2, 5, 3);
		Task3.calcHeads(100);
		Task3.calcEyes(100);
		Task3.isVowel1('f');
		Task3.isVowel2('a');
		Task3.isVowel5('e');
		Task3.moodSensor();
		Task3.fintTheNextDate(30, 07, 1996);
	}
	
	static void print (Object msg) {
		System.out.println(msg);
	}
	
	static void isTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
		boolean isTriangle = false;
		boolean isRectangular = false;
		if ((x1!=x2) | (x2 !=x3) | (x1!=x3)) {
			if ((y1 != y2) | (y2 != y3) | (y1!=y3)) {
				isTriangle = true;
				double a = 0;
				double b = 0;
				double c = 0;
				a = Math.sqrt((x2 - x1) * (x2 - x1) - (y2 - y1) * (y2 - y1));
				b = Math.sqrt((x3 - x1) * (x3 - x1) - (y3 - y1) * (y3 - y1));
				c = Math.sqrt((x3 - x2) * (x3 - x2) - (y3 - y2) * (y3 - y2));
				if((a*a == b*b + c*c) | (b*b == a*a + c*c) | (c*c == a*a + b*b)) {
					isRectangular = true;
				} 
			} 
		} 
		Task3.print("IsTriangle? - " + isTriangle);
		Task3.print("IsRectangular? - " + isRectangular);
	}
	
	static int calcHeads (int age) {
		int heads = 3;
		final int YOUNG_AGE = 200;
		final int OLD_AGE = 300;
		
		if(age < YOUNG_AGE) {
			heads =age*3;
		}else if(age<OLD_AGE) {
			heads = 3 * YOUNG_AGE + 2 * (age - YOUNG_AGE);
		}else {
			heads = 3 * YOUNG_AGE + 2 *
					(OLD_AGE - YOUNG_AGE) + 
					(age - OLD_AGE);
		}
		return heads;
		
	}
	
	static int calcEyes (int age) {
		int eyes = 6;
		final int YOUNG_AGE = 200;
		final int OLD_AGE = 300;
		
		if(age <200) {
			eyes = age*6;
		}else if(age<300) {
			eyes = 6 * YOUNG_AGE + 4 * (age - YOUNG_AGE);
		}else {
			eyes = 6 * YOUNG_AGE + 4 *
					(OLD_AGE - YOUNG_AGE) + 
					2*(age - OLD_AGE);
		}
		return eyes;
	}

	
	
	
	static boolean isVowel1 (char ch) {
		boolean result = false;
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			result = true;
			break;
		}
		return result;
	}
	
	static boolean isVowel2 (char ch) {
		boolean result = false;
		while ((ch=='a')||(ch =='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
			result=true;
			break;
		}
		return result;
	}
	
	static boolean isVowel3 (char ch) {
		boolean result = false;
		if((ch=='a')||(ch!='e')||(ch!='i')||(ch!='o')||(ch!='u')) {
			result = true;
		}
		Task3.print(result);
		return result;
	}
	
	static boolean isVowel4 (char ch) {
		boolean result = false;
		String s = (ch +"").toLowerCase();
		if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u")) {
			result = true;
		}
		return result;
	}
	
	static boolean isVowel5 (char ch) {
		boolean result = false;
		String s = (ch +"").toLowerCase();
		if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")) {
			result = true;
		}
		return result;
	}
	
	
	
	static String moodSensor() {
		String mood = ":(";
		int QUANTITY_OF_MOODS = 4;
		
		Random rand = new Random();
		int randomNum = rand.nextInt(QUANTITY_OF_MOODS);
		
		switch (randomNum) {
			case 0:
				mood = ":)";
				break;
			case 1:
				mood = ":|";
				break;
			case 2:
				mood = ";)";
				break;
		}
		
		Task3.print(mood);
		return mood;
	}
	
	static String fintTheNextDate(int day, int month, int year) {
		int newDay = day + 1;
		final int LAST_DAY30 = 30;
		final int LAST_DAY28 = 28;
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if(day==LAST_DAY30) {
				newDay = 1;
				month +=1;
			}
			
		}else if (month == 2) {
			if(year%4==0) {
				if(year%100 == 0) {
					if (year%400 == 0 ) {
						if(day > LAST_DAY28) {
							newDay = 1;
							month +=1;
						}
					} else {
						if (day == LAST_DAY28) { 
							newDay = 1;
							month +=1;
						}
					}
				} else {
					if (day > LAST_DAY28) { 
						newDay = 1;
						month +=1;
					}
				}
			}else {
				if(day == LAST_DAY28) {
					newDay=1;
					month +=1;
				}
			}
			
			
		}else if (month == 12) {
			if(day > LAST_DAY30) {
				newDay = 1;
				month = 1; 
				year += 1;
			} 
		} else {
			if (day > LAST_DAY30) {
				newDay = 1;
				month +=1;
				
			}
			
		}
		String s = newDay + "." + month + "." + year;
		Task3.print(s);
		return s;
	}
	
	
}
