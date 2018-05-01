public class Task3 {
	
	public static void main(String[] args) {
		Task3.isTriangle(4, 4, 4, 2, 5, 3);
		Task3.calcHeadAndEyes(100);
		Task3.isVowel1('f');
		Task3.isVowel2('a');
		Task3.isVowel3('e');
		Task3.moodSensor();
		Task3.nextDay(30, 01, 1996);
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
				if((a*a == b*b + c*c) | (b*b == a*a + c*c) | (c*c == a*a + b*b)) {
					isRectangular = true;
					Task3.print("IsTriangle? - " + isTriangle);
					Task3.print("IsRectangular? - " + isRectangular);
				} else {
					Task3.print("IsTriangle? - " + isTriangle);
					Task3.print("IsRectangular? - " + isRectangular);
				}
			} else {
				Task3.print("IsTriangle? - " + isTriangle);
			}
		} else {
			Task3.print("IsTriangle? - " + isTriangle);
		}
	}
	
	static void calcHeadAndEyes (int years) {
		int head = 3;
		int eyes = 6;
		int head200 = 0;
		int eyes200 = 0;
		for (int i = 0; i < 200; i++) {
			head200 +=3;
			eyes200 +=6;
		}
		
		int head300 = head200;
		int eyes300 = head200;
		
		for (int j = 200; j < 300; j++) {
			head300 +=2;
			eyes300 +=4;
		}
		Task3.print("Heads in 200 years = " + head200 + ", eyes in 200 years = " + eyes200);
		Task3.print("Heads in 300 years = " + head300 + ", eyes in 300 years = " + eyes300);
		
		if(years < 200) {
			for (int i = 1; i < years; i++) {
				head += 3;
				eyes +=6;
			}
			Task3.print("Heads in " + years + " = " + head + ", eyes in " + years + " = " + eyes);
		}else if(200 <= years & years < 300) {
			for (int i = 200; i < 300; i++) {
				head200 +=2;
				eyes200 +=4;
			}
			Task3.print("Heads in " + years + " = " + head200 + ", eyes in " + years + " = " + eyes200);
		}else {
			for (int i = 200; i < years; i++) {
				head300 +=1;
				eyes300 +=2;
			}
			Task3.print("Heads in " + years + " = " + head300 + ", eyes in " + years + " = " + eyes300);
		}
	}
	
	static void isVowel1 (char ch) {
		boolean result = false;
		switch (ch) {
		case 'a':
			result = true;
			Task3.print("Character " + ch + " is a vowel");
			break;
		case 'e':
			result = true;
			Task3.print("Character " + ch + " is a vowel");
			break;
		case 'i':
			result = true;
			Task3.print("Character " + ch + " is a vowel");
			break;
		case 'o':
			result = true;
			Task3.print("Character " + ch + " is a vowel");
			break;
		case 'u':
			result = true;
			Task3.print("Character " + ch + " is a vowel");
			break;
		default:
			Task3.print("Character " + ch + " is not a vowel");
		}
	}
	
	static void isVowel2 (char ch) {
		label:
		{
		while ((ch!='a')&(ch!='e')&(ch!='i')&(ch!='o')&(ch!='u')) {
			Task3.print("Character " + ch + " is not a vowel");
			break label;
		}
		Task3.print("Character " + ch + " is a vowel");
		}
	}
	
	static void isVowel3 (char ch) {
		if((ch!='a')&(ch!='e')&(ch!='i')&(ch!='o')&(ch!='u')) {
			Task3.print("Character " + ch + " is not a vowel");
		}else {
			Task3.print("Character " + ch + " is a vowel");
		}
	}
	
	static void moodSensor() {
		char ch = '\u2639';
		char ch1 = '\u2620';
		char ch2 = '\u263A';
		char ch3 = '\u2665';
		char ch4 = '\u2615';
		char ch5 = '\u266A';
		Task3.print("Your mood today is: ");
		int rand = (int) (Math.random() * 6);
		switch (rand) {
			case 0:
				Task3.print(ch);
				break;
			case 1:
				Task3.print(ch1);
				break;
			case 2:
				Task3.print(ch2);
				break;
			case 3:
				Task3.print(ch3);
				break;
			case 4:
				Task3.print(ch4);
				break;
			case 5:
				Task3.print(ch5);
				break;
		}
	}
	
	static void nextDay (int day, int month, int year) {

			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 30) {
					day +=1;
				} else {
					day = 1;
					month +=1;
				}
			} else if (month == 2) {
				if (year%4 != 0 & year%100 != 0 & year%400 != 0) {
					if (day < 28) {
						day +=1;
					} else {
						day = 1;
						month +=1;
					}
				}else {
					if (day < 29) {
						day +=1;
					} else {
						day = 1;
						month +=1;
					}
				}
			}else if (month == 12){
				if (day < 31) {
					day +=1;
				} else {
					day = 1;
					month =1;
					year +=1;
				}
			}else {
				if (day < 31) {
					day +=1;
				} else {
					day = 1;
					month +=1;
				}
			}
		Task3.print("The next day is " + day + "." + month + "." + year);
	}
	
}
