import java.util.*;

public class RationalDemo {
	
	public static void main (String [] argv) {
			
		String answer  = Console.readString("add, multiply, or compute e? [a/m/e?] (e): ");
		Rational x = new Rational(0,0);
		
		if (answer.equals("a") || answer.equals("m")) {
			int a1 = Console.readInt ("1st numerator : ");
			int b1 = Console.readInt ("1st denominator : ");

			int a2 = Console.readInt ("2nd numerator : ");	
			int b2 = Console.readInt ("2nd denominator : ");

			x = new Rational(a1, b1);			

			if (answer.equals("a")) {
				x = x.add(new Rational(a2, b2));
			}
			
			else {
				x = x.mult(new Rational(a2, b2));
			}
		} 
		
		else {
			x = e();
		}

		System.out.print("Result: ");
		x.show();
		System.out.println();
	}

	
/* natural log function... */
	
	public static Rational e() {
		Rational e = new Rational(2, 1);
		Rational temp = new Rational(1, 1);
		
		float nl = e.num/e.den;
			
		while(Math.abs(2.71-nl) > 0.05) {
			temp.den = e.den;
				
			temp = temp.mult(new Rational(1, e.den + 1)); // calls  mult(Rational x); 
			e = e.add(temp); // calls  add(Rational x); 
			
			nl = (float)e.num/(float)e.den;
		}
			
		return e;
	}
	
}
	
