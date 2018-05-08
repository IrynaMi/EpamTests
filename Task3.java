package javaCoreTests;



import java.util.Random;

import javax.naming.NamingEnumeration;

public class Task3 {
	
	public static void main(String[] args) {
		Task3.isTriangle(4, 1, 4, 2, 5, 3);
		Task3.calcHeads(100);
		Task3.calcEyes(100);
		Task3.isVowel1('f');
		System.out.println(Task3.moodSensor());
		Task3.fintTheNextDate(30, 07, 1996);
	}
	
	
	
	public static boolean isTriangle(double x1, double x2, double x3, double y1, double y2, double y3) {
		
		if ((x1!=x2) | (x2 !=x3) | (x1!=x3)) {
			if ((y1 != y2) | (y2 != y3) | (y1!=y3)) {
				return true;
			} 
		}
		return false; 
		
	}
	
	public static boolean isRectangular(double x1, double x2, double x3, double y1, double y2, double y3) {
		if(Task3.isRectangular(x1, x2, x3, y1, y2, y3)) {
			
			double a = Math.sqrt((x2 - x1) * (x2 - x1) - (y2 - y1) * (y2 - y1));
			double b = Math.sqrt((x3 - x1) * (x3 - x1) - (y3 - y1) * (y3 - y1));
			double c = Math.sqrt((x3 - x2) * (x3 - x2) - (y3 - y2) * (y3 - y2));
			
			if((a*a == b*b + c*c) | (b*b == a*a + c*c) | (c*c == a*a + b*b)) {
				 return true;
			} 
		}
		return false;
	}
	
	final static int YOUNG_AGE = 200;
	final static int OLD_AGE = 300;
	final static int HEADS_IN_YOUNG_AGE = 3;
	final static int HEADS_IN_OLD_AGE = 2;
	final static int EYES = 2;
	
	public static int calcHeads (int age) {
		int heads = 3;
		if(age < YOUNG_AGE) {
			heads =age*HEADS_IN_YOUNG_AGE;
		}else if(age<OLD_AGE) {
			heads = HEADS_IN_YOUNG_AGE * YOUNG_AGE + HEADS_IN_OLD_AGE * age - HEADS_IN_OLD_AGE *YOUNG_AGE;
		}else {
			heads = HEADS_IN_YOUNG_AGE * YOUNG_AGE + HEADS_IN_OLD_AGE * OLD_AGE
					- HEADS_IN_OLD_AGE * YOUNG_AGE + 
					age - OLD_AGE;
		}
		return heads;
	}
	
	public static int calcEyes (int age) {
		return Task3.calcHeads(age)*EYES;
	}

	
	
	
	public static boolean isVowel1 (char ch) {
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			return true;
		}
		return false;
	}
	
	public static boolean isVowel2 (char ch) {
		return (ch=='a')||(ch!='e')||(ch!='i')||(ch!='o')||(ch!='u');
	}
	
	public static boolean isVowel3 (char ch) {
		ch = Character.toLowerCase(ch);
		return "aoeiy".contains(ch+"");
	}
	
	
	
	final static int QUANTITY_OF_MOODS = 4;
	final static String UPSET = ":(";
	final static String HAPPY = ":)";
	final static String WINK = ";)";
	final static String NEUTRAL = ":|";
	
	public static String moodSensor() {
		Random rand = new Random();
		int randomNum = rand.nextInt(QUANTITY_OF_MOODS);
		switch (randomNum) {
			case 0:
				return UPSET;
			case 1:
				return HAPPY;
			case 2:
				return WINK;
		}
		return NEUTRAL;
	}
	
	
	final static int LAST_DAY30 = 30;
	final static int LAST_DAY28 = 28;
	
	public static String fintTheNextDate(int day, int month, int year) {
		int newDay = day + 1;
		
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
		return s;
	}
	
	
}

