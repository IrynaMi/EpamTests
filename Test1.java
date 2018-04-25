
public class Test1 {
	
	public static void main(String[] args) {
		Test1.testInt();
		Test1.testDouble();
		Test1.testBoolean();
		Test1.testByte();
		Test1.testChar();
		Test1.testLong();
		Test1.testFloat();
		Test1.testShort();
		
	}
	
	public static void testInt () {
		int a = 54;
		int b = 23;
		int c = 0;
		
		// summ
		int sum = a+b;
		System.out.printf("%d + %d = %d",  a, b, sum);
		
		// substraction
		int sub = b-a;
		System.out.printf("\n%d - %d = %d",  b, a, sub);
		
		// division
		int div = c/a;
		// int div1 = a/c; java.lang.ArithmeticException
		System.out.printf("\n%d : %d = %d",  c, a, div);
		
		//multiplication
		int mult = a*b;
		System.out.printf("\n%d * %d = %d",  a, b, mult);
		
		//modules
		int rem = a%b;
		System.out.printf("\n%d %% %d = %d",  a, b, rem);
	
		// postincrement
		int d = c++;
		System.out.println("\nd = c++ = " + d);
		System.out.println("c = " + c);
		
		// preincrement
		int e = ++c;
		System.out.println("e = ++c = " + e);
		System.out.println("c = " + c);
		
		//assignment
		int z = a;
		System.out.println("z = " + z + "\na = " + a);
		
		//summ with casting
		double x = a+b;
		System.out.println("double x = a+b = " + x);
		System.out.printf("%d + %d = %f", a, b, x);
		
		//combined assignment
		int y = 0;
		y += x;
		System.out.println("int y += x = " + y);
		y <<=2;
		System.out.println("y <<=2 = " + y);
		
		
		//combined operations
		int result = a - ++c * 4 - y;
		System.out.println("a - ++c * 4 - y = " + result);
		
		int result1 = a - c++ * 4 - y;
		System.out.println("a - c++ * 4 - y = " + result1);
		System.out.println("c = " + c);
		
		int k = c++ + b;
		System.out.println("c++ + b = " + k);
		
		//binary NOT
		a = ~b;
		System.out.printf("%d = ~%d", b, a);
		System.out.printf("\nIn Binary form: %s = ~%s", Integer.toBinaryString(b), Integer.toBinaryString(a));
		
		//binary XOR
		c = a^b;
		System.out.printf("\n%d ^ %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s ^ %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//binary AND
		c = a&b;
		System.out.printf("\n%d & %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s & %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//binary OR
		c = a|b;
		System.out.printf("\n%d | %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s | %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//right shift
		c = a>>2;
		System.out.printf("\n%d >> 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//left shift
		c = a<<2;
		System.out.printf("\n%d<< 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s << 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//right shift zero fill
		c = a>>>3;
		System.out.printf("\n%d >>> 3 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 3 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
			
		
	} 
	
	public static void testDouble () {
		double a = 7.0;
		double b = 0.6;
		double c = 0d;
		double f = 0;
		
		// sum
		double sum = a + b;
		System.out.printf("%f + %f = %f",  a, b, sum);
		
		//substraction
		double sub = a - b;
		System.out.printf("\n%f - %f = %f",  a, b, sub);
		
		//division
		double div = a / c;
		System.out.printf("\n%f : %f = %f",  a, c, div);
		double div1 = f/b;
		System.out.printf("\n%f : %f = %f",  f, b, div1);
		
		//multiplication
		double mult = a*b;
		System.out.printf("\n%f * %f = %f",  a, b, mult);
		
		//modules
		double rem = a % b;
		System.out.printf("\n%f %% %f = %f",  a, b, rem);
		
		//preincrement with asssignment
		double d = --a;
		System.out.println("\nd = --a = " + d);
		
		// sum with casting
		int i = (int) (c + b);
		System.out.printf("%f + %f = %d",  c, b, i);
		
		//combinated assignment
		d +=a;
		System.out.println("\nd +=a : " + d);
		
		//unary minus
		f = -a;
		System.out.println("\nf = -a  = " + f);
		
	}
	
	public static void testBoolean () {
		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = false;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// logical OR
		System.out.println("a | b = " + (a | b));
		
		//logical short OR
		System.out.println("a || b = " + (a || b));
		
		// logical XOR
		System.out.println("a ^ b = " + (a ^ b));
		System.out.println("a ^ a = " + (a ^ a));
		
		//logical AND
		System.out.println("a & b = " + (a & b));
		
		//logical short AND
		System.out.println("a && b = " + (a && b));
		
		//assignment
		System.out.println("c = d = " + (c = d));
		
		//logical not
		System.out.println("!d = " + (!d));
		
		// logical XOR with assignment
		System.out.println("b ^= c = " + (b ^= c));
		System.out.println("a ^= c = " + (a ^= c));
		
		// logical AND with assignment
		System.out.println("a &= c = " + (a &= c));
		
		// logical OR with assignment
		System.out.println("a |= c = " + (a |= c));
		
		// logical OR with assignment
		System.out.println("a = c = " + (a |= c));
		
	}
	
	public static void testByte () {
		byte a = 110;
		byte b = 40;
		byte c = 0;
		
		//sum
		byte sum = (byte) (a + b);
		System.out.printf("%d + %d = %d",  a, b, sum);
		
		//predecrement with assignment
		byte d = --c;
		System.out.printf("\nbyte d  = --c = %d",   d);
		
		//postdecrement with assignment
		byte e = c--;
		System.out.printf("\nbyte e  = c-- = %d",   e);
		
		//combinated assignment
		c += b;
		System.out.printf("\nnow byte c  = %d",   c);
		
		//division
		byte div = (byte) (b / a);
		double div1 = a / b; // cast to int
		System.out.printf("\n%d / %d = %d",  b, a, div);
		System.out.printf("\n%d / %d = %f",  a, b, div1);
		
		//binary XOR
		byte z = (byte) (a^b);
		System.out.printf("\n%d ^ %d = %d", a, b, z);
		System.out.printf("\nIn Binary form: %s ^ %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(z));

		//binary OR
		byte x = (byte) (a|b);
		System.out.printf("\n%d | %d = %d", a, b, x);
		System.out.printf("\nIn Binary form: %s | %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(x));
		
		//binary AND
		byte y = (byte) (a&b);
		System.out.printf("\n%d & %d = %d", a, b, y);
		System.out.printf("\nIn Binary form: %s & %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(y));
		
		//binary NOT
		a = (byte) ~b;
		System.out.printf("%d = ~%d", b, a);
		System.out.printf("\nIn Binary form: %s = ~%s", Integer.toBinaryString(b), Integer.toBinaryString(a));
		
		//right shift
		c = (byte) (a>>2);
		System.out.printf("\n%d >> 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
				
		//left shift
		c = (byte) (a<<2);
		System.out.printf("\n%d<< 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s << 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
				
		//right shift zero fill
		c = (byte) (a>>>3);
		System.out.printf("\n%d >>> 3 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 3 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		// multiplication
		byte mult = (byte) (a * b); // потеря данных
		int mult1 =  a * b;
		System.out.printf("\nТИП byte %d * %d = %d",  a, b, mult);
		System.out.printf("\nТИП int %d * %d = %d",  a, b, mult1);
		
		byte k = 30;
		byte l = 20;
		
		//combined operations
		byte m = (byte) ((k++ - l)*2);
		byte n = (byte) ((++k - l)*2);
		System.out.println("\n(k++ - l)*2 = "+  m);
		System.out.println("\n(++k - l)*2 = "+  n);
		
		// bitwise unary compliment
		c = (byte) ~a; 
		System.out.printf("~%d = %d\n", a, c);
		
	}
	
	public static void testShort() {
		short a = 3567;
		short b = 2000;
		short c = 1;
		
		//sum, multiplication, division and increment
		short exp = (short) (a + b * c++ / 2); // в c зафиксировалось 1
		System.out.printf("\n%d + %d * %d : 2 = %d",  a, b, c, exp); // здесь выводится с = 2
		
		//binary XOR
		short exp1 = (short) (c^c);
		System.out.printf("\n%d ^ %d = %d",  c, c, exp1);
		System.out.printf("\nIn Binary form: %s ^ %s = %s", Integer.toBinaryString(c), Integer.toBinaryString(c), Integer.toBinaryString(exp1));
		
		//binary AND
		short exp2 = (short) (b&a);
		System.out.printf("\n%d & %d = %d",  b, a, exp2);
		System.out.printf("\nIn Binary form: %s & %s = %s", Integer.toBinaryString(b), Integer.toBinaryString(a), Integer.toBinaryString(exp2));
		
		//binary OR
		c = (short) (a|b);
		System.out.printf("\n%d | %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s | %s = %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));
		
		//binary NOT
		a = (short) ~b;
		System.out.printf("\n%d = ~%d", b, a);
		System.out.printf("\nIn Binary form: %s = ~%s", Integer.toBinaryString(b), Integer.toBinaryString(a));
		
		//right shift
		c = (short) (a>>2);
		System.out.printf("\n%d >> 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
				
		//left shift
		c = (short) (a<<2);
		System.out.printf("\n%d<< 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s << 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
				
		//right shift zero fill
		c = (short) (a>>>3);
		System.out.printf("\n%d >>> 3 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 3 = %s", Integer.toBinaryString(a), Integer.toBinaryString(c));
		
		//division and postincrement
		short x = 0;
		// short exp3 = (short) (a / x++); деление на 0, ошибка
		short exp3 = (short) (a / ++x);
		System.out.printf("\n%d : %d = %d",  a, x, exp3);
		
		//sum
		char ch = 'a';
		short exp4 = (short) (exp3 + ch);
		System.out.printf("\n%d + %c = %d",  exp3, ch, exp4);
		
		//module
		short exp5 = (short) (exp3 % b);
		System.out.printf("\n%d %% %d = %d",  exp3, b, exp5);
		
		//substaction
		short sub = (short) (b - a);
		System.out.printf("\n%d - %d = %d",  b, a, sub);
	}
	
	public static void testLong() {
		long a = 347657L;
		long b = 987l;
		long c = 43l;
		long d = 0l;
		
		//sum
		long sum = a + c;
		System.out.printf("%d + %d = %d",  a, c, sum);
		
		//substraction
		long sub = a - c;
		System.out.printf("%d - %d = %d",  a, c, sub);
		
		//division
		long div = a / c;
		System.out.printf("%d : %d = %d",  a, c, div);
		
		//module
		long rem = a % b;
		System.out.printf("\n%d %% %d = %d",  a, b, rem);
		int rem1 = (int) (a % b);
		System.out.printf("\n%d %% %d = %d",  a, b, rem1);
		
		//multiplication
		long mult = b * c;
		System.out.printf("\n%d * %d = %d",  b, c, mult);
		
		// long divide = c / d; exception / by zero
		
		//right shift
		long shift = d>>3;
		System.out.printf("\nlong shift = d>>3 = %d",  a, b, shift);
		
		//left shift
		long shift1 = d<<3;
		System.out.printf("\nlong shift = d>>3 = %d",  a, b, shift1);
		
		//summ with automatic casting
		double sum1 = a + b;
		System.out.printf("\n%d + %d = %f",  a, b, sum1);
		
		//postfix increment
		long f = 89l;
		System.out.printf("\n%d++ - = %d",  f, f++);
		
		
		long g =100l;
		//postfix decrement
		System.out.printf("\n%d-- - = %d",  f, f--);
				
		//combinated assignment
		f *= g;
		System.out.printf("\nnow long f  = %d",   f);
		
		//binary NOT
		a = ~b;
		System.out.printf("%d = ~%d", b, a);
		System.out.printf("\nIn Binary form: %s = ~%s", Long.toBinaryString(b), Long.toBinaryString(a));
				
		//binary XOR
		c = a^b;
		System.out.printf("\n%d ^ %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s ^ %s = %s", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
				
		//binary AND
		c = a&b;
		System.out.printf("\n%d & %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s & %s = %s", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
				
		//binary OR
		c = a|b;
		System.out.printf("\n%d | %d = %d", a, b, c);
		System.out.printf("\nIn Binary form: %s | %s = %s", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));
				
		//right shift
		c = a>>2;
		System.out.printf("\n%d >> 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 2 = %s", Long.toBinaryString(a), Long.toBinaryString(c));
				
		//left shift
		c = a<<2;
		System.out.printf("\n%d<< 2 = %d", a, c);
		System.out.printf("\nIn Binary form: %s << 2 = %s", Long.toBinaryString(a), Long.toBinaryString(c));
				
		//right shift zero fill
		c = a>>>3;
		System.out.printf("\n%d >>> 3 = %d", a, c);
		System.out.printf("\nIn Binary form: %s >> 3 = %s", Long.toBinaryString(a), Long.toBinaryString(c));
		
		
	}
	public static void testFloat() {
		float a = 4.56f;
		float b = 2.0f;
		float c = 3.988f;
		float d = 0.54f;
		float e = 0.0f;
		
		//sum with prefix increment
		float sum = ++a +b;
		System.out.printf("\n%f + %f = %f",  a, b, sum);
		
		//sum with postincrement
		float sum1 = b + b++;
		System.out.printf("\n%f + %f = %f",  b, b, sum1);
		
		//substraction
		float sub = b-a;
		System.out.printf("\n%f - %f = %f",  b, a, sub);
		
		//division with postdecrement
		float divide = c-- / d;
		System.out.printf("\n%f : %f = %f",  c, d, divide);
		
		//division with prefix decrement
		float divide1 = --c / d;
		System.out.printf("\n%f : %f = %f",  c, d, divide1);
		
		//combined operation with multiplication, sum and increment
		float mult = a * b + c++;
		System.out.printf("\n%f * %f + %f = %f",  a, b, c, mult);
		
		//module
		float rem = c % b;
		System.out.printf("\n%f %% %f = %f",  c, b, rem);
		
		//combined operation
		float y = (rem + mult) * d--;
		System.out.printf("\n(%f + %f) * %f = %f",  rem, mult, d, y);
		
		//combined assignment with casting
		double assign = 0;
		assign += -(--y);
		System.out.printf("\ndouble assign = %f",  assign);
		
		//combined assignment
		e %= d;
		System.out.printf("\ne %= d = ",  e);
		
		e *= d;
		System.out.printf("\ne *= d = ",  e);
		
		e /= d;
		System.out.printf("\ne /= d = ",  e);
		
		a += b;
		System.out.printf("\na += b = ",  a);
		
		a -= b;
		System.out.printf("\na -= b = ",  a);
		
		
	}
	
	public static void testChar() {
		char a = 'a';
		char b = 'b';
		char c = 0;
		char f = '\u6003';
		char g = '\u5009';
		char h = 1;
		
		//combined assignment
		c += a;
		h *= a;
		System.out.printf("\nc = %c", c);
		System.out.printf("\nh = %c", h);
		
		//sum
		char sum = (char) (a+b);
		System.out.printf("\n%c + %c = %c",  a, b, sum);
		
		//subdtraction
		char sub = (char) (a - b);
		System.out.printf("\n%c - %c = %c",  a, b, sub);
		
		//multiplication
		char mult = (char) (a*b);
		System.out.printf("\n%c * %c = %c",  a, b, mult);
		//multiplication with casting
		int mult1 = a*b;
		System.out.printf("\n%c * %c = %d",  a, b, mult1);
		
		//division
		char divide = (char) (f / g);
		System.out.printf("\n%c / %c = %c",  f, g, divide);
		
		//module
		char mod = (char) (f % g);
		System.out.printf("\n%c %% %c = %c",  f, g, mod);
		
		//increment with assignment
		c = c++;
		System.out.printf("\nc = a++ = " +  a);
		c = ++f;
		System.out.printf("\nc = ++f = " +  c);
		
		//decrement with assignment
		c = b--;
		System.out.printf("\nc = b-- = " +  c);
		c = --b;
		System.out.printf("\nc = --b = " +  c);
		
		//binary NOT
		h = (char) ~a;
		System.out.printf("\nh = (char) ~a = " +  h);
		System.out.printf("\nIn binary form: h = (char) ~a = " +  Integer.toBinaryString(h));
		
		//binary OR
		char j = (char) (h|b);
		System.out.printf("\nj = (char) (h|b) = " +  j);
		System.out.printf("\nIn binary form: j = (char) (h|b) = " +  Integer.toBinaryString(j));
		
		//binary XOR
		char k = (char) (h^j);
		System.out.printf("\nk = (char) (h^j) = " +  k);
		System.out.printf("\nIn binary form: k = (char) (h^j) = " +  Integer.toBinaryString(k));
		
		//binary and
		char l = (char) (h&j);
		System.out.printf("\nl = (char) (h&j) = " +  l);
		System.out.printf("\nIn binary form: l = (char) (h&j) = " +  Integer.toBinaryString(l));
		
		//left shift
		l = (char) (a<<2);
		System.out.printf("\n%c << 2 = %c", a, l);
		System.out.printf("\nIn Binary form: %s << 2 = %s", Integer.toBinaryString(a), Integer.toBinaryString(l));
		
		//right shift
		l = (char) (h>>2);
		System.out.printf("\n%c >> 2 = %c", h, l);
		System.out.printf("\nIn Binary form: %s >> 2 = %s", Integer.toBinaryString(h), Integer.toBinaryString(l));
		
		//right shift zero fill
		l = (char) (j>>>2);
		System.out.printf("\n%c >>> 2 = %c", j, l);
		System.out.printf("\nIn Binary form: %s >> 2 = %s", Integer.toBinaryString(j), Integer.toBinaryString(l));
	}
}
